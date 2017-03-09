package edu.zjucst.quatrabigdata.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.hibernate.Session;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.service.ICrawlerService;
import edu.zjucst.quatrabigdata.service.IMultiThreadRTPrcDBService;
import edu.zjucst.quatrabigdata.service.IRealTimePrcService;
import edu.zjucst.quatrabigdata.utils.URLUtils;

public class MultiThreadRTPrcDBServiceImpl implements IMultiThreadRTPrcDBService{
	static CountDownLatch runningThreadNum = null;
	static List<String> place_symbols = null;
	///////////////////新浪875，腾讯64
	public static int limit = 875;
	public void execute() {
			long time1 = System.currentTimeMillis();
			place_symbols = stockBasicService.getPSInStock(); // 实时数据只选取在市的股票
			
			long time11 = System.currentTimeMillis();
			int len = place_symbols.size();
			System.out.println("长度： "+len);
			
			if(len%limit==0){
				int threadNum = len/limit;
				threadNum*=2;
				runningThreadNum = new CountDownLatch(threadNum);
				for(int i=0;i<len/limit;i++){
					new MyThreadAllDB(i+"+"+limit).start();
					System.out.println(i+"+"+limit);
				}
			}
			else{
				int threadNum=len/limit+1;
				threadNum*=2;
				runningThreadNum = new CountDownLatch(threadNum);
				int i=0;
				for(;i<len/limit;i++){
					new MyThreadAllDB(i+";"+limit).start();
				}
				new MyThreadAllDB(i+";"+(len%limit)).start();
			}
			try {
				runningThreadNum.await();
				long time2 = System.currentTimeMillis();
				System.out.println("时间"+(time2-time1));
				System.out.println("----------"+(time2-time11));
				System.out.println("................."+place_symbols.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}

class MyThreadAllDB extends Thread{
	int index;
	int len;
	public String[] contentSplit = null;	

	public MyThreadAllDB(String string) {
		super(string);
		String[] par = string.split(";");
		index = Integer.parseInt(par[0]);
		len = Integer.parseInt(par[1]);
	}

	public void run(){
		StringBuffer sbPS = new StringBuffer("http://hq.sinajs.cn/list=");
		int sta = index*MultiThreadRTPrcDBServiceImpl.limit;
		for(int i=0;i<len;i++){
			sbPS.append(MultiThreadRTPrcDBServiceImpl.place_symbols.get(sta+i));
			sbPS.append(",");
		}
		String urlFinalString = sbPS.substring(0, sbPS.length()-1);
		String content = URLUtils.getContent(urlFinalString).trim(); // 用URL得到String
		content = content.substring(0,content.length()-1);
		contentSplit = content.split(";");
/////////////////////解析的线程数的改变：1.添加或取消thread前的注释  2.添加或取消线程start前的注释  3.修改threadNum的数字		
		MyRunnableDB f1 = new MyRunnableDB(contentSplit);
		Thread t1 = new Thread(f1,"窗口1");
		Thread t2 = new Thread(f1,"窗口2");
//		Thread t3 = new Thread(f1,"窗口3");
//		Thread t4 = new Thread(f1,"窗口4");
//		Thread t5 = new Thread(f1,"窗口5");
		t1.start();		
		t2.start();		
//		t3.start();
//		t4.start();
//		t5.start();
		
	}
}

class MyRunnableDB implements Runnable {
//	
	private IRealTimePrcService realTimePrcService = (IRealTimePrcService) ServiceProvider
			.getService(IRealTimePrcService.SERVICE_NAME);
	private ICrawlerService crawlerService = (ICrawlerService) ServiceProvider.getService(ICrawlerService.SERVICE_NAME);
	private boolean flag = true;
	private Integer ind = 0;
	private String[] contentSplit = null;
	public MyRunnableDB(String[] st){
		contentSplit = st;
	}
	
	public void run(){
		while(true){
			String sub=null;
			synchronized (this) {
				if(ind<contentSplit.length){
					sub = contentSplit[ind++].trim();
//////////////////////////防止股票从正常到停牌变化时，数据库还没有刷新
					if(sub.length()<30)continue;
				}
				else{
					break;
				}	
			}
			RealTimePrc rtp = crawlerService.genMultiThreadRTPrcObject(sub);
			realTimePrcService.add(rtp);
		}
		MultiThreadRTPrcDBServiceImpl.runningThreadNum.countDown();
	}
	
}


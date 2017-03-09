package edu.zjucst.quatrabigdata.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.service.ICrawlerService;
import edu.zjucst.quatrabigdata.service.IMultiThreadRTPrcPropertiesService;
import edu.zjucst.quatrabigdata.service.IRealTimePrcService;
import edu.zjucst.quatrabigdata.utils.URLUtils;

public class MultiThreadRTPrcPropertiesServiceImpl implements IMultiThreadRTPrcPropertiesService{
	static CountDownLatch runningThreadNum = null;//////////////用来计时
	static List<String> place_symbols = null;
	static Properties p = null;
	///////////////////新浪875，腾讯64
	public static int limit = 875;
	public void execute() {
		p = new Properties();
		InputStream is = MultiThreadRTPrcPropertiesServiceImpl.class.getResourceAsStream("/RealtimePrc.properties");
		OutputStream ot = null;
		try {
			p.load(is);
			ot = new FileOutputStream("src/main/resources/RealtimePrc.properties");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
				
		long time10 = System.currentTimeMillis();
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
				new MyThreadAllProperties(i+"+"+limit).start();
				System.out.println(i+"+"+limit);
			}
		}
		else{
			int threadNum=len/limit+1;
			threadNum*=2;
			runningThreadNum = new CountDownLatch(threadNum);
			int i=0;
			for(;i<len/limit;i++){
				new MyThreadAllProperties(i+";"+limit).start();
			}
			new MyThreadAllProperties(i+";"+(len%limit)).start();
		}
		try {
			runningThreadNum.await();
			p.store(ot, "#");
			p.clear();
			ot.close();
			is.close();
			long time2 = System.currentTimeMillis();
			System.out.println("时间"+(time2-time1));
			System.out.println("----------"+(time2-time11));
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
}

class MyThreadAllProperties extends Thread{
	int index;
	int len;
//	CountDownLatch rNum;
	public String[] contentSplit = null;	

	public MyThreadAllProperties(String string) {
		super(string);
		String[] par = string.split(";");
		index = Integer.parseInt(par[0]);
		len = Integer.parseInt(par[1]);
	}

	public void run(){
		StringBuffer sbPS = new StringBuffer("http://hq.sinajs.cn/list=");
		int sta = index*MultiThreadRTPrcPropertiesServiceImpl.limit;
		for(int i=0;i<len;i++){
			sbPS.append(MultiThreadRTPrcPropertiesServiceImpl.place_symbols.get(sta+i));
			sbPS.append(",");
		}
		String urlFinalString = sbPS.substring(0, sbPS.length()-1);
		String content = URLUtils.getContent(urlFinalString).trim(); // 用URL得到String
		content = content.substring(0,content.length()-1);
		contentSplit = content.split(";");
/////////////////////解析的线程数的改变：1.添加或取消thread前的注释  2.添加或取消线程start前的注释  3.修改threadNum的数字		
		MyRunnableProperties f1 = new MyRunnableProperties(contentSplit);
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

class MyRunnableProperties implements Runnable {
//	
	private IRealTimePrcService realTimePrcService = (IRealTimePrcService) ServiceProvider
			.getService(IRealTimePrcService.SERVICE_NAME);
	private ICrawlerService crawlerService = (ICrawlerService) ServiceProvider.getService(ICrawlerService.SERVICE_NAME);
	private boolean flag = true;
	private Integer ind = 0;
	private String[] contentSplit = null;
	public MyRunnableProperties(String[] st){
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
			MultiThreadRTPrcPropertiesServiceImpl.p.setProperty(sub.substring(11, 19), sub);
		}
		MultiThreadRTPrcPropertiesServiceImpl.runningThreadNum.countDown();
		
	}
	
}



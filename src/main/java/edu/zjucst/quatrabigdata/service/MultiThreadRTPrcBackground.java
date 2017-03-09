package edu.zjucst.quatrabigdata.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.service.IStockBasicService;
import edu.zjucst.quatrabigdata.utils.URLUtils;


public class MultiThreadRTPrcBackground extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static CountDownLatch runningThreadNum = null;
	static List<String> place_symbols = null;
	static IStockBasicService stockBasicService = (IStockBasicService) ServiceProvider
			.getService(IStockBasicService.SERVICE_NAME);
	static String rootPath ;
	///////////////////新浪875，腾讯64
	public static int limit = 800;
	public void init() throws ServletException{
		rootPath = this.getClass().getResource("/").getPath();
//		System.out.println(rootPath);
		TimerTask task = new TimerTask() {  
            @Override  
            public void run() {  
//            	MultiThreadRTPrcBackground.execute();
            }  
        };  
        Timer timer = new Timer();  
        long delay = 0;  
        long intevalPeriod = 10 * 1000;  
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
		
	}
	
	protected static void execute() {
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
		int sta = index*MultiThreadRTPrcBackground.limit;
		for(int i=0;i<len;i++){
			sbPS.append(MultiThreadRTPrcBackground.place_symbols.get(sta+i));
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
	private Integer ind = 0;
	private String[] contentSplit = null;
	public MyRunnableDB(String[] st){
		contentSplit = st;
	}
	
	public void run(){
		File file = new File(MultiThreadRTPrcBackground.rootPath+"realtimePrc.txt");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file,true));
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
					bw.append(sub);
					bw.newLine();
					bw.flush();
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			MultiThreadRTPrcBackground.runningThreadNum.countDown();
		}
	}
	
}

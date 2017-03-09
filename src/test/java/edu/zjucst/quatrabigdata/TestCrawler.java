package edu.zjucst.quatrabigdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.model.BasicInfo;
import edu.zjucst.quatrabigdata.model.CapitalFlow;
import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;
import edu.zjucst.quatrabigdata.model.DailyTradeInfo;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.model.StockBasic;
import edu.zjucst.quatrabigdata.service.IBasicInfoService;
import edu.zjucst.quatrabigdata.service.ICapitalFlowService;
import edu.zjucst.quatrabigdata.service.ICorpFinancialInfoService;
import edu.zjucst.quatrabigdata.service.ICrawlerService;
import edu.zjucst.quatrabigdata.service.IDailyTradeInfoService;
import edu.zjucst.quatrabigdata.service.IRealTimePrcService;
import edu.zjucst.quatrabigdata.service.IStockBasicService;
import edu.zjucst.quatrabigdata.service.impl.MultiThreadRTPrcDBServiceImpl;
import edu.zjucst.quatrabigdata.service.impl.MultiThreadRTPrcPropertiesServiceImpl;
import edu.zjucst.quatrabigdata.utils.URLUtils;

public class TestCrawler {

	private IStockBasicService stockBasicService = (IStockBasicService) ServiceProvider
			.getService(IStockBasicService.SERVICE_NAME);
	private IRealTimePrcService realTimePrcService = (IRealTimePrcService) ServiceProvider
			.getService(IRealTimePrcService.SERVICE_NAME);
	private ICapitalFlowService capitalFlowService = (ICapitalFlowService) ServiceProvider
			.getService(ICapitalFlowService.SERVICE_NAME);
	private ICrawlerService crawlerService = (ICrawlerService) ServiceProvider.getService(ICrawlerService.SERVICE_NAME);
	
	private IBasicInfoService basicInfoService = (IBasicInfoService) ServiceProvider
			.getService(IBasicInfoService.SERVICE_NAME);
	private ICorpFinancialInfoService corpFinancialInfoService = (ICorpFinancialInfoService) ServiceProvider
			.getService(ICorpFinancialInfoService.SERVICE_NAME);
	private IDailyTradeInfoService dailyTradeInfoService = (IDailyTradeInfoService) ServiceProvider
		    .getService(IDailyTradeInfoService.SERVICE_NAME);


	/**
	 * insert CorpFinancialInfo table
	 * @throws Exception
	 */
	public void addCorpFinancialInfo() throws Exception {
		Map<String,String> psNameMap = stockBasicService.getPSMapInStock();
		//Iterator<HashMap> it = psNameMap.entrySet().iterator();
		// System.out.println(place_symbolList.get(1));
		for (String ps : psNameMap.keySet()) {
			for (int panelMark = 0; panelMark < 3; panelMark++) {
				String url = crawlerService.genCFIURL(ps, panelMark);
				String name = psNameMap.get(ps);
				List<CorpFinancialInfo> cFIList= crawlerService.genCFIList(url,panelMark,ps,name);
				System.out.println("ok");
				corpFinancialInfoService.addList(cFIList); // 插入数据库
			}
		}
	}
	

	/**
	 * insert BasicInfo table
	 * @throws Exception
	 */
	public void addBasicInfo() throws Exception {
		Map<String,Integer> psStateMap = stockBasicService.getPSStateMap();
		// System.out.println(place_symbolList.get(1));
		for (String ps : psStateMap.keySet()) {
			String url = crawlerService.genBIURL(ps);
			int state = psStateMap.get(ps);
			BasicInfo bi = crawlerService.genBI(url,ps,state);
			basicInfoService.add(bi); // 插入数据库

		}
	}
	
	/**
	 * insert StockBasic table
	 */
	public void addAllStock() {
		List<StockBasic> sBList = crawlerService.genSBList();
		stockBasicService.addList(sBList);
	}

	/**
	 * @param content
	 * 停牌判定标准
	 * @return
	 */
	public boolean chargeStop(String content) {
		String[] strArray = content.split("~");
		// 如果买一价、买一量，买五价、买五量，卖一价、卖一量，卖五价、卖五量都为0，则说明停牌
		if (strArray[9].equals("0.00") && strArray[10].equals("0") && strArray[17].equals("0.00")
				&& strArray[18].equals("0") && strArray[19].equals("0.00") && strArray[20].equals("0")
				&& strArray[27].equals("0.00") && strArray[28].equals("0"))
			return true;
		return false;
	}

	/**
	 * 设置股票状态
	 * 
	 * @throws Exception
	 */
	public void setStockState() throws Exception {
		List<String> place_symbols = stockBasicService.getPlace_symbol();
		String baseURL = "http://qt.gtimg.cn/q=";
		for (String ps : place_symbols) {
			String place_symbol = ps;
			String urlString = baseURL + ps;
			String content = URLUtils.getContent(urlString); // 用URL得到String
			if (content.contains("pv_none_match=1")) { // 退市或未上市，设置stock_basic的state属性为0
				stockBasicService.setStockState(place_symbol.substring(2), 0);
			} else if (chargeStop(content)) { // 停牌
				stockBasicService.setStockState(place_symbol.substring(2), 2);
			} else {
				stockBasicService.setStockState(place_symbol.substring(2), 1); // 在市
			}
		}
	}

	/**
	 * insert CapitalFlowInfo table
	 * @throws Exception
	 */
	public void addCapitalFlowInfo() throws Exception {
		List<String> place_symbolList = stockBasicService.getPSInStock(); // 只取在市的股票
		for (String ps : place_symbolList) {
			CapitalFlow cf = crawlerService.genCapitalFIObject(ps);
			capitalFlowService.add(cf); // 插入数据库
		}
	}
	

    /**
     * insert DailyTradeInfo table
     */
    public void addDailyTradeInfo() {
	List<String> place_symbolList = stockBasicService
		.getPSInStock();
	for (String ps : place_symbolList) {
	    DailyTradeInfo dti = crawlerService.genDailyTradeObject(ps);
	    dailyTradeInfoService.add(dti);
	}
    }

    
	/**
	 * insert RealTimePrc table
	 * @throws Exception
	 */
    public void addRealTimePrc() throws Exception {
		List<String> place_symbols = stockBasicService.getPSInStock(); // 实时数据只选取在市的股票
		for (String ps : place_symbols) {
			RealTimePrc rtp = crawlerService.genRealTimePrcObject(ps);
			realTimePrcService.add(rtp);
		}
	}
    
    /**
	 * insert RealTimePrc properties
	 * @throws Exception
	 */
	public void addMultiThreadRTPrcProperties() throws Exception {
		MultiThreadRTPrcPropertiesServiceImpl rtprc = new MultiThreadRTPrcPropertiesServiceImpl();
		rtprc.execute();
	}
	
	/**
	 * insert RealTimePrc table
	 * @throws Exception
	 */
	public void addMultiThreadRTPrcDB() throws Exception {
		MultiThreadRTPrcDBServiceImpl rtprc = new MultiThreadRTPrcDBServiceImpl();
		rtprc.execute();
	}

	/**
	 * // * http://data.eastmoney.com/tfpxx/
	 * 新的需求，根据该链接中的停牌数据，每天早上爬取一遍，存在数据库（加一个字段；爬取的日期）。。。
	 * ...然后更新stock_basic的state信息
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		TestCrawler c = new TestCrawler();
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
//		    c.addCorpFinancialInfo();
			//c.addMultiThreadRTPrcProperties();
			//c.addMultiThreadRTPrcDB();
			// c.addAllStock();
			// c.setStockState();
			//new MultiThreadRTPrcMemServiceImpl().execute();
			//c.addCapitalFlowInfo();
			IStockBasicService stockBasicService = (IStockBasicService) ServiceProvider
					.getService(IStockBasicService.SERVICE_NAME);
			List<String> place_symbols = stockBasicService.getPSInStock();
			fw = new FileWriter("F:/学习资料/测试文件/get.txt");
			bw = new BufferedWriter(fw);
			for(Iterator<String> s=place_symbols.iterator();s.hasNext();){
				bw.write(s.next()+"\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fw!=null&&bw!=null){
				try {
					
					bw.close();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}

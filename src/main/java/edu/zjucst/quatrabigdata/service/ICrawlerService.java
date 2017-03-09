package edu.zjucst.quatrabigdata.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import edu.zjucst.quatrabigdata.form.StockDetailForm;
import edu.zjucst.quatrabigdata.model.BasicInfo;
import edu.zjucst.quatrabigdata.model.CapitalFlow;
import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;
import edu.zjucst.quatrabigdata.model.DailyTradeInfo;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.model.StockBasic;

public interface ICrawlerService {

	public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.CrawlerSeviceImpl";

	public String genCFIURL(String place_symbol, int panelMark);

	public List<CorpFinancialInfo> genCFIList(String url, int panelMark, String ps,String name);

	public List<CorpFinancialInfo> genFirSecCFIList(String url, int panelMark, String ps,String name)
			throws IOException, ParseException;

	public List<CorpFinancialInfo> genThiCFIList(String url, int panelMark, String ps,String name)
			throws IOException, ParseException;
	
	public String genBIURL(String place_symbol);

	public BasicInfo genBI(String url,String ps,int state) throws IOException;
	
	//getAllStock的URL是固定的
	public List<StockBasic> genSBList();      //从URL读取数据，生成StockBasic数组
	
	public CapitalFlow genCapitalFIObject(String place_symbol);
	
	public RealTimePrc genRealTimePrcObject(String place_symbol);
	
	public StockDetailForm genStockDetail(String place_symbol);
	
	public DailyTradeInfo genDailyTradeObject(String place_symbol);
	
	public RealTimePrc genMultiThreadRTPrcObject(String place_symbol);
}

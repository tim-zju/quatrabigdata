package edu.zjucst.quatrabigdata.web.action;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;

import edu.zjucst.quatrabigdata.form.StockChoiceForm;
import edu.zjucst.quatrabigdata.service.impl.MultiThreadRTPrcDBServiceImpl;
import edu.zjucst.quatrabigdata.utils.URLUtils;

@SuppressWarnings("serial")
// @Namespace("/stock")
@Results({ @Result(name = "show", location = "/showStock.jsp", type = "dispatcher"),
	@Result(name = "mainUI", location = "/mainUI.jsp", type = "dispatcher") })
public class ShowStockAction extends BaseAction { // 只显示basicInfo表，在市的股票，沪A

	private List<StockChoiceForm> stocks1;
	private Properties p;
	private InputStream is;
	private Map m;
	
	@Action("showSH") // 发送的url请求为http://localhost:8080/showhuA.action，执行该action，根据return的字符串跳转到jsp中
	public String showStock() {
		long time10 = System.currentTimeMillis();
		beforeAction();
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			if(s.startsWith("sh")){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		long time11 = System.currentTimeMillis();
		System.out.println("时间："+(time11-time10));
		return "show";
	}
	
	@Action("showSZ")
	public String showShenA(){
		beforeAction();
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			if(s.startsWith("sz")){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showPrice")
	public String showPrice(){
		beforeAction();
		String[] low = (String[])m.get("priceLow");
		String[] up = (String[])m.get("priceUp");
		BigDecimal priceLow = new BigDecimal(low[0]);
		BigDecimal priceUp = new BigDecimal(up[0]);
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			BigDecimal prc = new BigDecimal(strArray[3]);
			if(prc.compareTo(priceLow)==1&&prc.compareTo(priceUp)==-1){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showUp")
	public String showUp(){
		beforeAction();
		String[] low = (String[])m.get("upLow");
		String[] up = (String[])m.get("upUp");
		BigDecimal upLow = new BigDecimal(low[0]);
		BigDecimal upUp = new BigDecimal(up[0]);
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			BigDecimal CurrentPrc = BigDecimal.valueOf(Double.parseDouble(strArray[3]));
			BigDecimal yPrc = BigDecimal.valueOf(Double.parseDouble(strArray[2]));
			BigDecimal Up = (CurrentPrc.subtract(yPrc)).multiply(new BigDecimal(100)).divide(yPrc,3,BigDecimal.ROUND_HALF_UP);
			if(Up.compareTo(upLow)==1&&Up.compareTo(upUp)==-1){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showVolLow")
	public String showVolLow(){
		beforeAction();
		String[] low = (String[])m.get("volLow");
		Integer volLow = Integer.parseInt(low[0]); 
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			int TraddingVol = Integer.parseInt(strArray[8]);
			if(TraddingVol<=volLow){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showVolUp")
	public String showVolUp(){
		beforeAction();
		String[] up = (String[])m.get("volUp");
		Integer volUp = Integer.parseInt(up[0]);
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			int TraddingVol = Integer.parseInt(strArray[8]);
			if(TraddingVol>=volUp){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showVPrcLow")
	public String showVPrcLow(){
		beforeAction();
		String[] low = (String[])m.get("vPrcLow");
		BigDecimal vPrcLow = new BigDecimal(low[0]);
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			BigDecimal TraddingPrc = BigDecimal.valueOf(Double.parseDouble(strArray[9]));
			if(TraddingPrc.compareTo(vPrcLow)==-1){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showVPrcUp")
	public String showVPrcUp(){
		beforeAction();
		String[] up = (String[])m.get("vPrcUp");
		BigDecimal vPrcUp = new BigDecimal(up[0]);
		Set pKey =p.keySet();
		for(Iterator it = pKey.iterator(); it.hasNext();){
			String s = (String)it.next();
			String[] strArray = p.getProperty(s).split(",");
			BigDecimal TraddingPrc = BigDecimal.valueOf(Double.parseDouble(strArray[9]));
			if(TraddingPrc.compareTo(vPrcUp)==1){
				stocks1.add(getStock(strArray));
			}
		}
		afterAction();
		return "show";
	}
	
	@Action("showCookies")
	public String showCookies(){
		List<StockChoiceForm> list = new ArrayList<StockChoiceForm>();
		HttpServletRequest request = (HttpServletRequest) ServletActionContext.getRequest();
		Cookie[] cookies = request.getCookies();
		String req="http://hq.sinajs.cn/list=";
		for(int i=0;i<cookies.length;i++){
			String s = cookies[i].getValue();
			if(s.length()==8){
				req+=s+",";
			}
		}
		req = req.substring(0, req.length()-1);
		String content = URLUtils.getContent(req).trim(); // 用URL得到String
		content = content.substring(0,content.length()-1);
		String[] contentSplit = content.split(";");System.out.println(contentSplit.length);
		for(int i=0;i<contentSplit.length;i++){
			String[] strArray = contentSplit[i].split(",");
			list.add(getStock(strArray));
		}
		//JSONArray jsonArray = JSONArray.parseArray(list);
		//System.out.println(jsonArray);
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(ServletActionContext.HTTP_RESPONSE);
		response.setContentType("application/x-json");
		response.setContentType("text/html;charset=UTF-8");
		try {
			System.out.println(JSON.toJSONString(list));
			response.getWriter().print(JSON.toJSONString(list));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void beforeAction(){
		ActionContext actionContext = ActionContext.getContext();
		m = actionContext.getParameters();
		stocks1 = new ArrayList<StockChoiceForm>();
		p = new Properties();
		is = MultiThreadRTPrcDBServiceImpl.class.getResourceAsStream("/RealtimePrc.properties");
		try {
			p.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void afterAction(){
		p.clear();
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private StockChoiceForm getStock(String[] strArray){
		String n = strArray[0];
		int nameIndex = n.indexOf("\"");
		String Symbol = n.substring(nameIndex-9, nameIndex-1);
		String Name = n.substring(nameIndex+1);
		BigDecimal CurrentPrc = BigDecimal.valueOf(Double.parseDouble(strArray[3]));
		BigDecimal yPrc = BigDecimal.valueOf(Double.parseDouble(strArray[2]));
		BigDecimal Up = (CurrentPrc.subtract(yPrc)).multiply(new BigDecimal(100)).divide(yPrc,3,BigDecimal.ROUND_HALF_UP);
		int TraddingVol = Integer.parseInt(strArray[8]);
		BigDecimal TraddingPrc = BigDecimal.valueOf(Double.parseDouble(strArray[9]));
		StockChoiceForm t = new StockChoiceForm(Symbol,Name,Up,CurrentPrc,TraddingVol,TraddingPrc);
		return t;
	}

	public List<StockChoiceForm> getStocks1() {
		return stocks1;
	}

	public void setStocks1(List<StockChoiceForm> stocks1) {
		this.stocks1 = stocks1;
	}
	

}

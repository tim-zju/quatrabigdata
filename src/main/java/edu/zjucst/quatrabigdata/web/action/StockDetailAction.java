package edu.zjucst.quatrabigdata.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.form.StockDetailForm;
import edu.zjucst.quatrabigdata.service.ICrawlerService;

@SuppressWarnings("serial")
// @Namespace("/stock")
@Results({ @Result(name = "show", location = "/stockDetail.jsp", type = "dispatcher") })
public class StockDetailAction {

    private ICrawlerService crawlerService = (ICrawlerService) ServiceProvider.getService(ICrawlerService.SERVICE_NAME);
    private StockDetailForm stockDetail;
    private String symbol;

    @Action("stockDetail") // 发送的url请求为http://localhost:8080/stockDetail.action，执行该action，根据return的字符串跳转到jsp中
    public String stockDetail() {
        stockDetail = crawlerService.genStockDetail(symbol);
        ActionContext actionContext = ActionContext.getContext();
        actionContext.put("stockDetail", stockDetail);
        System.out.println("before return in stockDetailAction............");
        System.out.println(stockDetail.getSymbol() + "  " + stockDetail.getName());
        return "show";
    }

    public StockDetailForm getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetailForm stockDetail) {
        this.stockDetail = stockDetail;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
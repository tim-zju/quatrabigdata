package edu.zjucst.quatrabigdata.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;
import edu.zjucst.quatrabigdata.model.StockBasic;
import edu.zjucst.quatrabigdata.service.ICorpFinancialInfoService;

@SuppressWarnings("serial")
@Results({ @Result(name = "success", location = "/financeAnalyze.jsp", type = "dispatcher") })
public class CorpFinancialInfoAction {

    private ICorpFinancialInfoService corpFinancialInfoService = (ICorpFinancialInfoService) ServiceProvider
            .getService(ICorpFinancialInfoService.SERVICE_NAME);
    private String symbol;
    List<CorpFinancialInfo> cFInfoArray;
    CorpFinancialInfo cfiObject1;
    CorpFinancialInfo cfiObject2;
    CorpFinancialInfo cfiObject3;
    CorpFinancialInfo cfiObject4;
    CorpFinancialInfo cfiObject5;
    CorpFinancialInfo cfiObject6;
    CorpFinancialInfo cfiObject7;
    CorpFinancialInfo cfiObject8;
    CorpFinancialInfo cfiObject9;

    @Action("inReportDate") // 发送的url请求为……inReportDate.action，执行该action，根据return的字符串跳转到jsp中
    public String getCFIByReportDate() {
        System.out.println("$$$$$$$$$$$$$$inReportDate.action%%%%%%%%%%%%%%%%");
        cFInfoArray = corpFinancialInfoService.getListByReportDate(symbol, 0);
        System.out.println("cFInfoArray size=" + cFInfoArray.size());
        for (CorpFinancialInfo c : cFInfoArray)
            System.out.println(c.getId() + "  " + c.getSymbol());
        cfiObject1 = cFInfoArray.get(0);
        cfiObject2 = cFInfoArray.get(1);
        cfiObject3 = cFInfoArray.get(2);
        cfiObject4 = cFInfoArray.get(3);
        cfiObject5 = cFInfoArray.get(4);
        cfiObject6 = cFInfoArray.get(5);
        cfiObject7 = cFInfoArray.get(6);
        cfiObject8 = cFInfoArray.get(7);
        cfiObject9 = cFInfoArray.get(8);
        return "success";
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<CorpFinancialInfo> getcFInfoArray() {
        return cFInfoArray;
    }

    public void setcFInfoArray(List<CorpFinancialInfo> cFInfoArray) {
        this.cFInfoArray = cFInfoArray;
    }

    public CorpFinancialInfo getCfiObject1() {
        return cfiObject1;
    }

    public void setCfiObject1(CorpFinancialInfo cfiObject1) {
        this.cfiObject1 = cfiObject1;
    }

    public CorpFinancialInfo getCfiObject2() {
        return cfiObject2;
    }

    public void setCfiObject2(CorpFinancialInfo cfiObject2) {
        this.cfiObject2 = cfiObject2;
    }

    public CorpFinancialInfo getCfiObject3() {
        return cfiObject3;
    }

    public void setCfiObject3(CorpFinancialInfo cfiObject3) {
        this.cfiObject3 = cfiObject3;
    }

    public CorpFinancialInfo getCfiObject4() {
        return cfiObject4;
    }

    public void setCfiObject4(CorpFinancialInfo cfiObject4) {
        this.cfiObject4 = cfiObject4;
    }

    public CorpFinancialInfo getCfiObject5() {
        return cfiObject5;
    }

    public void setCfiObject5(CorpFinancialInfo cfiObject5) {
        this.cfiObject5 = cfiObject5;
    }

    public CorpFinancialInfo getCfiObject6() {
        return cfiObject6;
    }

    public void setCfiObject6(CorpFinancialInfo cfiObject6) {
        this.cfiObject6 = cfiObject6;
    }

    public CorpFinancialInfo getCfiObject7() {
        return cfiObject7;
    }

    public void setCfiObject7(CorpFinancialInfo cfiObject7) {
        this.cfiObject7 = cfiObject7;
    }

    public CorpFinancialInfo getCfiObject8() {
        return cfiObject8;
    }

    public void setCfiObject8(CorpFinancialInfo cfiObject8) {
        this.cfiObject8 = cfiObject8;
    }

    public CorpFinancialInfo getCfiObject9() {
        return cfiObject9;
    }

    public void setCfiObject9(CorpFinancialInfo cfiObject9) {
        this.cfiObject9 = cfiObject9;
    }

    // public static void main(String args[]) {
    // CorpFinancialInfoAction c = new CorpFinancialInfoAction();
    // c.getCFIByReportDate();
    // }

}

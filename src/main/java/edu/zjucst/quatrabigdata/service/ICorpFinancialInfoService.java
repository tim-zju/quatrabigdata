package edu.zjucst.quatrabigdata.service;

import java.util.List;

import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;

public interface ICorpFinancialInfoService {

    public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.CorpFinancialInfoServiceImpl";

    public void add(CorpFinancialInfo corpFinancialInfo);

    public void addList(List<CorpFinancialInfo> cFIList);

    public List<CorpFinancialInfo> findAll();

    List<CorpFinancialInfo> getListByReportDate(String symbol, int panelMark);
}

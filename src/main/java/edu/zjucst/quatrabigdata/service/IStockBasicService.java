package edu.zjucst.quatrabigdata.service;

import java.util.List;
import java.util.Map;

import edu.zjucst.quatrabigdata.model.StockBasic;

public interface IStockBasicService {

    public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.StockBasicServiceImpl";

    void add(StockBasic stockBasic);

    List<StockBasic> findAll();

    List<String> getPlace_symbol();
    
    List<String> getPSInStock();
    
    void addList(List<StockBasic> sBList);
    
    List<String> getSymbols();
    
    void setStockState(String symbol, int state );
    
    public Map<String,String> getPSMapInStock();
    
    public Map<String,Integer> getPSStateMap();
    
    List<StockBasic> getHuASBList();
    
    List<StockBasic> getShenASBList();
    
}

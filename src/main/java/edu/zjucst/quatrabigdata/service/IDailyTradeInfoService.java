package edu.zjucst.quatrabigdata.service;

import java.util.List;

import edu.zjucst.quatrabigdata.model.DailyTradeInfo;

public interface IDailyTradeInfoService {
    public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.DailyTradeInfoServiceImpl";

    void add(DailyTradeInfo dailyTradeInfo);

    List<DailyTradeInfo> findAll();
}

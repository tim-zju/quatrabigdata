package edu.zjucst.quatrabigdata.service;

import java.util.List;

import edu.zjucst.quatrabigdata.model.BasicInfo;

public interface IBasicInfoService {
    public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.BasicInfoServiceImpl";

    void add(BasicInfo basicInfo);

    List<BasicInfo> findAll();
    
    BasicInfo findOneBySymbol(String symbol);
}

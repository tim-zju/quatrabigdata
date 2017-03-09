package edu.zjucst.quatrabigdata.service;

import java.util.List;

import edu.zjucst.quatrabigdata.model.CapitalFlow;

public interface ICapitalFlowService {
    public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.CapitalFlowServiceImpl";

    void add(CapitalFlow capitalFlow);

    List<CapitalFlow> findAll();
}

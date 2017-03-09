package edu.zjucst.quatrabigdata.service;

import edu.zjucst.quatrabigdata.model.RealTimePrc;

public interface IRealTimePrcService {

	public final static String SERVICE_NAME = "edu.zju.cst.quatrabigdata.service.RealTimePrcServiceImpl";

	void add(RealTimePrc realTimePrc);

}

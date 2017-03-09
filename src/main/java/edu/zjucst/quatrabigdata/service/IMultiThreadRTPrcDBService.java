package edu.zjucst.quatrabigdata.service;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.service.impl.MultiThreadRTPrcDBServiceImpl;
import edu.zjucst.quatrabigdata.utils.URLUtils;

public interface IMultiThreadRTPrcDBService {
	static IStockBasicService stockBasicService = (IStockBasicService) ServiceProvider
			.getService(IStockBasicService.SERVICE_NAME);
	
	public void execute();

}


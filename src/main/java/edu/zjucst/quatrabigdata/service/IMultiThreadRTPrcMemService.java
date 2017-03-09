package edu.zjucst.quatrabigdata.service;


import edu.zjucst.quatrabigdata.container.ServiceProvider;

public interface IMultiThreadRTPrcMemService {
	static IStockBasicService stockBasicService = (IStockBasicService) ServiceProvider
			.getService(IStockBasicService.SERVICE_NAME);
	
	public void execute();

}


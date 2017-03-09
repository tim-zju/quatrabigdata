package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.IStockBasicDao;
import edu.zjucst.quatrabigdata.model.StockBasic;

@Repository(IStockBasicDao.SERVICE_NAME)
public class StockBasicDaoImpl extends CommonDaoImpl<StockBasic> implements
	IStockBasicDao {

}

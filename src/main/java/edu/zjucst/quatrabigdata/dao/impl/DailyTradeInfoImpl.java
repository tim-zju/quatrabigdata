package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.IDailyTradeInfoDao;
import edu.zjucst.quatrabigdata.model.DailyTradeInfo;

@Repository(IDailyTradeInfoDao.SERVICE_NAME)
public class DailyTradeInfoImpl extends CommonDaoImpl<DailyTradeInfo> implements
	IDailyTradeInfoDao {

}

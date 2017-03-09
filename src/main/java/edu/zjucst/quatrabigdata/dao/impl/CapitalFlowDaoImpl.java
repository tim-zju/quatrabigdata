package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.ICapitalFlowDao;
import edu.zjucst.quatrabigdata.model.CapitalFlow;

@Repository(ICapitalFlowDao.SERVICE_NAME)
public class CapitalFlowDaoImpl extends CommonDaoImpl<CapitalFlow> implements
	ICapitalFlowDao {

}

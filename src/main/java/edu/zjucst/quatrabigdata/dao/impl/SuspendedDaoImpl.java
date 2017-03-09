package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.ISuspendedDao;
import edu.zjucst.quatrabigdata.model.Suspended;

@Repository(ISuspendedDao.SERVICE_NAME)
public class SuspendedDaoImpl extends CommonDaoImpl<Suspended> implements ISuspendedDao{

}

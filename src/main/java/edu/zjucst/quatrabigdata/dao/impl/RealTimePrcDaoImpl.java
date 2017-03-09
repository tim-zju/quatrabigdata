package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.IRealTimePrcDao;
import edu.zjucst.quatrabigdata.model.RealTimePrc;

@Repository(IRealTimePrcDao.SERVICE_NAME)
public class RealTimePrcDaoImpl extends CommonDaoImpl<RealTimePrc> implements IRealTimePrcDao {

}

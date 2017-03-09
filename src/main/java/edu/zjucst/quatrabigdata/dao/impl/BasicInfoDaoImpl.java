package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.IBasicInfoDao;
import edu.zjucst.quatrabigdata.model.BasicInfo;

@Repository(IBasicInfoDao.SERVICE_NAME)
public class BasicInfoDaoImpl extends CommonDaoImpl<BasicInfo> implements IBasicInfoDao {

}

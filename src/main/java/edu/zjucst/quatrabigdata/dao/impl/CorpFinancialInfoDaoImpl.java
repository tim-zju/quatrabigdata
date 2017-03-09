package edu.zjucst.quatrabigdata.dao.impl;

import org.springframework.stereotype.Repository;

import edu.zjucst.quatrabigdata.dao.ICorpFinancialInfoDao;
import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;

@Repository(ICorpFinancialInfoDao.SERVICE_NAME)
public class CorpFinancialInfoDaoImpl extends CommonDaoImpl<CorpFinancialInfo> implements ICorpFinancialInfoDao{

}

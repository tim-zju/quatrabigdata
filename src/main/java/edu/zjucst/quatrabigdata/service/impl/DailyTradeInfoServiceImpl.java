package edu.zjucst.quatrabigdata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.IDailyTradeInfoDao;
import edu.zjucst.quatrabigdata.model.DailyTradeInfo;
import edu.zjucst.quatrabigdata.service.IDailyTradeInfoService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(IDailyTradeInfoService.SERVICE_NAME)
public class DailyTradeInfoServiceImpl implements IDailyTradeInfoService {
    @Resource(name = IDailyTradeInfoDao.SERVICE_NAME)
    private IDailyTradeInfoDao DailyTradeInfoDao;

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
    public void add(DailyTradeInfo dailyTradeInfo) {
	DailyTradeInfoDao.save(dailyTradeInfo);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
    public List<DailyTradeInfo> findAll() {
	return DailyTradeInfoDao.findAllObjects();
    }

}

package edu.zjucst.quatrabigdata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.IBasicInfoDao;
import edu.zjucst.quatrabigdata.model.BasicInfo;
import edu.zjucst.quatrabigdata.service.IBasicInfoService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(IBasicInfoService.SERVICE_NAME)
public class BasicInfoServiceImpl implements IBasicInfoService {
	@Resource(name = IBasicInfoDao.SERVICE_NAME)
	private IBasicInfoDao BasicInfoDao;

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void add(BasicInfo basicInfo) {
		BasicInfoDao.save(basicInfo);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<BasicInfo> findAll() {
		return BasicInfoDao.findAllObjects();
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public BasicInfo findOneBySymbol(String symbol) {
		List<BasicInfo> basicInfoList=findAll();
		BasicInfo returnBasicInfo=null;
		for(BasicInfo b:basicInfoList)
			if(b.getSymbol().equals(symbol))
			{
				returnBasicInfo=b;
				break;
			}
		return returnBasicInfo;
	}
}

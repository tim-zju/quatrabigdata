package edu.zjucst.quatrabigdata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.IRealTimePrcDao;
import edu.zjucst.quatrabigdata.model.RealTimePrc;
import edu.zjucst.quatrabigdata.service.IRealTimePrcService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(IRealTimePrcService.SERVICE_NAME)
public class RealTimePrcServiceImpl implements IRealTimePrcService {

	@Resource(name = IRealTimePrcDao.SERVICE_NAME)
	private IRealTimePrcDao realTimePrcDao;

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void add(RealTimePrc realTimePrc) {
		realTimePrcDao.save(realTimePrc);
	}

}

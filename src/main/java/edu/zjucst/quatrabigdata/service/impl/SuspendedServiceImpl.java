package edu.zjucst.quatrabigdata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.ISuspendedDao;
import edu.zjucst.quatrabigdata.service.ISuspendedService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(ISuspendedService.SERVICE_NAME)
public class SuspendedServiceImpl {

	@Resource(name = ISuspendedDao.SERVICE_NAME)
	private ISuspendedDao suspendedDao;
}

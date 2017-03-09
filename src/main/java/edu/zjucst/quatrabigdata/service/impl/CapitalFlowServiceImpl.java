package edu.zjucst.quatrabigdata.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.ICapitalFlowDao;
import edu.zjucst.quatrabigdata.model.CapitalFlow;
import edu.zjucst.quatrabigdata.service.ICapitalFlowService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(ICapitalFlowService.SERVICE_NAME)
public class CapitalFlowServiceImpl implements ICapitalFlowService {
    @Resource(name = ICapitalFlowDao.SERVICE_NAME)
    private ICapitalFlowDao CapitalFlowDao;

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
    public void add(CapitalFlow capitalFlow) {
	CapitalFlowDao.save(capitalFlow);
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
    public List<CapitalFlow> findAll() {
	return CapitalFlowDao.findAllObjects();
    }

}

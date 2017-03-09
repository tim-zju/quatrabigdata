package edu.zjucst.quatrabigdata.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.ICorpFinancialInfoDao;
import edu.zjucst.quatrabigdata.model.CorpFinancialInfo;
import edu.zjucst.quatrabigdata.service.ICorpFinancialInfoService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(ICorpFinancialInfoService.SERVICE_NAME)
public class CorpFinancialInfoServiceImpl implements ICorpFinancialInfoService{

	@Resource(name = ICorpFinancialInfoDao.SERVICE_NAME)
	private ICorpFinancialInfoDao CorpFinancialInfoDao;
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void add(CorpFinancialInfo corpFinancialInfo){
		CorpFinancialInfoDao.save(corpFinancialInfo);
	}
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<CorpFinancialInfo> findAll(){
		return CorpFinancialInfoDao.findAllObjects();
	}
	
	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void addList(List<CorpFinancialInfo> cFIList){
		for(CorpFinancialInfo cFI : cFIList)
			add(cFI);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<CorpFinancialInfo> getListByReportDate(String symbol,int panelMark) {
		List<CorpFinancialInfo> returnList=new ArrayList<CorpFinancialInfo>();
		Object[] obs=new Object[2];
		obs[0]=symbol.substring(2);
		obs[1]=panelMark;
		returnList=CorpFinancialInfoDao.findObjectsByConditionWithNoPage("and  o.Symbol=?  and  o.PanelMark=?  ", obs); 
		return returnList;
	}
	
//	public static void main(String args[]){
//		CorpFinancialInfoServiceImpl c=new CorpFinancialInfoServiceImpl();
//		c.getListByReportDate("002173", 0);
//	}
}

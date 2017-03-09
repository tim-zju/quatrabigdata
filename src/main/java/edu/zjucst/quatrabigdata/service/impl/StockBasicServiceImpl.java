package edu.zjucst.quatrabigdata.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.zjucst.quatrabigdata.dao.IStockBasicDao;
import edu.zjucst.quatrabigdata.dao.impl.StockBasicDaoImpl;
import edu.zjucst.quatrabigdata.model.StockBasic;
import edu.zjucst.quatrabigdata.service.IStockBasicService;

@SuppressWarnings("restriction")
@Transactional(readOnly = true)
@Service(IStockBasicService.SERVICE_NAME)
public class StockBasicServiceImpl implements IStockBasicService {

	@Resource(name = IStockBasicDao.SERVICE_NAME)
	private IStockBasicDao stockBasicDao;

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void add(StockBasic stockBasic) {
		stockBasicDao.save(stockBasic);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void addList(List<StockBasic> sBList) {
		for (StockBasic sb : sBList)
			add(sb);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<StockBasic> findAll() {
		return stockBasicDao.findAllObjects();
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<String> getPlace_symbol() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		List<String> returnList = new ArrayList<String>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			returnList.add(sb.getPlace_Symbol());
		}
		return returnList;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<String> getPSInStock() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		List<String> returnList = new ArrayList<String>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			if (sb.getState() != null && sb.getState() == 1)
				returnList.add(sb.getPlace_Symbol());
		}
		return returnList;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public Map<String, String> getPSMapInStock() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		Map<String, String> returnMap = new HashMap<String, String>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			if (sb.getState() != null && sb.getState() == 1)
				returnMap.put(sb.getPlace_Symbol(), sb.getName());
		}
		return returnMap;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public Map<String, Integer> getPSStateMap() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			if (sb.getState() != null && sb.getState() == 1)
				returnMap.put(sb.getPlace_Symbol(), sb.getState());
		}
		return returnMap;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<String> getSymbols() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		List<String> returnList = new ArrayList<String>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			returnList.add(sb.getSymbol());
		}
		return returnList;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void setStockState(String symbol, int state) {
		StockBasic stockBasic = stockBasicDao.findObjectById(symbol);
		stockBasic.setState(state);
		stockBasicDao.update(stockBasic); // 更新
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<StockBasic> getHuASBList() {
		List<StockBasic> stockBasicArray = findAll();
		StockBasic sb;
		List<StockBasic> returnList = new ArrayList<StockBasic>();
		for (Iterator<StockBasic> i = stockBasicArray.iterator(); i.hasNext();) {
			sb = i.next();
			if (sb.getSymbol().startsWith("600")) // 上交所A股
				returnList.add(sb);
		}
		return returnList;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public List<StockBasic> getShenASBList() {
		List<StockBasic> stockBasicArray=findAll();
		List<StockBasic> returnList=new ArrayList<StockBasic>();
		for(StockBasic sb:stockBasicArray)
			if(sb.getSymbol().startsWith("000")||sb.getSymbol().startsWith("002"))
				returnList.add(sb);         //深交所A股
		return returnList;
	}
}

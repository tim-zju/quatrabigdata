package edu.zjucst.quatrabigdata.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 股票停牌表  http://data.eastmoney.com/tfpxx/
 * @author apple
 *
 */
@Entity
@Table(name = "suspended", catalog = "stock_db")
public class Suspended {

	@Id
    @GeneratedValue
    private Integer id;
	private Integer SerialNum;
	private String Symbol;
	private String Name;
	private Timestamp SusTime;
	private Timestamp SusDeadlineTime;
	private Timestamp ExReumeTime;
	private String SusPeriod;
	private String SusReason;
	private Date CrawlDate;
	
	public Suspended(){
		
	}
	public Suspended(Integer serialNum, String symbol, String name, Timestamp susTime, Timestamp susDeadlineTime,
			Timestamp exReumeTime, String susPeriod, String susReason, Date crawlDate) {
		super();
		SerialNum = serialNum;
		Symbol = symbol;
		Name = name;
		SusTime = susTime;
		SusDeadlineTime = susDeadlineTime;
		ExReumeTime = exReumeTime;
		SusPeriod = susPeriod;
		SusReason = susReason;
		CrawlDate = crawlDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(Integer serialNum) {
		SerialNum = serialNum;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Timestamp getSusTime() {
		return SusTime;
	}
	public void setSusTime(Timestamp susTime) {
		SusTime = susTime;
	}
	public Timestamp getSusDeadlineTime() {
		return SusDeadlineTime;
	}
	public void setSusDeadlineTime(Timestamp susDeadlineTime) {
		SusDeadlineTime = susDeadlineTime;
	}
	public Timestamp getExReumeTime() {
		return ExReumeTime;
	}
	public void setExReumeTime(Timestamp exReumeTime) {
		ExReumeTime = exReumeTime;
	}
	public String getSusPeriod() {
		return SusPeriod;
	}
	public void setSusPeriod(String susPeriod) {
		SusPeriod = susPeriod;
	}
	public String getSusReason() {
		return SusReason;
	}
	public void setSusReason(String susReason) {
		SusReason = susReason;
	}
	public Date getCrawlDate() {
		return CrawlDate;
	}
	public void setCrawlDate(Date crawlDate) {
		CrawlDate = crawlDate;
	}
	
	
}

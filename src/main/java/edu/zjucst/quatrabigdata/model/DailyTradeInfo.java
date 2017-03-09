package edu.zjucst.quatrabigdata.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daily_trade_info", catalog = "stock_db")
public class DailyTradeInfo {
	
    @Id
    @GeneratedValue
    private int id;
    private String Symbol;
    private String Name;
    private Date Date;
    private BigDecimal Open;
    private BigDecimal High;
    private BigDecimal Low;
    private BigDecimal Close;
    private BigDecimal PreClose;
    private BigDecimal Volume;
    private BigDecimal Amount;
    private BigDecimal EarnRatio;
    private BigDecimal PBRatio;
    private BigDecimal CirMarketVal;
    private BigDecimal TotMarketVal;

    public DailyTradeInfo() {

    }

    public DailyTradeInfo(String symbol, String name, java.util.Date date, BigDecimal open, BigDecimal high,
			BigDecimal low, BigDecimal preClose, BigDecimal volume, BigDecimal amount,
			BigDecimal earnRatio, BigDecimal pBRatio, BigDecimal cirMarketVal, BigDecimal totMarketVal) {
		super();
		Symbol = symbol;
		Name = name;
		Date = date;
		Open = open;
		High = high;
		Low = low;
		//Close = close;
		PreClose = preClose;
		Volume = volume;
		Amount = amount;
		EarnRatio = earnRatio;
		PBRatio = pBRatio;
		CirMarketVal = cirMarketVal;
		TotMarketVal = totMarketVal;
	}

	public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
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

	public Date getDate() {
	return Date;
    }

    public void setDate(Date date) {
	Date = date;
    }

    public BigDecimal getOpen() {
	return Open;
    }

    public void setOpen(BigDecimal open) {
	Open = open;
    }

    public BigDecimal getHigh() {
	return High;
    }

    public void setHigh(BigDecimal high) {
	High = high;
    }

    public BigDecimal getLow() {
	return Low;
    }

    public void setLow(BigDecimal low) {
	Low = low;
    }

    public BigDecimal getClose() {
	return Close;
    }

    public void setClose(BigDecimal close) {
	Close = close;
    }

    public BigDecimal getPreClose() {
	return PreClose;
    }

    public void setPreClose(BigDecimal preClose) {
	PreClose = preClose;
    }

    public BigDecimal getVolume() {
	return Volume;
    }

    public void setVolume(BigDecimal volume) {
	Volume = volume;
    }

    public BigDecimal getAmount() {
	return Amount;
    }

    public void setAmount(BigDecimal amount) {
	Amount = amount;
    }

    public BigDecimal getEarnRatio() {
	return EarnRatio;
    }

    public void setEarnRatio(BigDecimal earnRatio) {
	EarnRatio = earnRatio;
    }

    public BigDecimal getPBRatio() {
	return PBRatio;
    }

    public void setPBRatio(BigDecimal pBRatio) {
	PBRatio = pBRatio;
    }

    public BigDecimal getCirMarketVal() {
	return CirMarketVal;
    }

    public void setCirMarketVal(BigDecimal cirMarketVal) {
	CirMarketVal = cirMarketVal;
    }

    public BigDecimal getTotMarketVal() {
	return TotMarketVal;
    }

    public void setTotMarketVal(BigDecimal totMarketVal) {
	TotMarketVal = totMarketVal;
    }

}

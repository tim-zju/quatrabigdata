package edu.zjucst.quatrabigdata.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capital_flow", catalog = "stock_db")
public class CapitalFlow {

    @Id
    @GeneratedValue
    private int id;
    private String Symbol;
    private BigDecimal MainFlowIn;
    private BigDecimal MainFlowOut;
    private BigDecimal MainNetFlowIn;
    private BigDecimal MainMoneyInOutTotalRate;
    private BigDecimal RetFlowIn;
    private BigDecimal RetFlowOut;
    private BigDecimal RetNetFlowIn;
    private BigDecimal RetMoneyInOutTotalRate;
    private BigDecimal MainRetMoneyInOutTotal;
    private String Name;
    private Date Date;
    private String Unknow1;
    private String Unknow2;

    public CapitalFlow() {

    }

    public CapitalFlow(String symbol, BigDecimal mainFlowIn,
	    BigDecimal mainFlowOut, BigDecimal mainNetFlowIn,
	    BigDecimal mainMoneyInOutTotalRate, BigDecimal retFlowIn,
	    BigDecimal retFlowOut, BigDecimal retNetFlowIn,
	    BigDecimal retMoneyInOutTotalRate,
	    BigDecimal mainRetMoneyInOutTotal, String name, java.util.Date date) {
	super();
	Symbol = symbol;
	MainFlowIn = mainFlowIn;
	MainFlowOut = mainFlowOut;
	MainNetFlowIn = mainNetFlowIn;
	MainMoneyInOutTotalRate = mainMoneyInOutTotalRate;
	RetFlowIn = retFlowIn;
	RetFlowOut = retFlowOut;
	RetNetFlowIn = retNetFlowIn;
	RetMoneyInOutTotalRate = retMoneyInOutTotalRate;
	MainRetMoneyInOutTotal = mainRetMoneyInOutTotal;
	Name = name;
	Date = date;
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

    public BigDecimal getMainFlowIn() {
	return MainFlowIn;
    }

    public void setMainFlowIn(BigDecimal mainFlowIn) {
	MainFlowIn = mainFlowIn;
    }

    public BigDecimal getMainFlowOut() {
	return MainFlowOut;
    }

    public void setMainFlowOut(BigDecimal mainFlowOut) {
	MainFlowOut = mainFlowOut;
    }

    public BigDecimal getMainNetFlowIn() {
	return MainNetFlowIn;
    }

    public void setMainNetFlowIn(BigDecimal mainNetFlowIn) {
	MainNetFlowIn = mainNetFlowIn;
    }

    public BigDecimal getMainMoneyInOutTotalRate() {
	return MainMoneyInOutTotalRate;
    }

    public void setMainMoneyInOutTotalRate(BigDecimal mainMoneyInOutTotalRate) {
	MainMoneyInOutTotalRate = mainMoneyInOutTotalRate;
    }

    public BigDecimal getRetFlowIn() {
	return RetFlowIn;
    }

    public void setRetFlowIn(BigDecimal retFlowIn) {
	RetFlowIn = retFlowIn;
    }

    public BigDecimal getRetFlowOut() {
	return RetFlowOut;
    }

    public void setRetFlowOut(BigDecimal retFlowOut) {
	RetFlowOut = retFlowOut;
    }

    public BigDecimal getRetNetFlowIn() {
	return RetNetFlowIn;
    }

    public void setRetNetFlowIn(BigDecimal retNetFlowIn) {
	RetNetFlowIn = retNetFlowIn;
    }

    public BigDecimal getRetMoneyInOutTotalRate() {
	return RetMoneyInOutTotalRate;
    }

    public void setRetMoneyInOutTotalRate(BigDecimal retMoneyInOutTotalRate) {
	RetMoneyInOutTotalRate = retMoneyInOutTotalRate;
    }

    public BigDecimal getMainRetMoneyInOutTotal() {
	return MainRetMoneyInOutTotal;
    }

    public void setMainRetMoneyInOutTotal(BigDecimal mainRetMoneyInOutTotal) {
	MainRetMoneyInOutTotal = mainRetMoneyInOutTotal;
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

    public String getUnknow1() {
	return Unknow1;
    }

    public void setUnknow1(String unknow1) {
	Unknow1 = unknow1;
    }

    public String getUnknow2() {
	return Unknow2;
    }

    public void setUnknow2(String unknow2) {
	Unknow2 = unknow2;
    }

}

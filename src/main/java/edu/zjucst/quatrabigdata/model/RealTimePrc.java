package edu.zjucst.quatrabigdata.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "realtime_prc", catalog = "stock_db")
public class RealTimePrc {

	@Id
    @GeneratedValue
    private int id;
	private String Symbol;
	private String Name;
	private BigDecimal BuyOnePrc;
	private BigDecimal BuyTwoPrc;
	private BigDecimal BuyThreePrc;
	private BigDecimal BuyFourPrc;
	private BigDecimal BuyFivePrc;
	private BigDecimal SelOnePrc;
	private BigDecimal SelTwoPrc;
	private BigDecimal SelThreePrc;
	private BigDecimal SelFourPrc;
	private BigDecimal SelFivePrc;
	private int BuyOneAmt;
	private int BuyTwoAmt;
	private int BuyThreeAmt;
	private int BuyFourAmt;
	private int BuyFiveAmt;
	private int SelOneAmt;
	private int SelTwoAmt;
	private int SelThreeAmt;
	private int SelFourAmt;
	private int SelFiveAmt;
	private BigDecimal CurrentPrc;
	private BigDecimal AveragePrc;
	private BigDecimal IncreasePrc;
	private BigDecimal Increase;
	private int TraddingVol;
	private BigDecimal TraddingPrc;
	private double Ratio;
	private double TurnoverRate;
	private int BuyVol;
	private int SellVol;
	private double Committee;
	private double CommitteeDiff;
	private Timestamp Time;
	
	public RealTimePrc(){}

	
	public RealTimePrc(String symbol, String name, BigDecimal buyOnePrc, BigDecimal buyTwoPrc, BigDecimal buyThreePrc,
			BigDecimal buyFourPrc, BigDecimal buyFivePrc, BigDecimal selOnePrc, BigDecimal selTwoPrc,
			BigDecimal selThreePrc, BigDecimal selFourPrc, BigDecimal selFivePrc, int buyOneAmt, int buyTwoAmt,
			int buyThreeAmt, int buyFourAmt, int buyFiveAmt, int selOneAmt, int selTwoAmt, int selThreeAmt,
			int selFourAmt, int selFiveAmt, BigDecimal currentPrc, BigDecimal averagePrc, BigDecimal increasePrc,
			BigDecimal increase, int traddingVol, BigDecimal traddingPrc, double ratio, double turnoverRate, int buyVol,
			int sellVol, double committee, double committeeDiff, Timestamp time) {
		super();
		Symbol = symbol;
		Name = name;
		BuyOnePrc = buyOnePrc;
		BuyTwoPrc = buyTwoPrc;
		BuyThreePrc = buyThreePrc;
		BuyFourPrc = buyFourPrc;
		BuyFivePrc = buyFivePrc;
		SelOnePrc = selOnePrc;
		SelTwoPrc = selTwoPrc;
		SelThreePrc = selThreePrc;
		SelFourPrc = selFourPrc;
		SelFivePrc = selFivePrc;
		BuyOneAmt = buyOneAmt;
		BuyTwoAmt = buyTwoAmt;
		BuyThreeAmt = buyThreeAmt;
		BuyFourAmt = buyFourAmt;
		BuyFiveAmt = buyFiveAmt;
		SelOneAmt = selOneAmt;
		SelTwoAmt = selTwoAmt;
		SelThreeAmt = selThreeAmt;
		SelFourAmt = selFourAmt;
		SelFiveAmt = selFiveAmt;
		CurrentPrc = currentPrc;
		AveragePrc = averagePrc;
		IncreasePrc = increasePrc;
		Increase = increase;
		TraddingVol = traddingVol;
		TraddingPrc = traddingPrc;
		Ratio = ratio;
		TurnoverRate = turnoverRate;
		BuyVol = buyVol;
		SellVol = sellVol;
		Committee = committee;
		CommitteeDiff = committeeDiff;
		Time = time;
	}

	

	public RealTimePrc(String symbol, String name, BigDecimal buyOnePrc, BigDecimal buyTwoPrc,
			BigDecimal buyThreePrc, BigDecimal buyFourPrc, BigDecimal buyFivePrc, BigDecimal selOnePrc,
			BigDecimal selTwoPrc, BigDecimal selThreePrc, BigDecimal selFourPrc, BigDecimal selFivePrc, int buyOneAmt,
			int buyTwoAmt, int buyThreeAmt, int buyFourAmt, int buyFiveAmt, int selOneAmt, int selTwoAmt,
			int selThreeAmt, int selFourAmt, int selFiveAmt, BigDecimal currentPrc, BigDecimal increasePrc,
			BigDecimal increase, int traddingVol, BigDecimal traddingPrc, double turnoverRate, int buyVol, int sellVol,
			Timestamp time) {
		super();
		Symbol = symbol;
		Name = name;
		BuyOnePrc = buyOnePrc;
		BuyTwoPrc = buyTwoPrc;
		BuyThreePrc = buyThreePrc;
		BuyFourPrc = buyFourPrc;
		BuyFivePrc = buyFivePrc;
		SelOnePrc = selOnePrc;
		SelTwoPrc = selTwoPrc;
		SelThreePrc = selThreePrc;
		SelFourPrc = selFourPrc;
		SelFivePrc = selFivePrc;
		BuyOneAmt = buyOneAmt;
		BuyTwoAmt = buyTwoAmt;
		BuyThreeAmt = buyThreeAmt;
		BuyFourAmt = buyFourAmt;
		BuyFiveAmt = buyFiveAmt;
		SelOneAmt = selOneAmt;
		SelTwoAmt = selTwoAmt;
		SelThreeAmt = selThreeAmt;
		SelFourAmt = selFourAmt;
		SelFiveAmt = selFiveAmt;
		CurrentPrc = currentPrc;
		IncreasePrc = increasePrc;
		Increase = increase;
		TraddingVol = traddingVol;
		TraddingPrc = traddingPrc;
		TurnoverRate = turnoverRate;
		BuyVol = buyVol;
		SellVol = sellVol;
		Time = time;
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

	public BigDecimal getBuyOnePrc() {
		return BuyOnePrc;
	}

	public void setBuyOnePrc(BigDecimal buyOnePrc) {
		BuyOnePrc = buyOnePrc;
	}

	public BigDecimal getBuyTwoPrc() {
		return BuyTwoPrc;
	}

	public void setBuyTwoPrc(BigDecimal buyTwoPrc) {
		BuyTwoPrc = buyTwoPrc;
	}

	public BigDecimal getBuyThreePrc() {
		return BuyThreePrc;
	}

	public void setBuyThreePrc(BigDecimal buyThreePrc) {
		BuyThreePrc = buyThreePrc;
	}

	public BigDecimal getBuyFourPrc() {
		return BuyFourPrc;
	}

	public void setBuyFourPrc(BigDecimal buyFourPrc) {
		BuyFourPrc = buyFourPrc;
	}

	public BigDecimal getBuyFivePrc() {
		return BuyFivePrc;
	}

	public void setBuyFivePrc(BigDecimal buyFivePrc) {
		BuyFivePrc = buyFivePrc;
	}

	public BigDecimal getSelOnePrc() {
		return SelOnePrc;
	}

	public void setSelOnePrc(BigDecimal selOnePrc) {
		SelOnePrc = selOnePrc;
	}

	public BigDecimal getSelTwoPrc() {
		return SelTwoPrc;
	}

	public void setSelTwoPrc(BigDecimal selTwoPrc) {
		SelTwoPrc = selTwoPrc;
	}

	public BigDecimal getSelThreePrc() {
		return SelThreePrc;
	}

	public void setSelThreePrc(BigDecimal selThreePrc) {
		SelThreePrc = selThreePrc;
	}

	public BigDecimal getSelFourPrc() {
		return SelFourPrc;
	}

	public void setSelFourPrc(BigDecimal selFourPrc) {
		SelFourPrc = selFourPrc;
	}

	public BigDecimal getSelFivePrc() {
		return SelFivePrc;
	}

	public void setSelFivePrc(BigDecimal selFivePrc) {
		SelFivePrc = selFivePrc;
	}

	public int getBuyOneAmt() {
		return BuyOneAmt;
	}

	public void setBuyOneAmt(int buyOneAmt) {
		BuyOneAmt = buyOneAmt;
	}

	public int getBuyTwoAmt() {
		return BuyTwoAmt;
	}

	public void setBuyTwoAmt(int buyTwoAmt) {
		BuyTwoAmt = buyTwoAmt;
	}

	public int getBuyThreeAmt() {
		return BuyThreeAmt;
	}

	public void setBuyThreeAmt(int buyThreeAmt) {
		BuyThreeAmt = buyThreeAmt;
	}

	public int getBuyFourAmt() {
		return BuyFourAmt;
	}

	public void setBuyFourAmt(int buyFourAmt) {
		BuyFourAmt = buyFourAmt;
	}

	public int getBuyFiveAmt() {
		return BuyFiveAmt;
	}

	public void setBuyFiveAmt(int buyFiveAmt) {
		BuyFiveAmt = buyFiveAmt;
	}

	public int getSelOneAmt() {
		return SelOneAmt;
	}

	public void setSelOneAmt(int selOneAmt) {
		SelOneAmt = selOneAmt;
	}

	public int getSelTwoAmt() {
		return SelTwoAmt;
	}

	public void setSelTwoAmt(int selTwoAmt) {
		SelTwoAmt = selTwoAmt;
	}

	public int getSelThreeAmt() {
		return SelThreeAmt;
	}

	public void setSelThreeAmt(int selThreeAmt) {
		SelThreeAmt = selThreeAmt;
	}

	public int getSelFourAmt() {
		return SelFourAmt;
	}

	public void setSelFourAmt(int selFourAmt) {
		SelFourAmt = selFourAmt;
	}

	public int getSelFiveAmt() {
		return SelFiveAmt;
	}

	public void setSelFiveAmt(int selFiveAmt) {
		SelFiveAmt = selFiveAmt;
	}

	public BigDecimal getCurrentPrc() {
		return CurrentPrc;
	}

	public void setCurrentPrc(BigDecimal currentPrc) {
		CurrentPrc = currentPrc;
	}

	public BigDecimal getAveragePrc() {
		return AveragePrc;
	}

	public void setAveragePrc(BigDecimal averagePrc) {
		AveragePrc = averagePrc;
	}

	public BigDecimal getIncreasePrc() {
		return IncreasePrc;
	}

	public void setIncreasePrc(BigDecimal increasePrc) {
		IncreasePrc = increasePrc;
	}

	public BigDecimal getIncrease() {
		return Increase;
	}

	public void setIncrease(BigDecimal increase) {
		Increase = increase;
	}

	public int getTraddingVol() {
		return TraddingVol;
	}

	public void setTraddingVol(int traddingVol) {
		TraddingVol = traddingVol;
	}

	public BigDecimal getTraddingPrc() {
		return TraddingPrc;
	}

	public void setTraddingPrc(BigDecimal traddingPrc) {
		TraddingPrc = traddingPrc;
	}

	public double getRatio() {
		return Ratio;
	}

	public void setRatio(double ratio) {
		Ratio = ratio;
	}

	public double getTurnoverRate() {
		return TurnoverRate;
	}

	public void setTurnoverRate(double turnoverRate) {
		TurnoverRate = turnoverRate;
	}

	public int getBuyVol() {
		return BuyVol;
	}

	public void setBuyVol(int buyVol) {
		BuyVol = buyVol;
	}

	public int getSellVol() {
		return SellVol;
	}

	public void setSellVol(int sellVol) {
		SellVol = sellVol;
	}

	public double getCommittee() {
		return Committee;
	}

	public void setCommittee(double committee) {
		Committee = committee;
	}

	public double getCommitteeDiff() {
		return CommitteeDiff;
	}

	public void setCommitteeDiff(double committeeDiff) {
		CommitteeDiff = committeeDiff;
	}

	public Timestamp getTime() {
		return Time;
	}

	public void setTime(Timestamp time) {
		Time = time;
	}
	
	


}

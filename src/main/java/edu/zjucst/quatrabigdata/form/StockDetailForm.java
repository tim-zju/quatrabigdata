package edu.zjucst.quatrabigdata.form;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class StockDetailForm {

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
	//private BigDecimal AveragePrc;
	private BigDecimal IncreasePrc;
	private BigDecimal Increase;//涨幅
	private int TraddingVol;//成交量
	private BigDecimal TraddingPrc;//成交额
	//private BigDecimal Ratio;//量比
	private BigDecimal TurnoverRate;
	//private int BuyVol;
	//private int SellVol;
//	private BigDecimal Committee;
//	private int CommitteeDiff;
	private BigDecimal LastPrc;
	private BigDecimal OriginPrc;
	private BigDecimal MaxPrc;
	private BigDecimal MinPrc;
	private BigDecimal CirMarketVal;
    private BigDecimal TotMarketVal;
    private BigDecimal EarnRatio;//市盈率
    private BigDecimal PBRatio;//市净率
    private BigDecimal Amplitude;
	private Timestamp Time;
    public StockDetailForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public StockDetailForm(String symbol, String name, BigDecimal buyOnePrc, BigDecimal buyTwoPrc,
            BigDecimal buyThreePrc, BigDecimal buyFourPrc, BigDecimal buyFivePrc, BigDecimal selOnePrc,
            BigDecimal selTwoPrc, BigDecimal selThreePrc, BigDecimal selFourPrc, BigDecimal selFivePrc, int buyOneAmt,
            int buyTwoAmt, int buyThreeAmt, int buyFourAmt, int buyFiveAmt, int selOneAmt, int selTwoAmt,
            int selThreeAmt, int selFourAmt, int selFiveAmt, BigDecimal currentPrc, BigDecimal increasePrc,
            BigDecimal increase, int traddingVol, BigDecimal traddingPrc, BigDecimal turnoverRate, BigDecimal lastPrc, BigDecimal originPrc, BigDecimal maxPrc, BigDecimal minPrc,
            BigDecimal cirMarketVal, BigDecimal totMarketVal, BigDecimal earnRatio, BigDecimal pBRatio,
            BigDecimal amplitude, Timestamp time) {
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
//        Committee = committee;
//        CommitteeDiff = committeeDiff;
        LastPrc = lastPrc;
        OriginPrc = originPrc;
        MaxPrc = maxPrc;
        MinPrc = minPrc;
        CirMarketVal = cirMarketVal;
        TotMarketVal = totMarketVal;
        EarnRatio = earnRatio;
        PBRatio = pBRatio;
        Amplitude = amplitude;
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
    public BigDecimal getTurnoverRate() {
        return TurnoverRate;
    }
    public void setTurnoverRate(BigDecimal turnoverRate) {
        TurnoverRate = turnoverRate;
    }
//    public BigDecimal getCommittee() {
//        return Committee;
//    }
//    public void setCommittee(BigDecimal committee) {
//        Committee = committee;
//    }
//    public int getCommitteeDiff() {
//        return CommitteeDiff;
//    }
//    public void setCommitteeDiff(int committeeDiff) {
//        CommitteeDiff = committeeDiff;
//    }
    public BigDecimal getLastPrc() {
        return LastPrc;
    }
    public void setLastPrc(BigDecimal lastPrc) {
        LastPrc = lastPrc;
    }
    public BigDecimal getOriginPrc() {
        return OriginPrc;
    }
    public void setOriginPrc(BigDecimal originPrc) {
        OriginPrc = originPrc;
    }
    public BigDecimal getMaxPrc() {
        return MaxPrc;
    }
    public void setMaxPrc(BigDecimal maxPrc) {
        MaxPrc = maxPrc;
    }
    public BigDecimal getMinPrc() {
        return MinPrc;
    }
    public void setMinPrc(BigDecimal minPrc) {
        MinPrc = minPrc;
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
    public BigDecimal getAmplitude() {
        return Amplitude;
    }
    public void setAmplitude(BigDecimal amplitude) {
        Amplitude = amplitude;
    }
    public Timestamp getTime() {
        return Time;
    }
    public void setTime(Timestamp time) {
        Time = time;
    }
	
    
}

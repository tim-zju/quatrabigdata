package edu.zjucst.quatrabigdata.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "corp_financial_info", catalog = "stock_db")
public class CorpFinancialInfo {
	
    @Id
    @GeneratedValue
    private int id;
    private String Symbol;
    private String Name;
    private Date CFIDate;	
    private int PanelMark;  //0\1\2
    private String BasicPrfPerShare;
    private String BucklePrfPerShare;
    private String DilutePrfPerShare;
    private String NetAssetPerShare;
    private String PrvdFundPerShare;
    private String UnassgnPrfPerShare;
    private String OprtCashFlowPerShare;
    private String OprtIncome;
    private String GrossPrf;
    private String AttriNetPrf;
    private String BuckleNetPrf;
    private String OprtIncYoY;
    private String AttriNetPrfYoY;
    private String BuckleNetPrfYoY;
	private String OprtIncRolMoM;
    private String AttriNetPrfRolMoM;
    private String BuckleNetPrfRolMoM;
    private String WeiNetAstRateOfRtn;
    private String DiluNetAstRateOfRtn;
    private String DiluTotAstRateOfRtn;
    private String GrossMargin;
    private String NetMargin;
    private String AtlTaxRate;
    private String AdvRcpt_OprtInc;
    private String SaleCashFlow_OprtInc;
    private String OprtCashFlow_OprtInc;
    private String TotAstTrnvRate;
    private String RcvbTrnvDays;
    private String StockTrnvDays;
    private String AstLiabRatio;
    private String CrrtLiab_TotLiab;
    private String CrrtRatio;
    private String QuickRatio;
    public CorpFinancialInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CorpFinancialInfo(String symbol, String name, Date cFIDate, int panelMark, String basicPrfPerShare,
			String bucklePrfPerShare, String dilutePrfPerShare, String netAssetPerShare, String prvdFundPerShare,
			String unassgnPrfPerShare, String oprtCashFlowPerShare, String oprtIncome, String grossPrf,
			String attriNetPrf, String buckleNetPrf, String oprtIncYoY, String attriNetPrfYoY, String buckleNetPrfYoY,
			String oprtIncRolMoM, String attriNetPrfRolMoM, String buckleNetPrfRolMoM, String weiNetAstRateOfRtn,
			String diluNetAstRateOfRtn, String diluTotAstRateOfRtn, String grossMargin, String netMargin,
			String atlTaxRate, String advRcpt_OprtInc, String saleCashFlow_OprtInc, String oprtCashFlow_OprtInc,
			String totAstTrnvRate, String rcvbTrnvDays, String stockTrnvDays, String astLiabRatio,
			String crrtLiab_TotLiab, String crrtRatio, String quickRatio) {
		super();
		Symbol = symbol;
		Name = name;
		CFIDate = cFIDate;
		PanelMark = panelMark;
		BasicPrfPerShare = basicPrfPerShare;
		BucklePrfPerShare = bucklePrfPerShare;
		DilutePrfPerShare = dilutePrfPerShare;
		NetAssetPerShare = netAssetPerShare;
		PrvdFundPerShare = prvdFundPerShare;
		UnassgnPrfPerShare = unassgnPrfPerShare;
		OprtCashFlowPerShare = oprtCashFlowPerShare;
		OprtIncome = oprtIncome;
		GrossPrf = grossPrf;
		AttriNetPrf = attriNetPrf;
		BuckleNetPrf = buckleNetPrf;
		OprtIncYoY = oprtIncYoY;
		AttriNetPrfYoY = attriNetPrfYoY;
		BuckleNetPrfYoY = buckleNetPrfYoY;
		OprtIncRolMoM = oprtIncRolMoM;
		AttriNetPrfRolMoM = attriNetPrfRolMoM;
		BuckleNetPrfRolMoM = buckleNetPrfRolMoM;
		WeiNetAstRateOfRtn = weiNetAstRateOfRtn;
		DiluNetAstRateOfRtn = diluNetAstRateOfRtn;
		DiluTotAstRateOfRtn = diluTotAstRateOfRtn;
		GrossMargin = grossMargin;
		NetMargin = netMargin;
		AtlTaxRate = atlTaxRate;
		AdvRcpt_OprtInc = advRcpt_OprtInc;
		SaleCashFlow_OprtInc = saleCashFlow_OprtInc;
		OprtCashFlow_OprtInc = oprtCashFlow_OprtInc;
		TotAstTrnvRate = totAstTrnvRate;
		RcvbTrnvDays = rcvbTrnvDays;
		StockTrnvDays = stockTrnvDays;
		AstLiabRatio = astLiabRatio;
		CrrtLiab_TotLiab = crrtLiab_TotLiab;
		CrrtRatio = crrtRatio;
		QuickRatio = quickRatio;
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

	public Date getCFIDate() {
		return CFIDate;
	}
	public void setCFIDate(Date cFIDate) {
		CFIDate = cFIDate;
	}
	public int getPanelMark() {
		return PanelMark;
	}
	public void setPanelMark(int panelMark) {
		PanelMark = panelMark;
	}
	public String getBasicPrfPerShare() {
		return BasicPrfPerShare;
	}
	public void setBasicPrfPerShare(String basicPrfPerShare) {
		BasicPrfPerShare = basicPrfPerShare;
	}
	public String getBucklePrfPerShare() {
		return BucklePrfPerShare;
	}
	public void setBucklePrfPerShare(String bucklePrfPerShare) {
		BucklePrfPerShare = bucklePrfPerShare;
	}
	public String getDilutePrfPerShare() {
		return DilutePrfPerShare;
	}
	public void setDilutePrfPerShare(String dilutePrfPerShare) {
		DilutePrfPerShare = dilutePrfPerShare;
	}
	public String getNetAssetPerShare() {
		return NetAssetPerShare;
	}
	public void setNetAssetPerShare(String netAssetPerShare) {
		NetAssetPerShare = netAssetPerShare;
	}
	public String getPrvdFundPerShare() {
		return PrvdFundPerShare;
	}
	public void setPrvdFundPerShare(String prvdFundPerShare) {
		PrvdFundPerShare = prvdFundPerShare;
	}
	public String getUnassgnPrfPerShare() {
		return UnassgnPrfPerShare;
	}
	public void setUnassgnPrfPerShare(String unassgnPrfPerShare) {
		UnassgnPrfPerShare = unassgnPrfPerShare;
	}
	public String getOprtCashFlowPerShare() {
		return OprtCashFlowPerShare;
	}
	public void setOprtCashFlowPerShare(String oprtCashFlowPerShare) {
		OprtCashFlowPerShare = oprtCashFlowPerShare;
	}
	public String getOprtIncome() {
		return OprtIncome;
	}
	public void setOprtIncome(String oprtIncome) {
		OprtIncome = oprtIncome;
	}
	public String getGrossPrf() {
		return GrossPrf;
	}
	public void setGrossPrf(String grossPrf) {
		GrossPrf = grossPrf;
	}
	public String getAttriNetPrf() {
		return AttriNetPrf;
	}
	public void setAttriNetPrf(String attriNetPrf) {
		AttriNetPrf = attriNetPrf;
	}
	public String getBuckleNetPrf() {
		return BuckleNetPrf;
	}
	public void setBuckleNetPrf(String buckleNetPrf) {
		BuckleNetPrf = buckleNetPrf;
	}
	public String getOprtIncYoY() {
		return OprtIncYoY;
	}
	public void setOprtIncYoY(String oprtIncYoY) {
		OprtIncYoY = oprtIncYoY;
	}
	public String getAttriNetPrfYoY() {
		return AttriNetPrfYoY;
	}
	public void setAttriNetPrfYoY(String attriNetPrfYoY) {
		AttriNetPrfYoY = attriNetPrfYoY;
	}
	public String getBuckleNetPrfYoY() {
		return BuckleNetPrfYoY;
	}
	public void setBuckleNetPrfYoY(String buckleNetPrfYoY) {
		BuckleNetPrfYoY = buckleNetPrfYoY;
	}
	public String getOprtIncRolMoM() {
		return OprtIncRolMoM;
	}
	public void setOprtIncRolMoM(String oprtIncRolMoM) {
		OprtIncRolMoM = oprtIncRolMoM;
	}
	public String getAttriNetPrfRolMoM() {
		return AttriNetPrfRolMoM;
	}
	public void setAttriNetPrfRolMoM(String attriNetPrfRolMoM) {
		AttriNetPrfRolMoM = attriNetPrfRolMoM;
	}
	public String getBuckleNetPrfRolMoM() {
		return BuckleNetPrfRolMoM;
	}
	public void setBuckleNetPrfRolMoM(String buckleNetPrfRolMoM) {
		BuckleNetPrfRolMoM = buckleNetPrfRolMoM;
	}
	public String getWeiNetAstRateOfRtn() {
		return WeiNetAstRateOfRtn;
	}
	public void setWeiNetAstRateOfRtn(String weiNetAstRateOfRtn) {
		WeiNetAstRateOfRtn = weiNetAstRateOfRtn;
	}
	public String getDiluNetAstRateOfRtn() {
		return DiluNetAstRateOfRtn;
	}
	public void setDiluNetAstRateOfRtn(String diluNetAstRateOfRtn) {
		DiluNetAstRateOfRtn = diluNetAstRateOfRtn;
	}
	public String getDiluTotAstRateOfRtn() {
		return DiluTotAstRateOfRtn;
	}
	public void setDiluTotAstRateOfRtn(String diluTotAstRateOfRtn) {
		DiluTotAstRateOfRtn = diluTotAstRateOfRtn;
	}
	public String getGrossMargin() {
		return GrossMargin;
	}
	public void setGrossMargin(String grossMargin) {
		GrossMargin = grossMargin;
	}
	public String getNetMargin() {
		return NetMargin;
	}
	public void setNetMargin(String netMargin) {
		NetMargin = netMargin;
	}
	public String getAtlTaxRate() {
		return AtlTaxRate;
	}
	public void setAtlTaxRate(String atlTaxRate) {
		AtlTaxRate = atlTaxRate;
	}
	public String getAdvRcpt_OprtInc() {
		return AdvRcpt_OprtInc;
	}
	public void setAdvRcpt_OprtInc(String advRcpt_OprtInc) {
		AdvRcpt_OprtInc = advRcpt_OprtInc;
	}
	public String getSaleCashFlow_OprtInc() {
		return SaleCashFlow_OprtInc;
	}
	public void setSaleCashFlow_OprtInc(String saleCashFlow_OprtInc) {
		SaleCashFlow_OprtInc = saleCashFlow_OprtInc;
	}
	public String getOprtCashFlow_OprtInc() {
		return OprtCashFlow_OprtInc;
	}
	public void setOprtCashFlow_OprtInc(String oprtCashFlow_OprtInc) {
		OprtCashFlow_OprtInc = oprtCashFlow_OprtInc;
	}
	public String getTotAstTrnvRate() {
		return TotAstTrnvRate;
	}
	public void setTotAstTrnvRate(String totAstTrnvRate) {
		TotAstTrnvRate = totAstTrnvRate;
	}
	public String getRcvbTrnvDays() {
		return RcvbTrnvDays;
	}
	public void setRcvbTrnvDays(String rcvbTrnvDays) {
		RcvbTrnvDays = rcvbTrnvDays;
	}
	public String getStockTrnvDays() {
		return StockTrnvDays;
	}
	public void setStockTrnvDays(String stockTrnvDays) {
		StockTrnvDays = stockTrnvDays;
	}
	public String getAstLiabRatio() {
		return AstLiabRatio;
	}
	public void setAstLiabRatio(String astLiabRatio) {
		AstLiabRatio = astLiabRatio;
	}
	public String getCrrtLiab_TotLiab() {
		return CrrtLiab_TotLiab;
	}
	public void setCrrtLiab_TotLiab(String crrtLiab_TotLiab) {
		CrrtLiab_TotLiab = crrtLiab_TotLiab;
	}
	public String getCrrtRatio() {
		return CrrtRatio;
	}
	public void setCrrtRatio(String crrtRatio) {
		CrrtRatio = crrtRatio;
	}
	public String getQuickRatio() {
		return QuickRatio;
	}
	public void setQuickRatio(String quickRatio) {
		QuickRatio = quickRatio;
	}

}

package edu.zjucst.quatrabigdata.form;

import java.math.BigDecimal;

public class StockChoiceForm {
	private String Symbol;
	private String Name;
	private BigDecimal Up;
	private BigDecimal CurrentPrc;
	private int TraddingVol;
	private BigDecimal TraddingPrc;
	
	public StockChoiceForm(String s,String n,BigDecimal u,BigDecimal c,int tv,BigDecimal tp){
		Symbol =s;
		Name = n;
		Up = u;
		CurrentPrc = c;
		TraddingVol = tv;
		TraddingPrc = tp;
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

	public BigDecimal getUp() {
		return Up;
	}

	public void setUp(BigDecimal up) {
		this.Up = up;
	}

	public BigDecimal getCurrentPrc() {
		return CurrentPrc;
	}

	public void setCurrentPrc(BigDecimal currentPrc) {
		CurrentPrc = currentPrc;
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
	
	
	
}

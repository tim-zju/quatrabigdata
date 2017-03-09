package edu.zjucst.quatrabigdata.form;

import java.math.BigDecimal;
import java.util.Date;

public class CorpBasicInfoForm {

	private String Symbol;
	private String Name;
	private String IssueDate;
	private String IssueAmt;
	private BigDecimal IssuePrc;
	private String Category;
	private String Area;
	
	public CorpBasicInfoForm(String symbol, String name, String issueDate, String issueAmt, BigDecimal issuePrc,
			String category, String area) {
		super();
		Symbol = symbol;
		Name = name;
		IssueDate = issueDate;
		IssueAmt = issueAmt;
		IssuePrc = issuePrc;
		Category = category;
		Area = area;
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
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}
	public String getIssueAmt() {
		return IssueAmt;
	}
	public void setIssueAmt(String issueAmt) {
		IssueAmt = issueAmt;
	}
	public BigDecimal getIssuePrc() {
		return IssuePrc;
	}
	public void setIssuePrc(BigDecimal issuePrc) {
		IssuePrc = issuePrc;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	
	
}

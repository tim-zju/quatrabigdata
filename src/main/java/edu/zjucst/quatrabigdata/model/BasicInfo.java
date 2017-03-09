package edu.zjucst.quatrabigdata.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basic_info", catalog = "stock_db")
public class BasicInfo {
	
	@Id
	@GeneratedValue
	private int id;
	private String Symbol;
	private String Name;
	private Date IssueDate;
	private String IssueAmt;
	private BigDecimal IssuePrc;
	private String Issuer;
	private String Category;
	private String Area;
	private Integer State; 
	public BasicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicInfo(String symbol, String name, Date issueDate, String issueAmt, BigDecimal issuePrc, String issuer,
			String category, String area,int state) {
		super();
		Symbol = symbol;
		Name = name;
		IssueDate = issueDate;
		IssueAmt = issueAmt;
		IssuePrc = issuePrc;
		Issuer = issuer;
		Category = category;
		Area = area;
		State = state;
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
	public Date getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(Date issueDate) {
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
	public String getIssuer() {
		return Issuer;
	}
	public void setIssuer(String issuer) {
		Issuer = issuer;
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
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	
}

package edu.zjucst.quatrabigdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_basic", catalog = "stock_db")
public class StockBasic {

    @Id
    private String Symbol;   //只取a股的股票，匹配000、002、60开头的股票代码
    private String Name;
    private String Place;
    private String Place_Symbol;
    private Integer State;       //要使用装箱类型,1表示在市，0表示退市，2表示停牌

    public StockBasic() {

    }

    public StockBasic(String s, String n, String p, String p_s) {

	this.Symbol = s;
	this.Name = n;
	this.Place = p;
	this.Place_Symbol = p_s;
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

    public String getPlace() {
	return Place;
    }

    public void setPlace(String place) {
	Place = place;
    }

    public String getPlace_Symbol() {
	return Place_Symbol;
    }

    public void setPlace_Symbol(String place_Symbol) {
	Place_Symbol = place_Symbol;
    }

	public Integer getState() {
		return State;
	}

	public void setState(Integer state) {
		State = state;
	}
    
}

package edu.zjucst.quatrabigdata.web.action;

import java.text.SimpleDateFormat;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import edu.zjucst.quatrabigdata.container.ServiceProvider;
import edu.zjucst.quatrabigdata.form.CorpBasicInfoForm;
import edu.zjucst.quatrabigdata.model.BasicInfo;
import edu.zjucst.quatrabigdata.service.IBasicInfoService;

@SuppressWarnings("serial")
@Results({ @Result(name = "success", location = "/corporation.jsp", type = "dispatcher") })
public class CorporationAction extends BaseAction {

	private IBasicInfoService basicInfoService = (IBasicInfoService) ServiceProvider
			.getService(IBasicInfoService.SERVICE_NAME);
	private CorpBasicInfoForm corpBasicInfoForm;
	private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Action("corporation") // 发送的url请求为http://localhost:8080/corporation.action，执行该action，根据return的字符串跳转到jsp中
	public String showCorpBasicInfo() {
		System.out.println("In showCorporationBasicInfo");
		BasicInfo basicInfo = basicInfoService.findOneBySymbol(symbol);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String issueDate = sdf.format(basicInfo.getIssueDate());
		corpBasicInfoForm = new CorpBasicInfoForm(basicInfo.getSymbol(), basicInfo.getName(), issueDate,
				basicInfo.getIssueAmt(),basicInfo.getIssuePrc(),basicInfo.getCategory(),basicInfo.getArea());
		return "success";
	}

	public CorpBasicInfoForm getCorpBasicInfoForm() {
		return corpBasicInfoForm;
	}

	public void setCorpBasicInfoForm(CorpBasicInfoForm corpBasicInfoForm) {
		this.corpBasicInfoForm = corpBasicInfoForm;
	}

//	public static void main(String args[]) {
//		CorporationAction corporationAction = new CorporationAction();
//		corporationAction.showCorpBasicInfo();
//	}

}

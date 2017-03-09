<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>StockDetail</title>
<link rel="stylesheet" href="res/css/bootstrap.min.css">
<script src="res/js/jquery.min.js"></script>
<script src="res/js/bootstrap.min.js"></script>
<head lang="en">
<meta charset="UTF-8">
<title>Finance Analyze</title>
<link rel="stylesheet" href="bootstrap.min.css">
<script src="jquery.min.js"></script>
<script src="bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse ">
		<div class="container-fluid">
			<div class="navbar-header">
				<span class="glyphicon glyphicon-asterisk">Brand</span>
			</div>
			<div class="collapse navbar-collapse">
				<form class="navbar-form "></form>
			</div>
		</div>
	</nav>

	<h1 style="margin-left: 550px">公司财务分析</h1>

	<ul class="nav nav-tabs" role="tablist">
		<li role="presentation" class="active"><a href="#m1"
			data-toggle="tab">按报告期</a></li>
		<li role="presentation"><a href="#m2" data-toggle="tab">按年度</a></li>
		<li role="presentation"><a href="#m3" data-toggle="tab">按单季度</a></li>
	</ul>
	<div class="tab-content"
		style="overflow: scroll; height: 450px; width: 1345px;">
		<div class="tab-pane active" id="m1">
			<table class="table table-bordered">
				<thead>
					<tr class="info">
						<th><a href="inReportDate.action">每股指标</a></th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>基本每股收益(元)</td>
						<td><s:property value="cfiObject1.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject2.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject3.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject4.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject5.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject6.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject7.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject8.BasicPrfPerShare" /></td>
						<td><s:property value="cfiObject9.BasicPrfPerShare" /></td>
					</tr>
					<tr>
						<td>扣非每股收益(元)</td>
						<td><s:property value="cfiObject1.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject2.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject3.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject4.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject5.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject6.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject7.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject8.BucklePrfPerShare" /></td>
						<td><s:property value="cfiObject9.BucklePrfPerShare" /></td>
					</tr>
					<tr>
						<td>稀释每股收益(元)</td>
						<td><s:property value="cfiObject1.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject2.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject3.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject4.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject5.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject6.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject7.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject8.DilutePrfPerShare" /></td>
						<td><s:property value="cfiObject9.DilutePrfPerShare" /></td>
					</tr>
					<tr>
						<td>每股净资产(元)</td>
						<td><s:property value="cfiObject1.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject2.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject3.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject4.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject5.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject6.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject7.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject8.NetAssetPerShare" /></td>
						<td><s:property value="cfiObject9.NetAssetPerShare" /></td>
					</tr>
					<tr>
						<td>每股公积金(元)</td>
						<td><s:property value="cfiObject1.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject2.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject3.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject4.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject5.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject6.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject7.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject8.PrvdFundPerShare" /></td>
						<td><s:property value="cfiObject9.PrvdFundPerShare" /></td>
					</tr>
					<tr>
						<td>每股未分配利润(元)</td>
						<td><s:property value="cfiObject1.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject2.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject3.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject4.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject5.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject6.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject7.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject8.UnassgnPrfPerShare" /></td>
						<td><s:property value="cfiObject9.UnassgnPrfPerShare" /></td>
					</tr>
					<tr>
						<td>每股经营现金流(元)</td>
						<td><s:property value="cfiObject1.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject2.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject3.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject4.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject5.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject6.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject7.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject8.OprtCashFlowPerShare" /></td>
						<td><s:property value="cfiObject9.OprtCashFlowPerShare" /></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>成长能力指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>营业收入(元)</td>
						<td><s:property value="cfiObject1.OprtIncome" /></td>
						<td><s:property value="cfiObject2.OprtIncome" /></td>
						<td><s:property value="cfiObject3.OprtIncome" /></td>
						<td><s:property value="cfiObject4.OprtIncome" /></td>
						<td><s:property value="cfiObject5.OprtIncome" /></td>
						<td><s:property value="cfiObject6.OprtIncome" /></td>
						<td><s:property value="cfiObject7.OprtIncome" /></td>
						<td><s:property value="cfiObject8.OprtIncome" /></td>
						<td><s:property value="cfiObject9.OprtIncome" /></td>

					</tr>
					<tr>
						<td>毛利润(元)</td>
						<td><s:property value="cfiObject1.GrossPrf" /></td>
						<td><s:property value="cfiObject2.GrossPrf" /></td>
						<td><s:property value="cfiObject3.GrossPrf" /></td>
						<td><s:property value="cfiObject4.GrossPrf" /></td>
						<td><s:property value="cfiObject5.GrossPrf" /></td>
						<td><s:property value="cfiObject6.GrossPrf" /></td>
						<td><s:property value="cfiObject7.GrossPrf" /></td>
						<td><s:property value="cfiObject8.GrossPrf" /></td>
						<td><s:property value="cfiObject9.GrossPrf" /></td>
					</tr>
					<tr>
						<td>归属净利润(元)</td>
						<td><s:property value="cfiObject1.AttriNetPrf" /></td>
						<td><s:property value="cfiObject2.AttriNetPrf" /></td>
						<td><s:property value="cfiObject3.AttriNetPrf" /></td>
						<td><s:property value="cfiObject4.AttriNetPrf" /></td>
						<td><s:property value="cfiObject5.AttriNetPrf" /></td>
						<td><s:property value="cfiObject6.AttriNetPrf" /></td>
						<td><s:property value="cfiObject7.AttriNetPrf" /></td>
						<td><s:property value="cfiObject8.AttriNetPrf" /></td>
						<td><s:property value="cfiObject9.AttriNetPrf" /></td>
					</tr>
					<tr>
						<td>扣非净利润(元)</td>
						<td><s:property value="cfiObject1.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject2.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject3.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject4.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject5.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject6.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject7.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject8.BuckleNetPrf" /></td>
						<td><s:property value="cfiObject9.BuckleNetPrf" /></td>
					</tr>
					<tr>
						<td>营业收入同比增长(%)</td>
						<td><s:property value="cfiObject1.OprtIncYoY" /></td>
						<td><s:property value="cfiObject2.OprtIncYoY" /></td>
						<td><s:property value="cfiObject3.OprtIncYoY" /></td>
						<td><s:property value="cfiObject4.OprtIncYoY" /></td>
						<td><s:property value="cfiObject5.OprtIncYoY" /></td>
						<td><s:property value="cfiObject6.OprtIncYoY" /></td>
						<td><s:property value="cfiObject7.OprtIncYoY" /></td>
						<td><s:property value="cfiObject8.OprtIncYoY" /></td>
						<td><s:property value="cfiObject9.OprtIncYoY" /></td>
					</tr>
					<tr>
						<td>归属净利润同比增长(%)</td>
						<td><s:property value="cfiObject1.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject2.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject3.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject4.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject5.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject6.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject7.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject8.AttriNetPrfYoY" /></td>
						<td><s:property value="cfiObject9.AttriNetPrfYoY" /></td>
					</tr>
					<tr>
						<td>扣非净利润同比增长(%)</td>
						<td><s:property value="cfiObject1.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject2.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject3.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject4.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject5.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject6.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject7.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject8.BuckleNetPrfYoY" /></td>
						<td><s:property value="cfiObject9.BuckleNetPrfYoY" /></td>
					</tr>
					<tr>
						<td>营业收入滚动环比增长(%)</td>
						<td><s:property value="cfiObject1.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject2.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject3.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject4.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject5.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject6.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject7.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject8.OprtIncRolMoM" /></td>
						<td><s:property value="cfiObject9.OprtIncRolMoM" /></td>
					</tr>
					<tr>
						<td>归属净利润滚动环比增长(%)</td>
						<td><s:property value="cfiObject1.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject2.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject3.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject4.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject5.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject6.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject7.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject8.AttriNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject9.AttriNetPrfRolMoM" /></td>
					</tr>
					<tr>
						<td>扣非净利润滚动环比增长(%)</td>
						<td><s:property value="cfiObject1.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject2.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject3.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject4.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject5.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject6.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject7.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject8.BuckleNetPrfRolMoM" /></td>
						<td><s:property value="cfiObject9.BuckleNetPrfRolMoM" /></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>盈利能力指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>加权净资产收益率(%)</td>
						<td><s:property value="cfiObject1.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject2.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject3.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject4.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject5.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject6.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject7.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject8.WeiNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject9.WeiNetAstRateOfRtn" /></td>
					</tr>
					<tr>
						<td>摊薄净资产收益率(%)</td>
						<td><s:property value="cfiObject1.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject2.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject3.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject4.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject5.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject6.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject7.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject8.DiluNetAstRateOfRtn" /></td>
						<td><s:property value="cfiObject9.DiluNetAstRateOfRtn" /></td>
					</tr>
					<tr>
						<td>摊薄总资产收益率(%)</td>
						<td><s:property value="cfiObject1.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject2.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject3.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject4.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject5.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject6.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject7.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject8.DiluTotAstRateOfRtn" /></td>
						<td><s:property value="cfiObject9.DiluTotAstRateOfRtn" /></td>
					</tr>
					<tr>
						<td>毛利率(%)</td>
						<td><s:property value="cfiObject1.GrossMargin" /></td>
						<td><s:property value="cfiObject2.GrossMargin" /></td>
						<td><s:property value="cfiObject3.GrossMargin" /></td>
						<td><s:property value="cfiObject4.GrossMargin" /></td>
						<td><s:property value="cfiObject5.GrossMargin" /></td>
						<td><s:property value="cfiObject6.GrossMargin" /></td>
						<td><s:property value="cfiObject7.GrossMargin" /></td>
						<td><s:property value="cfiObject8.GrossMargin" /></td>
						<td><s:property value="cfiObject9.GrossMargin" /></td>
					</tr>
					<tr>
						<td>净利率(%)</td>
						<td><s:property value="cfiObject1.NetMargin" /></td>
						<td><s:property value="cfiObject2.NetMargin" /></td>
						<td><s:property value="cfiObject3.NetMargin" /></td>
						<td><s:property value="cfiObject4.NetMargin" /></td>
						<td><s:property value="cfiObject5.NetMargin" /></td>
						<td><s:property value="cfiObject6.NetMargin" /></td>
						<td><s:property value="cfiObject7.NetMargin" /></td>
						<td><s:property value="cfiObject8.NetMargin" /></td>
						<td><s:property value="cfiObject9.NetMargin" /></td>
					</tr>
					<tr>
						<td>实际税率(%)</td>
						<td><s:property value="cfiObject1.AtlTaxRate" /></td>
						<td><s:property value="cfiObject2.AtlTaxRate" /></td>
						<td><s:property value="cfiObject3.AtlTaxRate" /></td>
						<td><s:property value="cfiObject4.AtlTaxRate" /></td>
						<td><s:property value="cfiObject5.AtlTaxRate" /></td>
						<td><s:property value="cfiObject6.AtlTaxRate" /></td>
						<td><s:property value="cfiObject7.AtlTaxRate" /></td>
						<td><s:property value="cfiObject8.AtlTaxRate" /></td>
						<td><s:property value="cfiObject9.AtlTaxRate" /></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>盈利质量指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>预收款/营业收入</td>
						<td><s:property value="cfiObject1.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject2.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject3.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject4.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject5.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject6.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject7.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject8.AdvRcpt_OprtInc" /></td>
						<td><s:property value="cfiObject9.AdvRcpt_OprtInc" /></td>
					</tr>
					<tr>
						<td>销售现金流/营业收入</td>
						<td><s:property value="cfiObject1.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject2.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject3.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject4.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject5.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject6.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject7.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject8.SaleCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject9.SaleCashFlow_OprtInc" /></td>
					</tr>
					<tr>
						<td>经营现金流/营业收入</td>
						<td><s:property value="cfiObject1.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject2.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject3.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject4.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject5.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject6.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject7.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject8.OprtCashFlow_OprtInc" /></td>
						<td><s:property value="cfiObject9.OprtCashFlow_OprtInc" /></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>运营能力指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>总资产周转率(次)</td>
						<td><s:property value="cfiObject1.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject2.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject3.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject4.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject5.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject6.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject7.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject8.TotAstTrnvRate" /></td>
						<td><s:property value="cfiObject9.TotAstTrnvRate" /></td>
					</tr>
					<tr>
						<td>应收账款周转天数(天)</td>
						<td><s:property value="cfiObject1.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject2.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject3.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject4.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject5.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject6.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject7.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject8.RcvbTrnvDays" /></td>
						<td><s:property value="cfiObject9.RcvbTrnvDays" /></td>
					</tr>
					<tr>
						<td>存货周转天数(天)</td>
						<td><s:property value="cfiObject1.StockTrnvDays" /></td>
						<td><s:property value="cfiObject2.StockTrnvDays" /></td>
						<td><s:property value="cfiObject3.StockTrnvDays" /></td>
						<td><s:property value="cfiObject4.StockTrnvDays" /></td>
						<td><s:property value="cfiObject5.StockTrnvDays" /></td>
						<td><s:property value="cfiObject6.StockTrnvDays" /></td>
						<td><s:property value="cfiObject7.StockTrnvDays" /></td>
						<td><s:property value="cfiObject8.StockTrnvDays" /></td>
						<td><s:property value="cfiObject9.StockTrnvDays" /></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>财务风险指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>资产负债率(%)</td>
						<td><s:property value="cfiObject1.AstLiabRatio" /></td>
						<td><s:property value="cfiObject2.AstLiabRatio" /></td>
						<td><s:property value="cfiObject3.AstLiabRatio" /></td>
						<td><s:property value="cfiObject4.AstLiabRatio" /></td>
						<td><s:property value="cfiObject5.AstLiabRatio" /></td>
						<td><s:property value="cfiObject6.AstLiabRatio" /></td>
						<td><s:property value="cfiObject7.AstLiabRatio" /></td>
						<td><s:property value="cfiObject8.AstLiabRatio" /></td>
						<td><s:property value="cfiObject9.AstLiabRatio" /></td>
					</tr>
					<tr>
						<td>流动负债/总负债(%)</td>
						<td><s:property value="cfiObject1.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject2.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject3.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject4.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject5.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject6.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject7.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject8.CrrtLiab_TotLiab" /></td>
						<td><s:property value="cfiObject9.CrrtLiab_TotLiab" /></td>
					</tr>
					<tr>
						<td>流动比率</td>
						<td><s:property value="cfiObject1.CrrtRatio" /></td>
						<td><s:property value="cfiObject2.CrrtRatio" /></td>
						<td><s:property value="cfiObject3.CrrtRatio" /></td>
						<td><s:property value="cfiObject4.CrrtRatio" /></td>
						<td><s:property value="cfiObject5.CrrtRatio" /></td>
						<td><s:property value="cfiObject6.CrrtRatio" /></td>
						<td><s:property value="cfiObject7.CrrtRatio" /></td>
						<td><s:property value="cfiObject8.CrrtRatio" /></td>
						<td><s:property value="cfiObject9.CrrtRatio" /></td>
					</tr>
					<tr>
						<td>速动比率</td>
						<td><s:property value="cfiObject1.QuickRatio" /></td>
						<td><s:property value="cfiObject2.QuickRatio" /></td>
						<td><s:property value="cfiObject3.QuickRatio" /></td>
						<td><s:property value="cfiObject4.QuickRatio" /></td>
						<td><s:property value="cfiObject5.QuickRatio" /></td>
						<td><s:property value="cfiObject6.QuickRatio" /></td>
						<td><s:property value="cfiObject7.QuickRatio" /></td>
						<td><s:property value="cfiObject8.QuickRatio" /></td>
						<td><s:property value="cfiObject9.QuickRatio" /></td>
					</tr>
				</tbody>
			</table>
		</div>

		<div class="tab-pane" id="m2">
			<table class="table table-bordered">
				<thead>
					<tr class="info">
						<th>每股指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>基本每股收益(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非每股收益(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>稀释每股收益(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股净资产(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股公积金(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股未分配利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股经营现金流(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>成长能力指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>营业收入(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>毛利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>营业收入同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>营业收入滚动环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润滚动环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润滚动环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>盈利能力指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>加权净资产收益率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>摊薄净资产收益率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>摊薄总资产收益率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>毛利率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>净利率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>实际税率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>盈利质量指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>预收款/营业收入</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>销售现金流/营业收入</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>经营现金流/营业收入</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>运营能力指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>总资产周转率(次)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>应收账款周转天数(天)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>存货周转天数(天)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>财务风险指标</th>
						<th>14-12-31</th>
						<th>13-12-31</th>
						<th>12-12-31</th>
						<th>11-12-31</th>
						<th>10-12-31</th>
						<th>09-12-31</th>
						<th>08-12-31</th>
						<th>07-12-31</th>
						<th>06-12-31</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>资产负债率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>流动负债/总负债(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>流动比率</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>

		<div class="tab-pane" id="m3">
			<table class="table table-bordered">
				<thead>
					<tr class="info">
						<th>每股指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>基本每股收益(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股净资产(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股公积金(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股未分配利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>每股经营现金流(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>成长能力指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>营业收入(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>毛利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润(元)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>营业收入同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润同比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>营业收入环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>归属净利润环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>扣非净利润环比增长(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>

				<thead>
					<tr class="info">
						<th>盈利能力指标</th>
						<th>15-09-30</th>
						<th>15-06-30</th>
						<th>15-03-31</th>
						<th>14-12-31</th>
						<th>14-09-30</th>
						<th>14-06-30</th>
						<th>14-03-31</th>
						<th>13-12-31</th>
						<th>13-09-30</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>摊薄净资产收益率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>摊薄总资产收益率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>毛利率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>净利率(%)</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<nav class="navbar navbar-inverse navbar-fixed-bottom">
		<div class="container-fluid">
			<div class="navbar-header">
				<span class="glyphicon glyphicon-asterisk">Brand</span>
			</div>
			<div class="collapse navbar-collapse">
				<form class="navbar-form "></form>
			</div>
		</div>
	</nav>

</body>
</html>
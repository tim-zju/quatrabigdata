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


</head>
<body onload="init()">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<span class="glyphicon glyphicon-asterisk">brand</span>
			</div>
			<div class="collapse navbar-collapse"></div>
		</div>
	</nav>

	<div class="container" style="width: 100%">
		<div class="row">
			<div class="col-md-4">
				<div class="input-group" style="margin-left: 50px">
					<input type="text" class="form-control" placeholder="search">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">Search</button>
					</span>
				</div>
			</div>
			<div class=" col-md-offset-11">
				<div class="form-group">
					<button type="button" class="btn btn-default">登录</button>
					<button type="button" class="btn btn-default">注册</button>
				</div>
			</div>
		</div>
	</div>

	<div class="container"
		style="margin-left: 40px; height: 490px; width: 97%;">
		<!--background: red-->
		<div style="width: 70%; height: 100%; float: left;">
			<!--background: green-->
			<label class="sr-only">left</label>
			<div style="width: 100%; height: 40%;">
				<!--background: pink-->
				<label class="sr-only">实时数据</label>
				<div style="width: 20%; height: 100%; float: left;">
					<!--background: peru-->
					<div
						style="width: 100%; height: 20%; color: white; background: blue; text-align: center"
						class="myDiv">
						<!--background: white;-->
						<h2 style="margin-top: 0; margin-bottom: 0; font-size: 20px">
							<s:property value="#stockDetail.Name" />
						</h2>
						<h3 style="margin-top: 0; margin-bottom: 0; font-size: 14px">
							<s:property value="Symbol" />
						</h3>
					</div>
					<div style="width: 100%; height: 80%;" class="myDiv myBack">
						<table class="table">
							<tr>
								<td><s:property value="#stockDetail.CurrentPrc" /></td>
							</tr>
							<tr>
								<td><s:property value="#stockDetail.IncreasePrc" /></td>

								<td><s:property value="#stockDetail.Increase" />%</td>
							</tr>
							<tr>
								<td><s:property value="#stockDetail.Time" /></td>
							</tr>
						</table>
						<!--background: blue;-->
					</div>
				</div>
				<div style="width: 80%; height: 100%; float: right;" class="myDiv">
					<!--background: lightblue-->
					<div style="width: 100%; height: 20%;"></div>
					<!--background: firebrick-->
					<div style="width: 100%; height: 80%;">
						<!--background: rosybrown-->
						<table class="table">
							<tr>
								<th>昨 收：</th>
								<td><s:property value="#stockDetail.LastPrc" /></td>
								<th>今 开：</th>
								<td><s:property value="#stockDetail.OriginPrc" /></td>
								<th>最 高：</th>
								<td><s:property value="#stockDetail.MaxPrc" /></td>
								<th>最 低：</th>
								<td><s:property value="#stockDetail.MinPrc" /></td>
							</tr>
							<tr>
								<th>成交量：</th>
								<td><s:property value="#stockDetail.TraddingVol" />手</td>
								<th>成交额：</th>
								<td><s:property value="#stockDetail.TraddingPrc" />万</td>
								<th>总市值：</th>
								<td><s:property value="#stockDetail.TotMarketVal" />亿</td>
								<th>流通市值：</th>
								<td><s:property value="#stockDetail.CirMarketVal" />亿</td>
							</tr>
							<tr>
								<th>换手率：</th>
								<td><s:property value="#stockDetail.TurnoverRate" />%</td>
								<th>市净率：</th>
								<td><s:property value="#stockDetail.PBRatio" /></td>
								<th>振 幅：</th>
								<td><s:property value="#stockDetail.Amplitude" />%</td>
								<th>市盈率：</th>
								<td><s:property value="#stockDetail.EarnRatio" /></td>
							</tr>
						</table>
					</div>
				</div>
			</div>

			<div style="width: 100%; height: 5%; text-align: center"
				class="myDiv">
				<!--background: white;-->
				<s:url id="url1" action="inReportDate">
					<s:param name="symbol">
						<s:property value="Symbol" />
					</s:param>
				</s:url>
				<s:a href="%{url1}">财务分析</s:a>
				<s:url id="url2" action="corporation">
					<s:param name="symbol">
						<s:property value="Symbol" />
					</s:param>
				</s:url>
				<s:a href="%{url2}">公司概况</s:a>
			</div>

			<div
				style="width: 100%; height: 100%;"
				class="myDiv myBack" id="backImg">
				<!--background: yellow-->
			</div>
		</div>

		<div class="myDiv" style="width: 30%; height: 100%; float: right;">
			<!--background: blue-->
			<label class="sr-only">right</label>
			<ul class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active"><a href="#m1"
					data-toggle="tab">五档盘口</a></li>
				<li role="presentation"><a href="#m2" data-toggle="tab">实时资金流向</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="m1">
					<div>
						<label class="col-md-3">委比</label> <label class="col-md-3"
							style="color: green">--</label> <label class="col-md-3">委差</label>
						<label class="col-md-3" style="color: green">--</label>
					</div>
					<table class="table">
						<tr>
							<th>卖⑤(元/手)</th>
							<td><s:property value="#stockDetail.SelFivePrc" /></td>
							<td><s:property value="#stockDetail.SelFiveAmt" /></td>
						</tr>
						<tr>
							<th>卖④(元/手)</th>
							<td><s:property value="#stockDetail.SelFourPrc" /></td>
							<td><s:property value="#stockDetail.SelFourAmt" /></td>
						</tr>
						<tr>
							<th>卖③(元/手)</th>
							<td><s:property value="#stockDetail.SelThreePrc" /></td>
							<td><s:property value="#stockDetail.SelThreeAmt" /></td>
						</tr>
						<tr>
							<th>卖②(元/手)</th>
							<td><s:property value="#stockDetail.SelTwoPrc" /></td>
							<td><s:property value="#stockDetail.SelTwoAmt" /></td>
						</tr>
						<tr>
							<th>卖①(元/手)</th>
							<td><s:property value="#stockDetail.SelOnePrc" /></td>
							<td><s:property value="#stockDetail.SelOneAmt" /></td>
						</tr>
					</table>
					<div>
						<label class="col-md-6">当前价(元)</label> <label class="col-md-6"
							style="color: red"><s:property
								value="#stockDetail.CurrentPrc" /></label>
					</div>
					<table class="table">
						<tr>
							<th>买①(元/手)</th>
							<td><s:property value="#stockDetail.BuyOnePrc" /></td>
							<td><s:property value="#stockDetail.BuyOneAmt" /></td>
						</tr>
						<tr>
							<th>买②(元/手)</th>
							<td><s:property value="#stockDetail.BuyTwoPrc" /></td>
							<td><s:property value="#stockDetail.BuyTwoAmt" /></td>
						</tr>
						<tr>
							<th>买③(元/手)</th>
							<td><s:property value="#stockDetail.BuyThreePrc" /></td>
							<td><s:property value="#stockDetail.BuyThreeAmt" /></td>
						</tr>
						<tr>
							<th>买④(元/手)</th>
							<td><s:property value="#stockDetail.BuyFourPrc" /></td>
							<td><s:property value="#stockDetail.BuyFourAmt" /></td>
						</tr>
						<tr>
							<th>买⑤(元/手)</th>
							<td><s:property value="#stockDetail.BuyFivePrc" /></td>
							<td><s:property value="#stockDetail.BuyFiveAmt" /></td>
						</tr>
					</table>
				</div>
				<div class="tab-pane" id="m2"></div>
			</div>
		</div>
	</div>

	<nav class="navbar navbar-inverse navbar-fixed-bottom">
		<div class="container-fluid">
			<div class="navbar-header">
				<span class="glyphicon glyphicon-asterisk">brand</span>
			</div>
			<div class="collapse navbar-collapse"></div>
		</div>
	</nav>

	<style>
.rowSpan {
	margin-top: 5px;
	height: 30px;
}
</style>

<script type="text/javascript">
	function init(){
		var symbol = (window.location.search.split("="))[1];
		document.getElementById("backImg").style.backgroundImage="url(\'http://image.sinajs.cn/newchart/daily/n/"+symbol+".gif\')";
	}
</script>

</body>
</html>
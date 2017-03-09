
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%-- <!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Corporation Abstract</title>
<link rel="stylesheet" href="res/css/bootstrap.min.css">
<script src="res/js/jquery.min.js"></script>
<script src="res/js/bootstrap.min.js"></script>
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

	<table class="table table-bordered" style="height: 500px">
		<a href="corporation.action" style="text-decoration: none">show</a>
		<tr>
			<th width="174px">公司名称</th>
			<td><s:property value="corpBasicInfoForm.Name" /></td>
		</tr>
		<tr>
			<th width="174px">英文名称</th>
			<td>-</td>
		</tr>
		<tr>
			<th width="174px">所属行业</th>
			<td><s:property value="corpBasicInfoForm.Area" /></td>
		</tr>
		<tr>
			<th width="174px">所属板块(上海/深圳)</th>
			<td><s:property value="corpBasicInfoForm.Category" /></td>
		</tr>
		<tr>
			<th width="174px">发行人</th>
			<td></td>
		</tr>
		<tr>
			<th width="174px">发行价</th>
			<td><s:property value="corpBasicInfoForm.IssuePrc" /></td>
		</tr>
		<tr>
			<th width="174px">发行量</th>
			<td><s:property value="corpBasicInfoForm.IssueAmt" /></td>
		</tr>
		<tr>
			<th width="174px">发行日期</th>
			<td><s:property value="corpBasicInfoForm.IssueDate" /></td>
		</tr>
	</table>

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
</html> --%>


<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Corporation Abstract</title>
<link rel="stylesheet" href="res/css/bootstrap.min.css">
<script src="res/js/jquery.min.js"></script>
<script src="res/js/bootstrap.min.js"></script>
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

	<h1 style="color: lightskyblue; margin-left: 100px">基本信息</h1>

	<table class="table table-bordered"
		style="height: 500px; width: 80%; margin-left: 100px">
		<a href="corporation.action" style="text-decoration: none">show</a>
		<tr>
			<th width="170px" style="background: darkgrey">公司名称</th>
			<td class="tips-dataL" colspan="3"><s:property value="corpBasicInfoForm.Name" /></td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">英文名称</th>
			<td class="tips-dataL" colspan="3">-</td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">所属行业</th>
			<td class="tips-dataL"><s:property value="corpBasicInfoForm.Area" /></td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">所属板块(上海/深圳)</th>
			<td class="tips-dataL"><s:property value="corpBasicInfoForm.Category" /></td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">发行人</th>
			<td>-</td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">发行价</th>
			<td><s:property value="corpBasicInfoForm.IssuePrc" /></td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">发行量</th>
			<td><s:property value="corpBasicInfoForm.IssueAmt" /></td>
		</tr>
		<tr>
			<th width="170px" style="background: darkgrey">发行日期</th>
			<td><s:property value="corpBasicInfoForm.IssueDate" /></td>
		</tr>
	</table>


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

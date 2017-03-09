<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>StockChoice</title>
    <link rel="stylesheet" href="res/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> -->
	<script src="res/js/jquery.min.js"></script>
	<script src="res/js/bootstrap.min.js"></script>

    <style>
        .navbar .nav > li .dropdown-menu {
            margin: 0;
        }
        .navbar .nav > li:hover .dropdown-menu {
            display: block;
        }
    </style>

</head>
<body onload="init()">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <span class="glyphicon glyphicon-asterisk">brand</span>
            </div>
            <div class="collapse navbar-collapse">

            </div>
        </div>
    </nav>

    <nav class="navbar navbar-default">
        <h1>选股器</h1>
    </nav>

    <div style="width:1345px;height:460px;margin-top: -10px;margin-left: 10px;margin-right:10px"><!--background: blue;-->
        <div style="width: 100%;height:15%; "><!--background: red-->
            <nav style="background: #bce8f1" class="navbar navbar-default">
                <div class=" container-fluid" >
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a href="#">股票范围</a>
                                <ul class="dropdown-menu">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <li style="margin-left:20px"><a href="showSHMem.action" style="text-decoration:none">沪A</a></li>
                                        </div>
                                        <div class="col-sm-3>">
                                            <li ><a href="showSZMem.action" style="text-decoration:none">深A</a></li>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">价格</a>
                                <ul class="dropdown-menu" style="width:250px">
	                                <form action="showPriceMem.action" name="submitPrice">
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" name="priceLow" id="priceLow">
	                                     <label>-</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 20px" name="priceUp" id="priceUp">
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkPrice()">确定</button>
	                                </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">涨幅</a>
                                <ul class="dropdown-menu" style="width:250px">
                                	<form action="showUpMem.action" name="submitUp">
	                                    <input type="text" size="3" style="margin-left: 10px;" name="upLow" id="upLow">
	                                    <label>%&nbsp;-</label>
	                                    <input type="text" size="3" style="margin-left: 10px;" name="upUp" id="upUp">
	                                    <label>%</label>
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkUp()">确定</button>
                                    </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">成交量</a>
                                <ul class="dropdown-menu" style="width:230px;">
                                	<form action="showVolLowMem.action" name="submitVolLow">
	                                    <label style="margin-left: 10px">小于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" name="volLow" id="volLow">
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkVolLow()">确定</button>
                                    </form>
                                    <form action="showVolUpMem.action" name="submitVolUp">
	                                    <label style="margin-left: 10px;margin-top:10px">大于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" name="volUp" id="volUp">
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkVolUp()">确定</button>
	                                </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">成交额</a>
                                <ul class="dropdown-menu" style="width:230px;">
                                	<form action="showVPrcLowMem.action" name="submitVPrcLow">
	                                    <label style="margin-left: 10px">小于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" name="vPrcLow" id="vPrcLow">
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkVPrcLow()">确定</button>
                                    </form>
                                    <form action="showVPrcUpMem.action" name="submitVPrcUp">
	                                    <label style="margin-left: 10px;margin-top:10px">大于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" name="vPrcUp" id="vPrcUp">
	                                    <button type="button" class="btn btn-default btn-sm" onclick="checkVPrcUp()">确定</button>
	                                </form>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div style="width: 100%;height:5%; margin-top:-10px" class="row">
        	<label class="col-sm-2">你的选择是：</label>
        	<label id="choice" style="margin-left:-100px"></label>
        </div>
        <div style="width: 100%;height:80%;float: left; "><!--background: green-->
            <table class="table table-bordered table-hover">
                <thead>
                    <tr class="info">
                        <th>代码</th>
                        <th>名称</th>
                        <th>价格(元)</th>
                        <th>涨幅(%)</th>
                        <th>成交量(手)</th>
                        <th>成交额</th>
                        <th>加入自选股</th>
                    </tr>
                </thead>
                <tbody id="table2" >
                    <s:iterator value="stocks1" status="st" var="st1">
						<tr>
							<td><s:url id="url" action="stockDetail">
									<s:param name="symbol">
										<s:property value="Symbol" />
									</s:param>
								</s:url> <s:a href="%{url}">
									<s:property value="Symbol" />
								</s:a></td>
							<td><s:url id="url" action="stockDetail">
									<s:param name="symbol">
										<s:property value="Symbol" />
									</s:param>
								</s:url> <s:a href="%{url}">
									<s:property value="Name" />
								</s:a></td>
							<td><s:property value="CurrentPrc" /></td>
							<td><s:property value="Up" /></td>
							<td><s:property value="TraddingVol" /></td>
							<td><s:property value="TraddingPrc" /></td>
							<td><button type="button" class="btn btn-xs" onclick="myAddCookies(this)"><span class="glyphicon glyphicon-plus"></span></button></td>
						</tr>
					</s:iterator>
                </tbody>
            </table>
            <span id="spanFirst">第一页</span> <span id="spanPre">上一页</span> <span
				id="spanNext">下一页</span> <span id="spanLast">最后一页</span>第<span
				id="spanPageNum"></span>页/共<span id="spanTotalPage"></span>页
        </div>
    </div>

    <nav class="navbar navbar-inverse navbar-fixed-bottom">
        <div class="container-fluid">
            <div class="navbar-header">
                <span class="glyphicon glyphicon-asterisk">Bottom</span>
            </div>
            <div class="collapse navbar-collapse">
                <form class="navbar-form ">

                </form>
            </div>
        </div>
    </nav>
 
</body>
<script>
	///////////////////////////////用来显示 用户筛选的条件
	function init(){
		var pars = window.location.search;
		//////////////////js中没有equals方法
		if(pars==""){
			var url = window.location.href;
			var ind = url.lastIndexOf("/");
			var furl = url.substring(ind+1);
			var type = furl.substring(4,6);
			if(type=="SH"){
				document.getElementById("choice").innerHTML = "沪A";
			}else if(type=="SZ"){
				document.getElementById("choice").innerHTML = "深A";
			}
			else{
				;
			}
		}else{
			///////获取?后面的字符创，即参数
			var paraments = pars.substring(1);
			/////////////成交量成交额只有一个参数，所以没有&
			if(paraments.indexOf("&")==-1){
				var arr = paraments.split("=");
				if(arr[0]=="volLow"){
					document.getElementById("choice").innerHTML = "成交量<="+arr[1];
				}else if(arr[0]=="volUp"){
					document.getElementById("choice").innerHTML = "成交量>="+arr[1];
				}else if(arr[0]=="vPrcLow"){
					document.getElementById("choice").innerHTML = "成交额<="+arr[1];
				}else if(arr[0]=="vPrcUp"){
					document.getElementById("choice").innerHTML = "成交额>="+arr[1];
				}else{
					;
				}
			}else{/////////////////////价格和涨幅有俩个参数，所以有&
				var parArr = paraments.split("&");
				if(parArr[0].charAt(0)=="p"){//////////parArr[0]是第一个参数，例如：priceLow=3;
					priceLow = (parArr[0].split("="))[1];
					priceUp  = (parArr[1].split("="))[1];
					document.getElementById("choice").innerHTML = priceLow+"<价格<"+priceUp;
				}else{
					upLow = (parArr[0].split("="))[1];
					upUp  = (parArr[1].split("="))[1];
					document.getElementById("choice").innerHTML = upLow+"%<涨幅<"+upUp+"%";
				}
			}
		}
	}
//////////////////////////输入信息的排查
	function checkPrice(){
		var priceLow = document.getElementById('priceLow').value.trim();
		var priceUp = document.getElementById('priceUp').value.trim();
		if(isNaN(priceLow)||isNaN(priceUp)){
			alert("非法字符输入，请输入数字");
		}
		else{
			document.submitPrice.submit();
		}
	}
	function checkUp(){
		var upLow = document.getElementById('upLow').value.trim();
		var upUp = document.getElementById('upUp').value.trim();
		if(isNaN(upLow)||isNaN(upUp)){
			alert("非法字符输入，请输入数字");
		}
		else{
			document.submitUp.submit();
		}
	}
	function checkVolLow(){
		var volLow = document.getElementById('volLow').value.trim();
		if(isNaN(volLow)){
			alert("非法字符输入，请输入数字");
		}
		else{
			if(volLow<0){
				alert("成交量必须大于等于0");
			}
			else if(volLow>2147483647){
				alert("您输入的数字太大，最大不能超过2147483647");
			}
			else{
				document.submitVolLow.submit();
			}
		}
	}
	function checkVolUp(){
		var volUp = document.getElementById('volUp').value.trim();
		if(isNaN(volUp)){
			alert("非法字符输入，请输入数字");
		}
		else{
			if(volUp<0){
				alert("成交量必须大于等于0");
			}
			else if(volUp>2147483647){
				alert("您输入的数字太大，最大不能超过2147483647");
			}
			else{
				document.submitVolUp.submit();
			}
		}
	}
	function checkVPrcLow(){
		var vPrcLow = document.getElementById('vPrcLow').value.trim();
		if(isNaN(vPrcLow)){
			alert("非法字符输入，请输入数字");
		}
		else{
			document.submitVPrcLow.submit();
		}
	}
	function checkVPrcUp(){
		var vPrcUp = document.getElementById('vPrcUp').value.trim();
		if(isNaN(vPrcUp)){
			alert("非法字符输入，请输入数字");
		}
		else{
			document.submitVPrcUp.submit();
		}
	}
	
	
/////////////////////////////////////////添加到cookie中
	function myAddCookies(event){
/*   		 document.cookie="userId=828,hulk;";
//		document.cookie="";
		var strCookie=document.cookie;
		alert(strCookie); 
		 var date = new Date();
		date.setTime(date.getTime()-100000);
//		document.cookie="userName=hulk; expires="+date.toGMTString();
		document.cookie="userId=828,hulk; expires="+date.toGMTString();
		alert(document.cookie);  */
		 
//		var allCookies = document.cookie;
//		 alert(allCookies);
	//	alert(allCookies.split("&&").length);	alert(allCookies);
	//	document.cookie="userId=828";
//		alert(allCookies.indexOf("s"));
	//alert((allCookies+"00").equals("00"));
	// 		alert((allCookies.split("&&"))[0]);
	 	var v = $(event).parent().parent().children().eq("0").children().text();
 		var value = escape(v);
		var date =new Date();		
		date.setDate(date.getDate()+30);
		var cookieString = value +"="+value +";expires="+ date.toGMTString();
		document.cookie = cookieString;
		alert("已添加股票"+value);
		/* var st = document.cookie.split(";");
		for(var i=0;i<st.length;i++){
			alert(st[i]);
		}
		alert(document.cookie); */
	//	alert(cookieString); 
	/*	if(allCookies.indexOf("s")==-1){
			document.cookie = cookieString;
		}else{
			document.cookie =";;"+cookieString;
		} */
		//var m = document.cookie;
	 	//alert(m);  
	}
	

//////////////////////////分页
	var theTable = document.getElementById("table2"); //标签ID
	var totalPage = document.getElementById("spanTotalPage");
	var pageNum = document.getElementById("spanPageNum");

	var spanPre = document.getElementById("spanPre");
	var spanNext = document.getElementById("spanNext");
	var spanFirst = document.getElementById("spanFirst");
	var spanLast = document.getElementById("spanLast");

	var numberRowsInTable = theTable.rows.length;
	var pageSize = 7;
	var page = 1;

	//下一页
	function next() {
		hideTable();

		currentRow = pageSize * page;
		maxRow = currentRow + pageSize;
		if (maxRow > numberRowsInTable)
			maxRow = numberRowsInTable;
		for (var i = currentRow; i < maxRow; i++) {
			theTable.rows[i].style.display = '';
		}
		page++;

		if (maxRow == numberRowsInTable) {
			nextText();
			lastText();
		}
		showPage();
		preLink();
		firstLink();
	}

	//上一页
	function pre() {

		hideTable();

		page--;

		currentRow = pageSize * page;
		maxRow = currentRow - pageSize;
		if (currentRow > numberRowsInTable)
			currentRow = numberRowsInTable;
		for (var i = maxRow; i < currentRow; i++) {
			theTable.rows[i].style.display = '';
		}

		if (maxRow == 0) {
			preText();
			firstText();
		}
		showPage();
		nextLink();
		lastLink();
	}
	//第一页
	function first() {
		hideTable();
		page = 1;
		for (var i = 0; i < pageSize; i++) {
			theTable.rows[i].style.display = '';
		}
		showPage();

		preText();
		nextLink();
		lastLink();
	}

	//最后一页
	function last() {
		hideTable();
		page = pageCount();
		currentRow = pageSize * (page - 1);
		for (var i = currentRow; i < numberRowsInTable; i++) {
			theTable.rows[i].style.display = '';
		}
		showPage();

		preLink();
		nextText();
		firstLink();
	}

	function hideTable() {
		for (var i = 0; i < numberRowsInTable; i++) {
			theTable.rows[i].style.display = 'none';
		}
	}

	function showPage() {
		pageNum.innerHTML = page;
	}

	//总共页数
	function pageCount() {
		var count = 0;
		if (numberRowsInTable % pageSize != 0)
			count = 1;
		return parseInt(numberRowsInTable / pageSize) + count;
	}

	//显示链接
	function preLink() {
		spanPre.innerHTML = "<a href='javascript:pre();'>上一页</a>";
	}
	function preText() {
		spanPre.innerHTML = "上一页";
	}

	function nextLink() {
		spanNext.innerHTML = "<a href='javascript:next();'>下一页</a>";
	}
	function nextText() {
		spanNext.innerHTML = "下一页";
	}

	function firstLink() {
		spanFirst.innerHTML = "<a href='javascript:first();'>第一页</a>";
	}
	function firstText() {
		spanFirst.innerHTML = "第一页";
	}

	function lastLink() {
		spanLast.innerHTML = "<a href='javascript:last();'>最后一页</a>";
	}
	function lastText() {
		spanLast.innerHTML = "最后一页";
	}

	//隐藏表格
	function hide() {
		for (var i = pageSize; i < numberRowsInTable; i++) {
			theTable.rows[i].style.display = 'none';
		}

		totalPage.innerHTML = pageCount();
		pageNum.innerHTML = '1';

		nextLink();
		lastLink();
	}

	hide();
</script>

</html>
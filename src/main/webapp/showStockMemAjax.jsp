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
<body >
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
                                            <li style="margin-left:20px"><a  style="text-decoration:none" id="sh">沪A</a></li>
                                        </div>
                                        <div class="col-sm-3>">
                                            <li ><a style="text-decoration:none" id="sz">深A</a></li>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">价格</a>
                                <ul class="dropdown-menu" style="width:250px">
	                                <form>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" id="priceLow">
	                                     <label>-</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 20px"  id="priceUp">
	                                    <button type="button" class="btn btn-default btn-sm" id="priceEvent">确定</button>
	                                </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">涨幅</a>
                                <ul class="dropdown-menu" style="width:250px">
                                	<form >
	                                    <input type="text" size="3" style="margin-left: 10px;" id="upLow">
	                                    <label>%&nbsp;-</label>
	                                    <input type="text" size="3" style="margin-left: 10px;" id="upUp">
	                                    <label>%</label>
	                                    <button type="button" class="btn btn-default btn-sm" id="upEvent">确定</button>
                                    </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">成交量</a>
                                <ul class="dropdown-menu" style="width:230px;">
                                	<form >
	                                    <label style="margin-left: 10px">小于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px"  id="volLow">
	                                    <button type="button" class="btn btn-default btn-sm" id="volLowEvent">确定</button>
                                    </form>
                                    <form >
	                                    <label style="margin-left: 10px;margin-top:10px">大于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" id="volUp">
	                                    <button type="button" class="btn btn-default btn-sm" id="volUpEvent">确定</button>
	                                </form>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#">成交额</a>
                                <ul class="dropdown-menu" style="width:230px;">
                                	<form >
	                                    <label style="margin-left: 10px">小于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px" id="vPrcLow">
	                                    <button type="button" class="btn btn-default btn-sm" id="vPrcLowEvent">确定</button>
                                    </form>
                                    <form >
	                                    <label style="margin-left: 10px;margin-top:10px">大于等于:</label>
	                                    <input type="text" size="3" style="margin-left: 10px;margin-right: 10px"  id="vPrcUp">
	                                    <button type="button" class="btn btn-default btn-sm" id="vPrcUpEvent">确定</button>
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
	////////////////////////////////ajax实现访问
	var totalPage = $("#spanTotalPage");
	var pageNum = $("#spanPageNum");
	var spanPre = $("#spanPre");
	var spanNext = $("#spanNext");
	var spanFirst = $("#spanFirst");
	var spanLast = $("#spanLast");
	var pageSize = 7;
	var currentPage = 0;
	var returnData;
	var ctrSH,ctrSZ,ctrPrice,ctrUp,ctrVolLow,ctrVolUp,ctrVPrcLow,ctrVPrcUp;
	
	$(function(){

	}); 
	
	//////////沪A
	$("#sh").click(function(){
		currentPage=0;
		$.invokeSH();
		var first = true;
		$.setSHTime(first);
	});
	//////////深A
	$("#sz").click(function(){
		currentPage=0;
		$.invokeSZ();
		var first = true;
		$.setSZTime(first);
	});
	///////////////价格
	$("#priceEvent").click(function(){
		if($.checkPrice()){
			currentPage=0;
			$.invokePrice();
			var first = true;
			$.setPriceTime(first);
		}
	});
	////////////////涨幅
	$("#upEvent").click(function(){
		if($.checkUp()){
			currentPage=0;
			$.invokeUp();
			var first = true;
			$.setUpTime(first);
		}
	});
	////////////////成交量低
	$("#volLowEvent").click(function(){
		if($.checkVolLow()){
			currentPage=0;
			$.invokeVolLow();
			var first = true;
			$.setVolLowTime(first);
		}
	});
	////////////////成交量高
	$("#volUpEvent").click(function(){
		if($.checkVolUp()){
			currentPage=0;
			$.invokeVolUp();
			var first = true;
			$.setVolUpTime(first);
		}
	});
	////////////////成交额低
	$("#vPrcLowEvent").click(function(){
		if($.checkVPrcLow()){
			currentPage=0;
			$.invokeVPrcLow();
			var first = true;
			$.setVPrcLowTime(first);
		}
	});
	////////////////成交额高
	$("#vPrcUpEvent").click(function(){
		if($.checkVPrcUp()){
			currentPage=0;
			$.invokeVPrcUp();
			var first = true;
			$.setVPrcUpTime(first);
		}
	});
	
	//////////////////////////分页
	//下一页
	$.extend({
		init:function(jsonArray){
			returnData = jsonArray;
			var flag = $.myShowNext();
			if(!flag){
				$.nextLink();
				$.lastLink();
			}else{
				$.nextText();
				$.lastText();
			}
			$.firstText();
			$.preText();
			totalPage.html(""+$.pageCount());
			pageNum.html("1");
		},
	//////定时器
		setSHTime:function(first){
			if(!first){
				ctrSH = setTimeout("$.setSHTime(false)",5000);
				$.ajax({
					url : 'showSHMemAjax.action',
					type : 'GET',
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrSH = setTimeout("$.setSHTime(false)",5000);
			}
			
		},
		setSZTime:function(first){
			if(!first){
				ctrSZ = setTimeout("$.setSZTime(false)",5000);
				$.ajax({
					url : 'showSZMemAjax.action',
					type : 'GET',
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrSZ = setTimeout("$.setSZTime(false)",5000);
			}
			
		},
		setPriceTime:function(first){
			if(!first){
				ctrPrice = setTimeout("$.setPriceTime(false)",5000);
				$.ajax({
					url : 'showPriceMemAjax.action',
					type : 'GET',
					data:{"priceLow":$("#priceLow").val(),"priceUp":$("#priceUp").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrPrice = setTimeout("$.setPriceTime(false)",5000);
			}
			
		},
		setUpTime:function(first){
			if(!first){
				ctrUp = setTimeout("$.setUpTime(false)",5000);
				$.ajax({
					url : 'showUpMemAjax.action',
					type : 'GET',
					data:{"upLow":$("#upLow").val(),"upUp":$("#upUp").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrUp = setTimeout("$.setUpTime(false)",5000);
			}
			
		},
		setVolLowTime:function(first){
			if(!first){
				ctrVolLow = setTimeout("$.setVolLowTime(false)",5000);
				$.ajax({
					url : 'showVolLowMemAjax.action',
					type : 'GET',
					data:{"volLow":$("#volLow").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrVolLow = setTimeout("$.setVolLowTime(false)",5000);
			}
			
		},
		setVolUpTime:function(first){
			if(!first){
				ctrVolUp = setTimeout("$.setVolUpTime(false)",5000);
				$.ajax({
					url : 'showVolUpMemAjax.action',
					type : 'GET',
					data:{"volUp":$("#volUp").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVPrcLow);
				clearTimeout(ctrVPrcUp);
				ctrVolUp = setTimeout("$.setVolUpTime(false)",5000);
			}
			
		},
		setVPrcLowTime:function(first){
			if(!first){
				ctrVPrcLow = setTimeout("$.setVPrcLowTime(false)",5000);
				$.ajax({
					url : 'showVPrcLowMemAjax.action',
					type : 'GET',
					data:{"vPrcLow":$("#vPrcLow").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcUp);
				ctrVPrcLow = setTimeout("$.setVPrcLowTime(false)",5000);
			}
			
		},
		setVPrcUpTime:function(first){
			if(!first){
				ctrVPrcUp = setTimeout("$.setVPrcUpTime(false)",5000);
				$.ajax({
					url : 'showVPrcUpMemAjax.action',
					type : 'GET',
					data:{"vPrcUp":$("#vPrcUp").val()},
					dataType : 'json',
					async : false,
					success : function(jsonArray) {
						returnData = jsonArray;
						currentPage--;
						$.myShowNext();
					}
				});
			}else{
				clearTimeout(ctrSH);
				clearTimeout(ctrSZ);
				clearTimeout(ctrPrice);
				clearTimeout(ctrUp);
				clearTimeout(ctrVolLow);
				clearTimeout(ctrVolUp);
				clearTimeout(ctrVPrcLow);
				ctrVPrcUp = setTimeout("$.setVPrcUpTime(false)",5000);
			}
			
		},
		
////////////////////初始化上海.
		invokeSH:function(){
			$.ajax({
				url : 'showSHMemAjax.action',
				type : 'GET',
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html("沪A");
		},
		invokeSZ:function(){
			$.ajax({
				url : 'showSZMemAjax.action',
				type : 'GET',
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html("深A");
		},
		invokePrice:function(){
			$.ajax({
				url : 'showPriceMemAjax.action',
				type : 'GET',
				data:{"priceLow":$("#priceLow").val(),"priceUp":$("#priceUp").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html($("#priceLow").val()+"<价格<"+$("#priceUp").val());
		},
		invokeUp:function(){
			$.ajax({
				url : 'showUpMemAjax.action',
				type : 'GET',
				data:{"upLow":$("#upLow").val(),"upUp":$("#upUp").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html($("#upLow").val()+"%<涨幅<"+$("#upUp").val()+"%");
		},
		invokeVolLow:function(){
			$.ajax({
				url : 'showVolLowMemAjax.action',
				type : 'GET',
				data:{"volLow":$("#volLow").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});  
			$("#choice").html("成交量<="+$("#volLow").val());
		},
		invokeVolUp:function(){
			$.ajax({
				url : 'showVolUpMemAjax.action',
				type : 'GET',
				data:{"volUp":$("#volUp").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html("成交量>="+$("#volUp").val());
		},
		invokeVPrcLow:function(){
			$.ajax({
				url : 'showVPrcLowMemAjax.action',
				type : 'GET',
				data:{"vPrcLow":$("#vPrcLow").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});  
			$("#choice").html("成交额<="+$("#vPrcLow").val());
		},
		invokeVPrcUp:function(){
			$.ajax({
				url : 'showVPrcUpMemAjax.action',
				type : 'GET',
				data:{"vPrcUp":$("#vPrcUp").val()},
				dataType : 'json',
				async : false,
				success : function(jsonArray) {
					$.init(jsonArray);
				}
			});
			$("#choice").html("成交额>="+$("#vPrcUp").val());
		},
///////////////////////////////////输入信息的排查
		checkPrice:function (){
			var priceLow = document.getElementById('priceLow').value.trim();
			var priceUp = document.getElementById('priceUp').value.trim();
			if(isNaN(priceLow)||isNaN(priceUp)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				return true;
			}
		},
		checkUp:function (){
			var upLow = document.getElementById('upLow').value.trim();
			var upUp = document.getElementById('upUp').value.trim();
			if(isNaN(upLow)||isNaN(upUp)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				return true;
			}
		},
		checkVolLow:function (){
			var volLow = document.getElementById('volLow').value.trim();
			if(isNaN(volLow)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				if(volLow<0){
					alert("成交量必须大于等于0");
					return false;
				}
				else if(volLow>2147483647){
					alert("您输入的数字太大，最大不能超过2147483647");
					return false;
				}
				else{
					return true;
				}
			}
		},
		checkVolUp:function (){
			var volUp = document.getElementById('volUp').value.trim();
			if(isNaN(volUp)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				if(volUp<0){
					alert("成交量必须大于等于0");
					return false;
				}
				else if(volUp>2147483647){
					alert("您输入的数字太大，最大不能超过2147483647");
					return false;
				}
				else{
					return true;
				}
			}
		},
		checkVPrcLow:function (){
			var vPrcLow = document.getElementById('vPrcLow').value.trim();
			if(isNaN(vPrcLow)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				return true;
			}
		},
		checkVPrcUp:function (){
			var vPrcUp = document.getElementById('vPrcUp').value.trim();
			if(isNaN(vPrcUp)){
				alert("非法字符输入，请输入数字");
				return false;
			}
			else{
				return true;
			}
		},
		
		/////////显示后一页
		myShowNext:function(){
			currentPage++;
			var str = "";
			$("#table2").html("");
			var start = pageSize * (currentPage-1);
			var end = start + pageSize;
			
			var flag = false;
			if(end>=returnData.length){
				end = returnData.length;
				flag =true;
			}
			for(var i = start; i < end; i++){
				str += "<tr><td> <a href=\"stockDetail.action?symbol="+returnData[i].symbol+"\">"+returnData[i].symbol+"<a></td>"+
				    "<td><a href=\"stockDetail.action?symbol="+returnData[i].symbol+"\">"+returnData[i].name+"<a></td>"+
					"<td>"+returnData[i].currentPrc+"</td>"+
					"<td>"+returnData[i].up+"</td>"+				
					"<td>"+returnData[i].traddingVol+"</td>"+				
					"<td>"+returnData[i].traddingPrc+"</td>"+				
					"<td><button type=\"button\" class=\"btn btn-xs\" onclick=\"myAddCookies(this)\"><span class=\"glyphicon glyphicon-plus\"></span></button></td>"+
					"</tr>";				
			}
			$("#table2").append(str);
			return flag;
		},
		////////////////显示后一页
		myShowPre:function(){
			currentPage--;
			var str = "";
			$("#table2").html("");
			
			var end = pageSize * currentPage;
			var start = end-pageSize;
			
			var flag = false;
			if(start==0){
				flag =true;
			}
			for(var i = start; i < end; i++){
				str += "<tr><td> <a href=\"stockDetail.action?symbol="+returnData[i].symbol+"\">"+returnData[i].symbol+"<a></td>"+
				    "<td><a href=\"stockDetail.action?symbol="+returnData[i].symbol+"\">"+returnData[i].name+"<a></td>"+
					"<td>"+returnData[i].currentPrc+"</td>"+
					"<td>"+returnData[i].up+"</td>"+				
					"<td>"+returnData[i].traddingVol+"</td>"+				
					"<td>"+returnData[i].traddingPrc+"</td>"+				
					"<td><button type=\"button\" class=\"btn btn-xs\" onclick=\"myAddCookies(this)\"><span class=\"glyphicon glyphicon-plus\"></span></button></td>"+
					"</tr>";				
			}
			$("#table2").append(str);
			return flag;
		},
		
		//总共页数
		pageCount:function () {
			var count = (returnData.length%pageSize==0)?(returnData.length/pageSize):parseInt(returnData.length/pageSize+1);
			return count;
		},
	
		//显示链接
		preLink:function () {
			spanPre.html("<a href='javascript:pre();'>上一页</a>");
		},
		preText:function () {
			spanPre.html("上一页");
		},
	
		nextLink:function () {
			spanNext.html("<a id='myNext'>下一页</a>");
			$("#myNext").attr("href","javascript:next()");
			
		},
		nextText:function () {
			spanNext.html("下一页");
		},
	
		firstLink:function () {
			spanFirst.html("<a href='javascript:first();'>第一页</a>");
		},
		firstText:function () {
			spanFirst.html("第一页");
		},
	
		lastLink:function () {
			spanLast.html("<a href='javascript:last();'>最后一页</a>");
		},
		lastText:function () {
			spanLast.html("最后一页");
		}
	});
	
	function next() {
		var flag = $.myShowNext();
		if(flag){
			$.nextText();
			$.lastText();
		}else{
			$.nextLink();
			$.lastLink();
		}
		$.firstLink();
		$.preLink();
		pageNum.html(currentPage+"");
	}
	
	//上一页
	function pre() {
		var flag = $.myShowPre();
		if(flag){
			$.firstText();
			$.preText();
		}else{
			$.firstLink();
			$.preLink();
		}
		$.nextLink();
		$.lastLink();
		pageNum.html(currentPage+"");
	}
	
	//第一页
	function first(){
		currentPage = 2;
		var flag = $.myShowPre();
		$.firstText();
		$.preText();
		$.nextLink();
		$.lastLink();
		pageNum.html("1");
	}
	
	//最后一页 
	function last(){
		currentPage = $.pageCount()-1;
		var flag = $.myShowNext();
		$.nextText();
		$.lastText();
		$.firstLink();
		$.preLink();
		pageNum.html($.pageCount()+"");
	}

	
/////////////////////////////////////////添加到cookie中
	function myAddCookies(event){
	 	var v = $(event).parent().parent().children().eq("0").children().text();
 		var value = escape(v);
		var date =new Date();		
		date.setDate(date.getDate()+30);
		var cookieString = value +"="+value +";expires="+ date.toGMTString();
		document.cookie = cookieString;
		alert("已添加股票"+value);
	}
	

</script>

</html>
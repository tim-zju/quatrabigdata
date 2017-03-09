<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>MainUI</title>
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">-->
    <link rel="stylesheet" href="res/css/bootstrap.min.css">
    <script src="res/js/jquery.min.js"></script>
    <script src="res/js/bootstrap.min.js"></script>
	<style>
		.myDiv{
    		border-style:solid; border-width:1px; border-color:#31b0d5;
		}

		.myBack{
    		background-size:100% 100%;
		}
	</style>

</head>
<body>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <span class="glyphicon glyphicon-asterisk">brand</span>
            </div>
            <div class="collapse navbar-collapse">
                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <label>切换数据源</label>
                        <input type="radio" name="datasource">东方财经
                        <input type="radio" name="datasource">腾讯财经
                    </div>
                </form>
            </div>
        </div>
    </nav>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="collapse navbar-collapse">
                <form class="navbar-form">
                    <div class="form-group col-md-4">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="search">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">Search</button>
                            </span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <a href="http://localhost:63342/Stock/StockChoice.html">选股器</a>
                    </div>
                    <div class="col-md-offset-10">
                        <div class="form-group ">
                            <label class="sr-only">log</label>
                            <button type="button" class="btn btn-default">登录</button>
                        </div>
                        <div class="form-group ">
                            <label class="sr-only">register</label>
                            <button type="button" class="btn btn-default">注册</button>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </nav>

    <div style="width:1345px;height:470px;margin-top: -10px;margin-left: 10px;margin-right:10px"><!--background: blue;-->
        <div style="width: 30%;height:100%;float: left; "><!--background: red-->
            <div class="myDiv myBack" style="width:100%;height:49%;background-image: url('img3.png');"><!--background:  black-->
                <p class="text-left">上证指数</p>
            </div>
            <div class="myDiv myBack" style="width:100%;height: 49%;background-image: url('img4.png');"><!--background: yellow-->
                <p class="text-left">深证指数</p>
            </div>
        </div>
        <div style="width: 70%;height:100%;float: right;"><!--background: green-->
            <ul class="nav nav-tabs" id="myTab" role="tablist">
                <li role="presentation" class="active"><a href="#m1" data-toggle="tab">自选股</a></li>
                <li role="presentation"><a href="#m2" data-toggle="tab">新股</a></li>
                <li role="presentation"><a href="#m3" data-toggle="tab">停售</a></li>
                <li role="presentation"><a href="#m4" data-toggle="tab">公告</a></li>
            </ul>
            <div class="tab-content" style="width:100%;height:100%;">
                <div class="tab-pane active" id="m1">
                    <table class="table table-bordered table-hover" id="showTable">
                        <thead>
	                        <tr class="info">
	                        	<th>删除</th>
	                            <th>代码</th>
	                            <th>名称</th>
	                            <th>价格</th>
	                            <th>涨幅</th>
	                            <th>成交量</th>
	                            <th>成交额</th>
	                            <th>所属板块</th>
	                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
                <div class="tab-pane" id="m2">
                    <table class="table table-bordered table-hover">
                        <thead>
                        <tr class="info">
                            <th>代码</th>
                            <th>名称</th>
                            <th>上网发行日期</th>
                            <th>发行量(万股)</th>
                            <th>上网发行量</th>
                            <th>发行价格</th>
                            <th>市盈率</th>
                        </tr>
                        <tr>
                            <td>300496</td>
                            <td>中科创达</td>
                            <td>2015-12-02</td>
                            <td>2500.00</td>
                            <td>1000.0000</td>
                            <td>23.27</td>
                            <td>22.99</td>
                        </tr>
                        <tr>
                            <td>603936</td>
                            <td>博敏电子</td>
                            <td>2015-12-01</td>
                            <td>4185.00</td>
                            <td>1665.0000</td>
                            <td>8.06</td>
                            <td>22.98</td>
                        </tr>
                        <tr>
                            <td>002779</td>
                            <td>中坚科技</td>
                            <td>2015-12-01</td>
                            <td>2200.00</td>
                            <td>880.0000</td>
                            <td>12.11</td>
                            <td>18.97</td>
                        </tr>
                        <tr>
                            <td>603398</td>
                            <td>邦宝益智</td>
                            <td>2015-12-01</td>
                            <td>2400.00</td>
                            <td>900.0000</td>
                            <td>13.97</td>
                            <td>22.99</td>
                        </tr>
                        <tr>
                            <td>002780</td>
                            <td>三夫户外</td>
                            <td>2015-12-01</td>
                            <td>1700.00</td>
                            <td>680.0000</td>
                            <td>9.42</td>
                            <td>22.95</td>
                        </tr>
                        <tr>
                            <td>603800</td>
                            <td>道森股份</td>
                            <td>2015-12-01</td>
                            <td>5200.00</td>
                            <td>5200.00</td>
                            <td>10.95</td>
                            <td>21.15</td>
                        </tr>
                        <tr>
                            <td>603999</td>
                            <td>读者传媒</td>
                            <td>2015-12-01</td>
                            <td>6000.00</td>
                            <td>6000.00</td>
                            <td>9.77</td>
                            <td>19.85</td>
                        </tr>
                        <tr>
                            <td>603696</td>
                            <td>安记食品</td>
                            <td>2015-12-01</td>
                            <td>3000.00</td>
                            <td>3000.00</td>
                            <td>10.10</td>
                            <td>22.95</td>
                        </tr>
                        <tr>
                            <td>002506</td>
                            <td>润欣科技</td>
                            <td>2015-12-01</td>
                            <td>3000.00</td>
                            <td>3000.00</td>
                            <td>6.87</td>
                            <td>22.97</td>
                        </tr>
                        <tr>
                            <td>002783</td>
                            <td>凯龙股份</td>
                            <td>2015-11-30</td>
                            <td>2087.00</td>
                            <td>2087.00</td>
                            <td>28.68</td>
                            <td>22.98</td>
                        </tr>
                        </thead>
                    </table>
                </div>
                <div class="tab-pane" id="m3">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <td>证券名称</td>
                                <td>停牌时间</td>
                                <td>复牌时间</td>
                                <td>停牌期限</td>
                                <td>停牌原因</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><a href="#">以岭药业</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">经纬电材</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">太阳鸟</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">和顺电气</a></td>
                                <td>2015-12-01</td>
                                <td>--</td>
                                <td>停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">恒顺众昇</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">新天科技</a></td>
                                <td>2015-12-01</td>
                                <td>--</td>
                                <td>停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">珈伟股份</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">旋极信息</a></td>
                                <td>2015-12-01</td>
                                <td>--</td>
                                <td>停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">安控科技</a></td>
                                <td>2015-12-01</td>
                                <td>2015-12-01</td>
                                <td>取消停牌</td>
                                <td>重大事项</td>
                            </tr>
                            <tr>
                                <td><a href="#">大名城</a></td>
                                <td>2015-12-01</td>
                                <td>--</td>
                                <td>今起停牌</td>
                                <td>重大事项未公告</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="tab-pane" id="m4">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr class="info">
                                <td>公告标题</td>
                                <td>证券名称</td>
                                <td>公告种类</td>
                                <td>公告时间</td>
                                <td>更多</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><a href="#">蓉胜超微：关于非公开发行股票申请获得中国证监会核准批复的公告</a></td>
                                <td><a href="#">蓉胜超微</a></td>
                                <td>临时公告</td>
                                <td>2015-12-01</td>
                                <td><a href="#">查看</a></td>
                            </tr>
                            <tr>
                                <td><a href="#">浩物股份：关于提供担保方破产的提示性公告</a></td>
                                <td><a href="#">浩物股份</a></td>
                                <td>临时公告</td><td>2015-12-01</td>
                                <td><a href="#">查看</a></td>
                            </tr>
                            <tr>
                                <td><a href="#">浩物股份：国浩律师（天津）事务所关于公司控股股东一致行动人增持股份的专项核</a></td>
                                <td><a href="#">浩物股份</a></td>
                                <td>临时公告</td>
                                <td>2015-12-01</td>
                                <td><a href="#">查看</a></td>
                            </tr>
                            <tr>
                                <td><a href="#">浩物股份：关于控股股东增持本公司股份计划实施完毕的公告</a></td>
                                <td><a href="#">浩物股份</a></td>
                                <td>临时公告</td>
                                <td>2015-12-01</td>
                                <td><a href="#">查看</a></td>
                            </tr>
                            <tr>
                                <td><a href="#">中科创达：首次公开发行股票并在创业板上市投资风险特别公告</a></td>
                                <td><a href="#">中科创达</a></td>
                                <td>临时公告</td>
                                <td>2015-12-01</td>
                                <td><a href="#">查看</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
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
<script type="text/javascript">
$(function (){
	$.personStock();
});
 
 
////////////////////////////////////////删除cookie中
function myDelCookies(event){
//	alert(document.cookie);
 	var v = $(event).parent().parent().children().eq("1").text();
	var value = escape(v);
	var date =new Date();		
	date.setDate(date.getDate()-30);
	var cookieString = value +"="+value +";expires="+ date.toGMTString();
	document.cookie = cookieString;
//	alert(document.cookie);
	$.personStock();
}

$.extend({
	personStock:function(){
		$.ajax({
			url : 'showCookies.action',
			type : 'GET',
			dataType : 'json',
			async : false,
			success : function(jsonArray) {
				/* data = jsonArray[0];
				categorie = jsonArray[1];
				baseid=jsonArray[2]; */
				var str = "";
				$("#showTable tbody").html("");
				$.each(jsonArray,function(i,list) {
					str+="<tr><td><button type=\"button\" class=\"btn\" onclick=\"myDelCookies(this)\"><span class=\"glyphicon glyphicon-minus\"></span></button></td>"+
						"<td>"+list.symbol+"</td>"+
						"<td>"+list.name+"</td>"+
						"<td>"+list.currentPrc+"</td>"+
						"<td>"+list.up+"</td>"+				
						"<td>"+list.traddingVol+"</td>"+				
						"<td>"+list.traddingPrc+"</td>"+				
						"<td>"+0+"</td>"+
						"</tr>";				
				});
				$("#showTable tbody").append(str);
			}
		});
	}
});

 </script>
 
</html>
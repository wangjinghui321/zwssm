<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>记账系统</title>
<style type="text/css">
div#d1 {
	height: 81px;
	background-color: rgb(185, 66, 48);
	font-size: 30px;
}

a {
	line-height: 45px;
	color: rgb(246, 246, 246);
	margin-left: 12px;
	margin-right: 12px;
	text-decoration: none;
}

img#d2 {
	position: relative;
	top: 50px;
}
</style>
</head>
<body>
<% String name=(String)session.getAttribute("userName");%>
	<div id="d1">
		<span
			style="padding-left: 30px; display: table-cell; vertical-align: middle; height: 80px;">家庭记账系统</span>
		<p
			style="position: absolute; left: 1100px; top: 20px; font-size: 14px;">
		</p>
	</div>
	<div style="height: 450px;">
		<div
			style="height: 50px; background-color: rgb(185, 66, 48); border-top: 1px solid white;">
			<span> <a href="main.jsp" style="margin-left: 20px;">系统首页</a>
				<a href="${ pageContext.request.contextPath }/money_pay.action">支出账单管理</a> 
				<a href="${ pageContext.request.contextPath }/money_in.action">收入账单管理</a> 
				<a href="${ pageContext.request.contextPath }/money_trun.action">转账管理</a> 
				<a href="${ pageContext.request.contextPath }/money_count.action">总账单管理</a> 
				<a href="people/People.jsp">个人信息管理</a> 
				
			</span>
		</div>
		<div style="text-align: center;">
			<img id="d2" alt="图片" src="./image/1.png">
		</div>
	</div>
	<%@include file="./A.jsp" %>
</body>
</html>
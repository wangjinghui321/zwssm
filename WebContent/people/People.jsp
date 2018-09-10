<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>家庭记账系统</title>
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
	left: 150px;
}
</style>
</head>
<body>
	<%
		String name = (String) session.getAttribute("userName");
	%>
	<div id="d1">
		<span
			style="padding-left: 30px; display: table-cell; vertical-align: middle; height: 80px;">家庭记账系统</span>
		<p
			style="position: absolute; left: 1100px; top: 20px; font-size: 14px;">
			<%=name%>欢迎你访问！
		</p>
	</div>
	<div
		style="height: 50px; background-color: rgb(185, 66, 48); border-top: 1px solid white;">
			<span> <a href="../main/main.jsp" style="margin-left: 20px;">系统首页</a>
				<a href="../pay/Pay.jsp">支出账单管理</a> 
				<a href="../in/In.jsp">收入账单管理</a> 
				<a href="../turn/Turn.jsp">转账管理</a> 
				<a href="../zhangdan/ZhangDan.jsp">总账单管理</a> 
				<a href="../people/People.jsp">个人信息管理</a> 
				<a href="../login/login.jsp"style="float: right;margin-right:50px;">退出</a>
			</span>
	</div>
	<div
		style="height: 425px; position: relative; background-color: rgb(246, 246, 246);">
  <form action="peopleCheck.jsp" method="post">
		<table border="0" align="center" width="300px" height="220px"
			cellspacing="0" cellpadding="0" style="padding-top: 100px;">
			<tr>
				<td height="50" width="80px">用 户 名：</td>
				<td width="160px"><input type="text" name="userName"
					style="height: 25px; width: 170px; font-size: 12px;" /></td>
			</tr>
			<tr>
				<td height="50" width="80px">新&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;码：</td>
				<td width="160px"><input type="password" name="password"
					style="height: 25px; width: 170px; font-size: 12px;" /></td>
			</tr>
			<tr>
				<td height="50" width="80px">重复新密码：</td>
				<td width="160px"><input type="password" name="password2"
					style="height: 25px; width: 170px; font-size: 12px;" /></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="确定"
					style="height: 28px; width: 80px; background-color: rgb(185, 66, 48);" /></td>
					<td align="center"><input type="reset" value="清除"
					style="height: 28px; width: 80px; background-color: rgb(185, 66, 48);" /></td>
			</tr>
		</table>
		</form>
	</div>
	<%@include file="../A.jsp"%>
</body>
</html>
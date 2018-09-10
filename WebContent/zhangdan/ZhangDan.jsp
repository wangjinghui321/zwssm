<%@ page import="java.sql.*"%>
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

td, th {
	text-align: center;
	height: 30px;
}

table {
	border-collapse: collapse;
}

tr.class1 {
	border-bottom-style: solid;
	border-bottom-width: 1px;
	border-top-style: solid;
	border-top-width: 1px;
}
</style>
</head>

<% String name=(String)session.getAttribute("userName");%>
	<div id="d1">
		<span
			style="padding-left: 30px; display: table-cell; vertical-align: middle; height: 80px;">家庭记账系统</span>
		<p
			style="position: absolute; left: 1100px; top: 20px; font-size: 14px;">
			<%=name %>欢迎你访问！
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
<div style="height: 600px; border-top: 1px solid white; background-color: rgb(246, 246, 246); z-index: 100;">
		<br/>
		<br/>
		<table border="0" width="100%">
			<tr>
				<td>时间</td>
				<td colspan="3" style="text-align: left"><select>
						<option selected="selected">2017</option>
						<option>2016</option>
						<option>2015</option>
				</select>年 <select>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option selected="selected">11</option>
				</select>月</td>
				<td><input type="button" value="查看月度报告"></td></tr>
		</table>
<div style="height: 500px;">
	<table width="100%" >
		<tr class="class1" >
			<th>编号</th>
			<th>金额</th>
			<th>种类</th>
			<th>时间</th>
			<th>备注</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
			<%
				Connection con = null;
				Statement st = null;
				ResultSet rs = null;
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/student? useUnicode=true&characterEncoding=gbk";
				con = DriverManager.getConnection(url, "root", "root");
				st = con.createStatement();
				String sql = "select * from pay";
				rs = st.executeQuery(sql);
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("year")%><%=rs.getString("month")%><%=rs.getString("day")%></td>
				<td>-<%=rs.getString("money")%></td>
				<td><%=rs.getString("kinds")%></td>
				<td><%=rs.getString("year")%>-<%=rs.getString("month")%>-<%=rs.getString("day")%></td>
				<td><%=rs.getString("remark")%></td>
				<td><input type="button" value="修改"></td>
				<td><input type="button" value="删除"></td>
			</tr>
			<%
				}
				rs.close();
				st.close();
				con.close();
			%>
	</table>
</div></div>
<%@include file="../A.jsp" %>
</html>
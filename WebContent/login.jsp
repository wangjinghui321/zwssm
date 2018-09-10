<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<style>
div#d1 {
	width: 1370px;
	height: 81px;
	background-color: rgb(185, 65, 48);
	font-size: 30px;
	font-style: italic;
	padding-left: 30px;
	padding-top: 30px;
	font-size: 30px;
}

#d2 {
	width: 1203px;
	height: 425px;
	position: relative;
}

#d3 {
	padding-left: 110px;
	padding-top: 110px;
	width: 640px;
	height: 295px;
}

#d4 {
	border-radius: 4px;
	left: 830px;
	top: 110px;
	width: 336px;
	height: 293px;
	color: rgb(51, 51, 51);
	position: absolute;
	z-index: 100;
	box-shadow: 0px 0px 5px rgb(50, 47, 47);
	background-color: rgb(246, 246, 246);
}
</style>
</head>
<body>
	<div id="d1">记账系统</div>
	<div id="d2">
		<div id="d3">
			<a target="_blank"><img src="./image/1.png"></a>
		</div>
		<div id="d4">
			<form action="${ pageContext.request.contextPath }/login.action" name="form1" method="post">
				<table border="0" align="center" width="300px" height="220px"
					cellspacing="0" cellpadding="0" align="center">
					<tr>
						<td colspan="2" align="center"><img alt="登录"
							src="./image/2.png"> 登录</td>
					</tr>
					<tr>
						<td height="50" width="80px">账号：</td>
						<td width="160px"><input type="text" name="username"
							style="height: 25px; width: 170px; fomt-size: 12px;" /></td>
					</tr>
					<tr>
						<td height="50" width="80px">密 码：</td>
						<td width="160px"><input type="password" name="password"
							style="height: 25px; width: 170px; fomt-size: 12px;" /></td>
					</tr>
					<tr>
						<td align="center"><input type="submit" name="submit1"
							value="登录"
							style="height: 28px; width: 80px; background-color: rgb(185, 66, 48);"/></td>
						<td align="center"><input type="button" value="注册"
							style="height: 28px; width: 80px; background-color: rgb(185, 66, 48);"
							onclick="location.href='register.jsp'"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
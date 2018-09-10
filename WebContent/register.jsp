<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
<style>
div#d1 {
	width: 1370px;
	height: 81px;
	background-color: rgb(185, 66, 48);
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
	left: 801px;
	top: 110px;
	width: 336px;
	height: 293px;
	color: rgb(51, 51, 51);
	position: absolute;
	z-index: 100;
	box-shadow: 0px 0px 5px rgb(50, 47, 47);
	background-color: rgb(246, 246, 246);
}

.class1 {
	height: 28px;
	width: 67px;
	background-color: rgb(185, 66, 48);
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
			<form action="${ pageContext.request.contextPath }/regist.action" method="post" name="form2">
				<table border="0" align="center" width="300" height="150"
					cellspacing="0" cellpadding="0">
					<tr>
						<td colspan="2" align="center"><h2>注册</h2></td>
					</tr>
					
					<tr>
						<td height="50" align="center">用户名：</td>
						<td align="center"><input type="text" name="username"
							style="height: 25px; width: 200px; fomt-size: 12px;" /></td>
					</tr>
					<tr>
						<td height="50" align="center">密 码：</td>
						<td align="center"><input type="password" name="password"
							style="height: 25px; width: 200px; fomt-size: 12px;" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center" height="60">
						    <input type="submit" value="提交" name="submit1" class="class1" /> 
							<input type="reset" value="清除" class="class1" /> 
							<input type="button" value="返回"class="class1" onclick="location.href='login.jsp'"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
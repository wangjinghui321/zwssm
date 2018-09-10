<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String userName=new String(request.getParameter("userName").getBytes("ISO-8859-1"),"utf-8");
String password=new String(request.getParameter("password").getBytes("ISO-8859-1"),"utf-8");
String password2=new String(request.getParameter("password2").getBytes("ISO-8859-1"),"utf-8");
  Connection con=null;
  Statement st=null;
  ResultSet rs=null;
  try{
	  Class.forName("com.mysql.jdbc.Driver");
	  String url="jdbc:mysql://localhost:3306/student? useUnicode=true&characterEncoding=gbk";
	  con=DriverManager.getConnection(url,"root","root");
	  st=con.createStatement();
	  String query="update user set password='"+password+"' ,password2='"+password2+"' where userName='"+userName+"'";
	  st.executeUpdate(query);
	  response.sendRedirect("../login/login.jsp");
  }catch(Exception e){
	  e.printStackTrace();
  }finally{
	  st.close();
	  con.close();
  }
%>
</body>
</html>
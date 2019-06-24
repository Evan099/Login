<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录后提示页面</title>
</head>
<body>



	<%
	String tishiInfo = (String)request.getAttribute("tishiInfo");
	out.print(tishiInfo);
	
	%>
	
	
</body>
</html>
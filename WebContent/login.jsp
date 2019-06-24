<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme()+":"+request.getServletContext().getContextPath();
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
    <h3>登录</h3>
    <form method="POST" action="<%=basePath%>/Login">
        <table>
             <tr>
                <td>账号:</td>
                <td><input type="text" name="usernum" placeholder="3位数数字"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="text" name="password" placeholder="6位数数字"></td>
            </tr>
        </table>
        <button type="submit">登录</button><br>
       	<a href="register.jsp">没有账号？注册</a>
    </form>
</body>

</html>
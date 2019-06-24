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
    <h3>注册</h3>
    <form method="POST" action="<%=basePath%>/Register">
        <table>
            <tr>
                <td>账号:</td>
                <td><input type="text" name="usernum"></td>
            </tr>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="text" name="password"></td>
            </tr>
        </table>
        <button type="submit">注册</button><br>
        <a href="login.jsp">已有账号？去登录</a>
    </form>
    
    
    
</body>

</html>
package com.imooc.servlet;

import java.io.IOException;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.userlist.User;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, User> getUserInfoList = Register.userList;
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String usernum = request.getParameter("usernum");
		String password = request.getParameter("password");
		System.out.println("----登录信息打印----");
		System.out.println(usernum);
		System.out.println(password);

	
		System.out.println(getUserInfoList.entrySet());
		
		System.out.println("-----遍历获取到的hashmap------");
		System.out.println(getUserInfoList);
		
		//判读用户名和密码是否正确（将用户输入账号和密码与hashmap中的key和password进行比对）
		

			boolean flag = false;
			for(String key:getUserInfoList.keySet()) {
				User e = getUserInfoList.get(key);
				if(usernum.equals(e.getUsernum()) && password.equals(e.getPassword())) {
					 flag = true;
					 break;
				}else {
					flag = false;
				}
			}
			
			//转发与重定向区别：重定向不能使用request带数据到跳转的页面，而转发可以，如果要带可以使用session带
			
			//通过转发（request）（页面不跳转）实现跳转
			if(flag == true) {
				//跳转页面并提示注册成功
				request.setAttribute("tishiInfo", "登录成功！");//携带提示信息
				request.getRequestDispatcher("/tishiLoginPage.jsp").forward(request, response);
			}else {
				request.setAttribute("tishiInfo", "登录失败！");//携带提示信息
				//跳转页面并提示注册成功
				request.getRequestDispatcher("/tishiLoginPage.jsp").forward(request, response);
			}
				
			
			
			//通过重定向（response）（页面会跳转）实现跳转并带提示信息
//			if(flag == true) {
//				//跳转成功页面
//				response.sendRedirect("/Login/success.jsp");
//			}else {
//				//跳转失败页面
//				response.sendRedirect("/Login/fail.jsp");
//			}
			

	
		
	}


}

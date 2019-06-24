package com.imooc.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.userlist.User;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 public static Map<String,User> userList = new HashMap<>();
	 
       

    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String usernum = request.getParameter("usernum");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(usernum);
		System.out.println(username);
		System.out.println(password);
		
		
		
		userList.put(usernum, new User(usernum,username,password));
		
		System.out.println("-----遍历map-----");
		
		
		for(String key:userList.keySet()) {
			System.out.println("key:"+key+"，value:"+userList.get(key));
		}
		
		
		//跳转页面并提示注册成功
		
		response.sendRedirect("/Login/tishiRegisterPage.jsp");

//			request.getRequestDispatcher("/tishi.jsp");
	
		
		
	}

}

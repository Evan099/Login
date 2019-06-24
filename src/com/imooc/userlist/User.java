package com.imooc.userlist;

public class User {
	String usernum;
	String username;
	String password;

	public User() {
		
	}

	
	public User(String usernum,String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.usernum = usernum;
	}
	
	public String getUsernum() {
		return usernum;
	}
	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [账号=" + usernum + ",用户名=" + username + ", 密码=" + password + "]";
	}


	
	
	
	
	

}

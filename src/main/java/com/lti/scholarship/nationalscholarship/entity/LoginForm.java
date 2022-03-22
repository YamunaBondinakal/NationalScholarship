package com.lti.scholarship.nationalscholarship.entity;

public class LoginForm {

	private Long userName;
	private String password;
	
	public LoginForm(Long userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public LoginForm() {
		
	}

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

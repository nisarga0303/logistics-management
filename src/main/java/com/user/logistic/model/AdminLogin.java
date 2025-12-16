package com.user.logistic.model;

public class AdminLogin {

	private String adminId;
	private String adminPassword;
	
	
	
	
	public AdminLogin() {
		super();
	}




	public AdminLogin(String adminId, String adminPassword) {
		
		this.adminId = adminId;
		this.adminPassword = adminPassword;
	}




	public String getAdminId() {
		return adminId;
	}




	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}




	public String getAdminPassword() {
		return adminPassword;
	}




	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
	
	
}

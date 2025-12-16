package com.user.logistic.model;

public class EmployeeLogin {
	private String employeeId;
	private String employeePassword;
	
	
	public EmployeeLogin(String employeeId, String employeePassword) {
		super();
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
	}


	public EmployeeLogin() {
		super();
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeePassword() {
		return employeePassword;
	}


	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}


	@Override
	public String toString() {
		return "EmployeeLogin [employeeId=" + employeeId + ", employeePassword=" + employeePassword + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}





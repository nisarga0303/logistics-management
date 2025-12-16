package com.user.logistic.model;

public class EmployeeRegister {

	private String employeeId;
	private String employeePassword;
	private String employeeName;
	private Long employeeNumber;
	private String gender;
	private String employeeEmail;
	private String employeeAddress;
	
	public EmployeeRegister() {
		
	}
	public EmployeeRegister(String employeeId, String employeePassword, String employeeName, Long employeeNumber,
			String gender, String employeeEmail, String employeeAddress) {
		
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.gender = gender;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
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
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "EmployeeRegister [employeeId=" + employeeId + ", employeePassword=" + employeePassword
				+ ", employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", gender=" + gender
				+ ", employeeEmail=" + employeeEmail + ", employeeAddress=" + employeeAddress + "]";
	}
	
	
	
}

package com.user.logistic.model;

public class WorkReport {
	private String employeeId;
	private String startDate;
	private String endDate;
	private String ordereReceived;
	private String  orderDelivered;
	
	
	public WorkReport() {
		
	}


	public WorkReport(String employeeId, String startDate, String endDate, String ordereReceived,
			String orderDelivered) {
		
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ordereReceived = ordereReceived;
		this.orderDelivered = orderDelivered;
	}


	@Override
	public String toString() {
		return "WorkReport [employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", ordereReceived=" + ordereReceived + ", orderDelivered=" + orderDelivered + "]";
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getOrdereReceived() {
		return ordereReceived;
	}


	public void setOrdereReceived(String ordereReceived) {
		this.ordereReceived = ordereReceived;
	}


	public String getOrderDelivered() {
		return orderDelivered;
	}


	public void setOrderDelivered(String orderDelivered) {
		this.orderDelivered = orderDelivered;
	}


	
	
	
	

}

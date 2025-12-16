package com.user.logistic.model;

public class CustomerRegister {
	
	private Long customerId;
	private String customerName;
	private Long customerNumber;
	private String email;
	private String itemName;
	private String itemDescription;
	private String address1;
	private String address2;
	
	
	public CustomerRegister()
	{
	}
	
	public CustomerRegister(Long customerId, String customerName, Long customerNumber, String email, String itemName,
			String itemDescription, String address1, String address2) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.email = email;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.address1 = address1;
		this.address2 = address2;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Override
	public String toString() {
		return "CustomerRegister [customerId=" + customerId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", email=" + email + ", itemName=" + itemName + ", itemDescription="
				+ itemDescription + ", address1=" + address1 + ", address2=" + address2 + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
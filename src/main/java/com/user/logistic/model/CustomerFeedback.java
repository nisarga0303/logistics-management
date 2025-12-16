package com.user.logistic.model;

public class CustomerFeedback {

	private Long customerId;
	private String message;
	
	public CustomerFeedback() {
		
	}

	public CustomerFeedback(Long customerId, String message) {
		super();
		this.customerId = customerId;
		this.message = message;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomerFeedback [customerId=" + customerId + ", message=" + message + "]";
	}


}

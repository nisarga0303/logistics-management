package com.user.logistic.service;



import java.util.List;

import com.user.logistic.dao.CustomerDao;
import com.user.logistic.model.CustomerFeedback;
import com.user.logistic.model.CustomerRegister;

public class CustomerService {


	
	
	public String addCustomer(CustomerRegister registerobj) 
	{

		CustomerDao daoobj=new CustomerDao();
		return daoobj.addCustomer(registerobj);
	
				
	}

	public List<CustomerRegister> getAllCustomer()
	{
		CustomerDao daoObj=new CustomerDao();
		return daoObj.getAllCustomer();
	}

	public List<CustomerRegister> getById(Long customerId) {
		
		CustomerDao daoObj=new CustomerDao();
		return daoObj.getById(customerId);
		
		
	}

	public String updateCustomer(CustomerRegister registerobj) {
		
		CustomerDao daoObj=new CustomerDao();
		return daoObj.updateCustomer(registerobj);
		
		
	}

	public String  deleteCustomer(Long customerId) {
	
		
		CustomerDao daoObj=new CustomerDao();
		return daoObj.deleteCustomer(customerId);
		
	}


	public String addCustomerFeedback(CustomerFeedback cfObj) {
	
		CustomerDao daoObj=new CustomerDao();
		return daoObj.addCustomerFeedback(cfObj);
		
		
	}

	public List<CustomerFeedback> getAllFeedback() {
		

		CustomerDao daoObj=new CustomerDao();
		return daoObj.getCustomerFeedback();
		
		
		
	}
	
}

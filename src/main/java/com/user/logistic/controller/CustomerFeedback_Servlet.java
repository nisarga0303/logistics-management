package com.user.logistic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.CustomerFeedback;
import com.user.logistic.model.EmployeeRegister;
import com.user.logistic.model.WorkReport;
import com.user.logistic.service.CustomerService;
import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class CustomerFeedback_Servlet
 */
@WebServlet("/CustomerFeedback_Servlet")
public class CustomerFeedback_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	  
	    long resCustomerId = Long.parseLong(req.getParameter("customerId"));
	  	String resMessage = req.getParameter("message");
	  
	  	req.setAttribute("customerId",resCustomerId);
	  	req.setAttribute("message",resMessage);
	  	
	  	req.getRequestDispatcher("EmployeeHome.jsp").forward(req, resp);
	  	
	  	CustomerFeedback cfObj=new CustomerFeedback(resCustomerId,resMessage);
		
	  	CustomerService csobj=new CustomerService();
		String res=csobj.addCustomerFeedback(cfObj);
		System.out.println(res);
	  	
	}

}




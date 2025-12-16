package com.user.logistic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.CustomerRegister;
import com.user.logistic.service.CustomerService;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")


public class CustomerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		
	
	long resCustomerId = Long.parseLong(req.getParameter("CustomerId"));
	String resCustomerName = req.getParameter("CustomerName");
	long resCustomerNumber = Long.parseLong(req.getParameter("CustomerNumber"));
	String resEmail = req.getParameter("Email");
	String resItemName = req.getParameter("ItemName");
	String resItemDescription = req.getParameter("ItemDescription");	
	String resAddress1 = req.getParameter("Address1");
	String resAddress2 = req.getParameter("Address2");

	
	
	
	
	req.setAttribute("CustomerId",resCustomerId);
	req.setAttribute("CustomerName",resCustomerName);
	req.setAttribute("CustomerNumber",resCustomerNumber);
	req.setAttribute("Email",resEmail);
	req.setAttribute("Address1",resAddress1);	
	req.setAttribute("Address2",resAddress2);
	req.setAttribute("ItemName",resItemName);
	req.setAttribute("ItemDescription",resItemDescription);
	
	
//	PrintWriter out=resp.getWriter();
//	out.println("Form Details:");
//	out.println("CustomerId:"+resCustomerId);
//	out.println("CustomerName:"+resCustomerName);
//	out.println("CustomerNumber:"+resCustomerNumber);
//	out.println("Email:"+resEmail);
//	out.println("Address1:"+resAddress1);
//	out.println("Address2:"+resAddress2);
//	out.println("ItemName:"+resItemName);
//	out.println("ItemDescription:"+resItemDescription);
	
	
	
	


	CustomerRegister registerobj=new CustomerRegister(resCustomerId,resCustomerName,resCustomerNumber,resEmail,resItemName,resItemDescription,resAddress1,resAddress2);
	CustomerService csobj=new CustomerService();
	req.getRequestDispatcher("GetCustomer.jsp").forward(req, resp);

	String res=csobj.addCustomer(registerobj);
	System.out.println(res);

	}
	
}

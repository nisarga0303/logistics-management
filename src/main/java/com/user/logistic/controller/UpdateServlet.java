package com.user.logistic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.CustomerRegister;
import com.user.logistic.service.CustomerService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	
	long resCustomerId = Long.parseLong(req.getParameter("CustomerId"));
	String resCustomerName = req.getParameter("CustomerName");
	long resCustomerNumber = Long.parseLong(req.getParameter("CustomerNumber"));
	String resEmail = req.getParameter("Email");
	String resItemName = req.getParameter("ItemName");
	String resItemDescription = req.getParameter("ItemDescription");	
	String resAddress1 = req.getParameter("Address1");
	String resAddress2 = req.getParameter("Address2");

	req.getRequestDispatcher("GetCustomer.jsp").forward(req, resp);
	CustomerRegister registerobj=new CustomerRegister(resCustomerId,resCustomerName,resCustomerNumber,resEmail,resItemName,resItemDescription,resAddress1,resAddress2);
	CustomerService csobj=new CustomerService();
	String res=csobj.updateCustomer(registerobj);
	System.out.println(res);
	
}

}
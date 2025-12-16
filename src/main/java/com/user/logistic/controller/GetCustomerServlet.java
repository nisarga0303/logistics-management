package com.user.logistic.controller;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class GetCustomerServlet
 */
@WebServlet("/GetCustomerServlet")
public class GetCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
		CustomerService csobj=new CustomerService();
		List<CustomerRegister> customerList =  csobj.getAllCustomer();
		req.setAttribute("CL", customerList);
		req.getRequestDispatcher("ViewCustomer.jsp").forward(req, resp);
		}

}

package com.user.logistic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.service.CustomerService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		Long customerId	= Long.parseLong(req.getParameter("DeleteCustomer"));
    	CustomerService cs = new CustomerService();
    	String res=cs.deleteCustomer(customerId);
    	System.out.println(res);
    
    	req.getRequestDispatcher("GetCustomer.jsp").forward(req, resp);

		
		}
	
}

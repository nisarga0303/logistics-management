package com.user.logistic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.CustomerFeedback;
import com.user.logistic.service.CustomerService;





/**
 * Servlet implementation class ViewFeedback_Servlet
 * @param <CustomerFeedback>
 */
@WebServlet("/ViewFeedback_Servlet")
public class ViewFeedback_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    	{
    		
    	CustomerService csobj=new CustomerService();
    	
    	
	    
		List <CustomerFeedback> feedbackList =  csobj.getAllFeedback();

		req.setAttribute("FL", feedbackList);
		req.getRequestDispatcher("ViewFeedback.jsp").forward(req, resp);
    	
    	
    	}
}

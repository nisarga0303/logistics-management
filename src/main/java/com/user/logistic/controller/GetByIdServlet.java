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
 * Servlet implementation class GetByIdServlet
 */
@WebServlet("/GetByIdServlet")
public class GetByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Long customerId	= Long.parseLong(req.getParameter("GetByID"));
    	CustomerService cs = new CustomerService();
    	List <CustomerRegister> arrayList= cs.getById(customerId);
    	req.setAttribute("CL",arrayList);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/ViewCustomer.jsp");
		dispatcher.forward(req,resp);
		
		req.getRequestDispatcher("GetCustomer.jsp").forward(req, resp);
		}		  
    	  
    	  
  }








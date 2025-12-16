package com.user.logistic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.user.logistic.model.EmployeeRegister;

import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class ViewEmployeeServlet
 */
@WebServlet("/ViewEmployeeServlet")
public class ViewEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
	    EmployeeService esobj=new EmployeeService();
	    
		List<EmployeeRegister> employeeList =  esobj.getAllEmployee();
		req.setAttribute("EL", employeeList);
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
	}

}

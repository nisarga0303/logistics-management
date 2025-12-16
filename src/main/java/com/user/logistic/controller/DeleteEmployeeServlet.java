package com.user.logistic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.EmployeeRegister;
import com.user.logistic.service.CustomerService;
import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		
    	String resemployeeId = req.getParameter("DeleteEmployee");
		
		EmployeeService esobj=new EmployeeService();
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
		String res=esobj.deleteEmployee(resemployeeId);
		System.out.println(res);
		
		
    	
   
    	
	
    	
    	
    	
    	}
}

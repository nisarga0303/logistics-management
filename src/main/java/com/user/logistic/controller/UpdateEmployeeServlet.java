package com.user.logistic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.CustomerRegister;
import com.user.logistic.model.EmployeeRegister;
import com.user.logistic.service.CustomerService;
import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		
		String resemployeeId = req.getParameter("employeeId");
		String resemployeePassword = req.getParameter("employeePassword");
		String resemployeeName =req.getParameter("employeeName");
		long resemployeeNumber =  Long.parseLong(req.getParameter("employeeNumber"));
		String resgender = req.getParameter("gender");
		String resemployeeEmail = req.getParameter("employeeEmail");	
		String resemployeeAddress = req.getParameter("employeeAddress");

		
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
		EmployeeRegister registerobj=new EmployeeRegister(resemployeeId,resemployeePassword,resemployeeName,resemployeeNumber,resgender,resemployeeEmail,resemployeeAddress);
		EmployeeService csobj=new EmployeeService();
		String res=csobj.updateEmployee(registerobj);
		System.out.println(res);

	
	
	
	
	

	
}
}
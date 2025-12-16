package com.user.logistic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.AdminLogin;

import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
		String resAdminId = req.getParameter("adminId");
		String resAdminPassword = req.getParameter("adminPassword");
		
		AdminLogin loginObj=new AdminLogin(resAdminId,resAdminPassword);
		EmployeeService esobj=new EmployeeService();
		
		String a=esobj.AdminLogin(loginObj, req, resp);
		System.out.println(a);
   }
	   
}

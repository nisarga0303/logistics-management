package com.user.logistic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.WorkReport;
import com.user.logistic.service.EmployeeService;

/**
 * Servlet implementation class WorkReportServlet
 */
@WebServlet("/WorkReportServlet")
public class WorkReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	  
	  	String resEmployeeId = req.getParameter("employeeId");
	  	String resStartDate = req.getParameter("startDate");
		String resEndDate = req.getParameter("endDate");
		String resOrdereReceived =req.getParameter("ordereReceived");
		String resOrderDelivered=req.getParameter("orderDelivered");
		
		req.getRequestDispatcher("EmployeeHome.jsp").forward(req, resp);
		
		WorkReport wrObj=new WorkReport(resEmployeeId,resStartDate,resEndDate,resOrdereReceived,resOrderDelivered);
		
		EmployeeService esobj=new EmployeeService();
		String res=esobj.addWorkReport(wrObj);
		System.out.println(res);
}
}

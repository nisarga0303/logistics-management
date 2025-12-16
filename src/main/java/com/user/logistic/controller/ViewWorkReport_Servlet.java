package com.user.logistic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.model.WorkReport;
import com.user.logistic.service.EmployeeService;



/**
 * Servlet implementation class ViewWorkReport_Servlet
 */
@WebServlet("/ViewWorkReport_Servlet")
public class ViewWorkReport_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		
    	EmployeeService esobj=new EmployeeService();
    	
    	
	    
		List <WorkReport> WorkReportList =  esobj.getAllWorkReport();

		req.setAttribute("WL", WorkReportList);
		req.getRequestDispatcher("ViewWorkReport.jsp").forward(req, resp);
    	
    	
    	}
    	
    	
    	

}

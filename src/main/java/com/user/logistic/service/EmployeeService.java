package com.user.logistic.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.dao.EmployeeDao;

import com.user.logistic.model.EmployeeRegister;
import com.user.logistic.model.WorkReport;
import com.user.logistic.model.AdminLogin;
import com.user.logistic.model.EmployeeLogin;

public class EmployeeService {

	public String addEmployee(EmployeeRegister registerobj) {
		
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.addEmployee(registerobj);
	
	}

	public List<EmployeeRegister> getAllEmployee() 
	{
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.getAllEmployee();
		
		
	}

	public String updateEmployee(EmployeeRegister registerobj) {
		
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.updateEmployee(registerobj);
	
	}

	public String deleteEmployee(String resemployeeId) {
		
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.deleteEmployee(resemployeeId);
		
	}


	public String AdminLogin(AdminLogin loginObj, HttpServletRequest req, HttpServletResponse resp) {
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.adminLogin(loginObj,req,resp);
	}

	public String addWorkReport(WorkReport wrObj) {
		
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.addWorkReport(wrObj);
	}

	public List<WorkReport> getAllWorkReport() {
		
		EmployeeDao daoobj=new EmployeeDao();
		return daoobj.getAllWorkReport();
		
		
	}

	

}

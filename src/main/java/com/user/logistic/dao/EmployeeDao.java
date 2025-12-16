package com.user.logistic.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.logistic.model.AdminLogin;
import com.user.logistic.model.CustomerRegister;
import com.user.logistic.model.EmployeeLogin;
import com.user.logistic.model.EmployeeRegister;
import com.user.logistic.model.WorkReport;


public class EmployeeDao {

	List<EmployeeRegister> arrayList = new ArrayList<EmployeeRegister>();
	List<WorkReport> worklist = new ArrayList<WorkReport>();
	String url = "jdbc:mysql://localhost:3306/LOGISTIC";
	String user = "root";
	String password = "nisarga03";

	
	public String addEmployee(EmployeeRegister registerobj) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String query="INSERT INTO EMP_REGISTER(employeeId,employeePassword,employeeName,employeeNumber,gender,employeeEmail,employeeAddress)VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, registerobj.getEmployeeId());
			pst.setString(2, registerobj.getEmployeePassword());
			pst.setString(3, registerobj.getEmployeeName());
			pst.setLong(4, registerobj.getEmployeeNumber());
			pst.setString(5, registerobj.getGender());
			pst.setString(6, registerobj.getEmployeeEmail());
			pst.setString(7, registerobj.getEmployeeAddress());
			
			int res =pst.executeUpdate();
			if(res>0)
			{
				return res+" "+"Rows created";
			}

			
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return "error";
		
	
		
	}




	public List<EmployeeRegister> getAllEmployee() {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM EMP_REGISTER");
			
			

			while (rs.next()) {
				String employeeId = rs.getString("employeeId");
				String employeePassword = rs.getString("employeePassword");
				String employeeName = rs.getString("employeeName");
				Long employeeNumber = rs.getLong("employeeNumber");
				String gender = rs.getString("gender");
				String employeeEmail = rs.getString("employeeEmail");
				String employeeAddress = rs.getString("employeeAddress");
				

			
				arrayList.add(new EmployeeRegister(employeeId,employeePassword,employeeName,employeeNumber,gender,employeeEmail,employeeAddress));
			
			}

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return arrayList;

	}




	public String updateEmployee(EmployeeRegister registerobj) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM  EMP_REGISTER WHERE employeeId = "+registerobj.getEmployeeId());
			while(rs.next())
			{			
				String Updatequery = "UPDATE EMP_REGISTER SET employeePassword = ?, employeeName = ? ,employeeNumber=?,gender=?,employeeEmail=?,employeeAddress=? WHERE employeeId = ?";
				PreparedStatement pst = con.prepareStatement(Updatequery);
				
				pst.setString(1, registerobj.getEmployeePassword());
				pst.setString(2, registerobj.getEmployeeName());
				pst.setLong(3, registerobj.getEmployeeNumber());
				pst.setString(4, registerobj.getGender());
				pst.setString(5, registerobj.getEmployeeEmail());
				pst.setString(6, registerobj.getEmployeeAddress());
				pst.setString(7, registerobj.getEmployeeId());
				
	
				int Updateresult =pst.executeUpdate();
				
				if(Updateresult>0)
				{
					return Updateresult+"Rows Updated";
				}
				System.out.println(Updateresult);
			}		

		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return "Error";
	}




	public String deleteEmployee(String resemployeeId) {
		
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM EMP_REGISTER WHERE employeeId = "+resemployeeId);
			while(rs.next())
			{			
				String deleteQuery = "Delete from EMP_REGISTER where employeeId=?";
				PreparedStatement pst = con.prepareStatement(deleteQuery);
				
				pst.setString(1, resemployeeId);
				
	
				int del =pst.executeUpdate();
				
				if(del>0)
				{
					return del+"Rows Deleted";
				}
				
			}		

		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return "Error";
	}








	public String adminLogin(AdminLogin loginObj, HttpServletRequest req, HttpServletResponse resp) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String query = "SELECT * FROM ADMIN WHERE AdminId=? AND Password=?";
			PreparedStatement pst = con.prepareStatement(query);
	        pst = con.prepareStatement(query);
	        pst.setString(1,loginObj.getAdminId());
	        pst.setString(2, loginObj.getAdminPassword());
	        
	        ResultSet rs = pst.executeQuery();
	
	        if(rs.next())
	        {
	        	
	        	 System.out.println("Login Success");
	        	 
	            // User found, set session attribute to mark the user as logged in
	            HttpSession session = req.getSession();
	            session.setAttribute("employeeId",loginObj.getAdminPassword());
	          
	            
	            // Redirect to .jsp page upon successful login
	            resp.sendRedirect("ViewEmployee.jsp");
	        } 
	        else
	        {
	        	resp.sendRedirect("AdminLogin.jsp");
	        	
	        	System.out.println("Invalid username or password. Please try again");
	        }   
	        	
	          	
	        
		}catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}




	public String addWorkReport(WorkReport wrObj)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			String query="INSERT INTO WORK_REPORT(employeeId,StartDate,EndDate,OrdereReceived,OrderDelivered)VALUES(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, wrObj.getEmployeeId());
			pst.setString(2, wrObj.getStartDate());
			pst.setString(3, wrObj.getEndDate());
			pst.setString(4, wrObj.getOrdereReceived());
			pst.setString(5, wrObj.getOrderDelivered());
			
			
			int res =pst.executeUpdate();
			if(res>0)
			{
				return res+" "+"Rows created";
			}

			
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return "error";
		
	}




	public List<WorkReport> getAllWorkReport() {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM WORK_REPORT");
			
			

			while (rs.next()) {
				String employeeId = rs.getString("employeeId");
				String StartDate = rs.getString("StartDate");
				String EndDate = rs.getString("EndDate");
				String OrdereReceived = rs.getString("OrdereReceived");
				String OrderDelivered = rs.getString("OrderDelivered");
				worklist.add( new WorkReport(employeeId,StartDate,EndDate,OrdereReceived,OrderDelivered));
			
			}

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return worklist;

	}



	public boolean validateUser(String resEmployeeId, String resEmployeePassword, HttpServletRequest request,
	        HttpServletResponse response) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, user, password);
	        String query = "SELECT * FROM EMP_REGISTER WHERE employeeId=? AND employeePassword=?";
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setString(1, resEmployeeId);
	        pst.setString(2, resEmployeePassword);

	        ResultSet rs = pst.executeQuery();

	        if (rs.next()) {
	            System.out.println("Login Success");

	            // User found, set session attribute to mark the user as logged in
	            HttpSession session = request.getSession();
	            session.setAttribute("employeeId", resEmployeeId);
	            return true; // Indicate successful login
	        } else {
	            return false; // Indicate login failure
	        }

	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	        return false; // Default return value
	    }
	}


	
	

	

	

	
}

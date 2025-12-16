package com.user.logistic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.user.logistic.model.CustomerFeedback;
import com.user.logistic.model.CustomerRegister;


public class CustomerDao {
	
	List<CustomerRegister> arrayList = new ArrayList<CustomerRegister>();
	List <CustomerFeedback> feedbacklist=new ArrayList<CustomerFeedback>();
	String url = "jdbc:mysql://localhost:3306/LOGISTIC";
	String user = "root";
	String password = "nisarga03";

	public String addCustomer(CustomerRegister registerobj)
	{
			
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String query="INSERT INTO REGISTER (CustomerId	,CustomerName,CustomerNumber,Email,ItemName,ItemDescription,Address1,Address2)VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setLong(1, registerobj.getCustomerId());
			pst.setString(2, registerobj.getCustomerName());
			pst.setLong(3, registerobj.getCustomerNumber());
			pst.setString(4, registerobj.getEmail());
			pst.setString(5, registerobj.getItemName());
			pst.setString(6, registerobj.getItemDescription());
			pst.setString(7, registerobj.getAddress1());
			pst.setString(8, registerobj.getAddress2());
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

	public List<CustomerRegister> getAllCustomer() 
	{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM REGISTER");

				while (rs.next()) {
					Long customerId = rs.getLong("customerId");
					String customerName = rs.getString("customerName");
					Long customerNumber = rs.getLong("customerNumber");
					String email = rs.getString("email");
					String itemName = rs.getString("itemName");
					String itemDescription = rs.getString("itemDescription");
					String address1 = rs.getString("address1");
					String address2 = rs.getString("address2");

				
					arrayList.add(new CustomerRegister(customerId,customerName,customerNumber,email,itemName,itemDescription,address1,address2));
				
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return arrayList;
	}

	public List<CustomerRegister> getById(Long customerId) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM REGISTER WHERE CustomerId = "+customerId);

			while (rs.next()) 
			{
				Long customerID = rs.getLong("customerId");
				String customerName = rs.getString("customerName");
				Long customerNumber = rs.getLong("customerNumber");
				String email = rs.getString("email");
				String itemName = rs.getString("itemName");
				String itemDescription = rs.getString("itemDescription");
				String address1 = rs.getString("address1");
				String address2 = rs.getString("address2");

			
				arrayList.add(new CustomerRegister(customerID,customerName,customerNumber,email,itemName,itemDescription,address1,address2));
			
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	public String updateCustomer(CustomerRegister registerobj) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM REGISTER WHERE CustomerId = "+registerobj.getCustomerId());
			while(rs.next())
			{			
				String Updatequery = "UPDATE REGISTER SET CustomerName = ?, CustomerNumber = ? ,Email=?,ItemName=?,ItemDescription=?,Address1=?,Address2=? WHERE CustomerId = ?";
				PreparedStatement pst = con.prepareStatement(Updatequery);
				
				pst.setString(1, registerobj.getCustomerName());
				pst.setLong(2, registerobj.getCustomerNumber());
				pst.setString(3, registerobj.getEmail());
				pst.setString(4, registerobj.getItemName());
				pst.setString(5, registerobj.getItemDescription());
				pst.setString(6, registerobj.getAddress1());
				pst.setString(7, registerobj.getAddress2());
				pst.setLong(8, registerobj.getCustomerId());
	
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

	public String deleteCustomer(Long customerId) {
		
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM REGISTER WHERE CustomerId = "+customerId);
			while(rs.next())
			{			
				String deleteQuery = "Delete from REGISTER where CustomerId=?";
				PreparedStatement pst = con.prepareStatement(deleteQuery);
				
				pst.setLong(1, customerId);
				
	
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

	public String addCustomerFeedback(CustomerFeedback cfObj) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String query="INSERT INTO CUST_FEEDBACK (CustomerId	,Msg)VALUES(?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setLong(1, cfObj.getCustomerId());
			pst.setString(2, cfObj.getMessage());
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

	public List<CustomerFeedback> getCustomerFeedback() {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM CUST_FEEDBACK");

			while (rs.next()) {
				Long customerId = rs.getLong("customerId");
				String message = rs.getString("Msg");
				

				feedbacklist.add(new CustomerFeedback(customerId,message));
				
			
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return feedbacklist;
	}

	




}

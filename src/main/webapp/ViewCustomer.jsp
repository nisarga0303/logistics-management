<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Customer</title>
<STYLE>h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}</STYLE>
</head>
 <body style="background-color:pink;"> 

 <center><h1>CUSTOMER DETAILS</h1>


    <table border="10px"  style="border-color:cyan">
        <thead>
            <tr>
                <th>Customer Id</th>
                <th>Customer Name</th>
                <th>Customer Number</th>
                <th>Email</th>
                <th>Item Name</th>
                <th>Item Description</th>
                <th>From Address</th>
                <th>To Address</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cList" items="${CL}">
                <tr>
                   
                  <td>${cList.customerId}</td>
                  <td>${cList.customerName}</td>
                  <td>${cList.customerNumber}</td>
                  <td>${cList.email}</td>
                  <td>${cList.itemName}</td>
                  <td>${cList.itemDescription}</td>
                  <td>${cList.address1}</td>
                  <td>${cList.address2}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table><br><br>
    </center>
    
</body>
</html>
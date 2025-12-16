<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style>

body{
 background-repeat: no-repeat;
   background-size: 100% 270%;
   

}

 button{
 		color:black;
       background-color:beige;
       height:35px;
       width:150px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:green;
    border-color:  blueviolet;
    
}
table {
background-color:wheat;
  border-collapse: collapse;
}

td {
 font-weight: bold;
  color:  purple; /* Change this to the desired color */
  border: 1px solid black; /* Just for demonstration, you can remove this if not needed */
  padding: 8px; /* Just for demonstration, you can remove this if not needed */
}

</style>
</head>
<body background="Images/admin2.jpg">


<form action="viewAction">
<center>
<h1>WELCOME TO ADMIN PANEL</h1>
<button type="submit">View Employee</button> &nbsp&nbsp&nbsp
<button><a href="AddEmployee.jsp">Add Employee</a></button>  &nbsp&nbsp&nbsp
<button><a href="UpdateEmployee.jsp">Update Employee</a></button>&nbsp&nbsp&nbsp
<button><a href="DeleteEmployee.jsp">Delete Employee</a></button>&nbsp&nbsp&nbsp
<button><a href="EmployeeHome.jsp">View Customer Details</a></button>&nbsp&nbsp&nbsp
<button><a href="ViewFeedback.jsp">View Feedback</a></button>&nbsp&nbsp&nbsp		
<button><a href="ViewWorkReport.jsp">View Work Report </a></button>&nbsp&nbsp&nbsp

</center>
</form>

<br><br>

<center>

    <table border="10px"  style="border-color:purple">
        <thead>
            <tr>
                <th>Employee Id</th>
                <th>Employee Password</th>
                <th>Employee Name</th>
                <th>Employee Number</th>
                <th>Gender</th>
                <th>Employee Email</th>
                <th>Employee Address</th>
              
            </tr>
        </thead>
        <tbody>
            <c:forEach var="eList"  items="${EL}">
                <tr>
                   
                  <td>${eList.employeeId}</td>
                  <td>${eList.employeePassword}</td>
                  <td>${eList.employeeName}</td>
                  <td>${eList.employeeNumber}</td>
                  <td>${eList.gender}</td>
                  <td>${eList.employeeEmail}</td>
                  <td>${eList.employeeAddress}</td>
                  
                </tr>
            </c:forEach>
        </tbody>
    </table><br><br>
</center>

    


</body>
</html>
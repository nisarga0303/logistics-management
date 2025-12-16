<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Work Report</title>

<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 340%;
   }
    button{
       background-color:purple;
       height:40px;
       width:250px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:cyan;
    border-color:  blueviolet;
    
}



</style>
</head>
<body  background="Images/Img3.jpg" >
<center>
<form action="viewWorkReportAction">
<button type="submit">VIEW WORK REPORT</button>
</form>



 <h3>WORK REPORT LIST</h3>
    <table border="10px"  style="border-color:purple">
        <thead>
            <tr>
                <th>Employee ID </th>
                <th>Start Date</th>
				 <th>End Date</th>
				  <th>Number of Order Received</th>
				   <th>Number of Order Delivered</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach var="wList" items="${WL}">
                <tr>
                   
                  <td>${wList.employeeId}</td>
                  <td>${wList.startDate}</td>
                  <td>${wList.endDate}</td>
                  <td>${wList.ordereReceived}</td>
                  <td>${wList.orderDelivered}</td>
                  
                </tr>
            </c:forEach>
        </tbody>
    </table><br><br>
</center>
</body>
</html>
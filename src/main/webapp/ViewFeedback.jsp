<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Feedback</title>
<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 340%;
   }
    button{
       background-color:cyan;
       height:40px;
       width:250px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:purple;
    border-color:  blueviolet;
    
}



</style>
</head>
<body background="Images/Img3.jpg" >

<form action="viewFeedbackAction">
<center>
<button type="submit">View Feedback</button>
</form>



 <h3>Feedback List</h3>
    <table border="10px"  style="border-color:black">
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>Message</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fList" items="${FL}">
                <tr>
                   
                  <td>${fList.customerId}</td>
                  <td>${fList.message}</td>
                
                </tr>
            </c:forEach>
        </tbody>
    </table><br><br>
    </center>

</body>
</html>
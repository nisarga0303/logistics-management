<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

    
<head>

<meta charset="ISO-8859-1">
<title>EMPLOYEE Home Page</title>

 <link rel="stylesheet" type="text/css"  href="./Employee.css"/>
<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 130%;
}

.mydiv{

padding-top:80px;
padding-bottom:100px;
padding-left:100px;
padding-right:100px;
}
h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}
.btn1{
   
    width:200px;
    border-radius: 10px;
    
}
.btn1:hover{
	border: 5px;
    border-style:solid;
    background-color: green;
    border-color:  blueviolet;

}


        /* Styles for the success message container */
        .success-message {
            display: none; /* Hide the message by default */
            padding: 10px;
            background-color: #dff0d8; /* Greenish color, you can change it */
            border: 1px solid #c3e6cb; /* Light green border */
            border-radius: 4px;
            margin-bottom: 15px;
 }
</style>






</head>

<body  background="Images/Img2.jpg">

<div class="success-message" id="successMessage">
    Login Successful!
</div>

<% if (request.getAttribute("loginSuccess") != null && (boolean) request.getAttribute("loginSuccess")) { %>
    <script>
        // JavaScript to display the success message after successful login
        document.addEventListener("DOMContentLoaded", function() {
            var successMessage = document.getElementById("successMessage");
            successMessage.style.display = "block";
            setTimeout(function() {
                successMessage.style.display = "none";
            }, 1000); // Collapse after 10 seconds
        });
    </script>
<% } %>  



<center>
<h1>LOGISTIC MANAGEMENT</h1><br><br>
<div class="mydiv">

<button class="btn1"><b><a href="AddCustomer.jsp">Add Customer</a></b></button><br><br>
<button class="btn1"><b><a href="GetCustomer.jsp">View Customer Details</a></b></button><br><br>
<button class="btn1"><b><a href="GetByID.jsp">Get Customer ByID </a></b></button><br><br>
<button class="btn1"><b><a href="UpdateCustomer.jsp">Update Customer</a></b></button><br><br>
<button class="btn1"><b><a href="DeleteCustomer.jsp">Delete Customer</a></b></button><br><br>
<button class="btn1"><b><a href="CustomerFeedback.jsp">Customer Feedback</a></b></button><br><br>
<button class="btn1"><b><a href="AddWorkReport.jsp">Add Work Report</a></b></button><br><br>

<button class="btn1"><b><a href="EmployeeLogout.jsp">LOGOUT</a></b></button><br><br>

</div>
</center>
</body>
</html>
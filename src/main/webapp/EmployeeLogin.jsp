<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>

<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 120%;
}
h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}
form {


    display: block;
    flex-direction: column;
    max-width: 350px; /* Adjust the max-width as needed */
    margin: 0 auto; /* Center the form horizontally */
   }
input {
   
    border-radius: 10px;
    padding: 10px;
    margin-bottom: 10px;
}
.mydiv{

padding-top:150px;
padding-bottom:100px;
padding-left:100px;
padding-right:100px;
}
 button{
       background-color:purple;
       height:30px;
       width:190px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:green;
    border-color:  blueviolet;
    
}




        /* Styles for the success and error message containers */
        .message {
            display: none; /* Hide the message by default */
            padding: 10px;
            border-radius: 4px;
            margin-bottom: 15px;
        }

      
        .error-message {
            background-color: #f2dede; /* Reddish color, you can change it */
            border: 1px solid #ebccd1; /* Light red border */
        }
  


</style>

</head>
<body background="Images/Img3.jpg">

<CENTER><h1>EMPLOYEE LOGIN</h1></CENTER>
<!-- Error message -->
<div class="message error-message" id="errorMessage">
    Login Failed. Please try again.
</div>

<% if (request.getAttribute("loginFailed") != null) { %>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            <% if ((boolean)request.getAttribute("loginFailed")) { %>
                // Display error message
                var errorMessage = document.getElementById("errorMessage");
                errorMessage.style.display = "block";
                setTimeout(function() {
                    errorMessage.style.display = "none";
                }, 1000); // Collapse after 10 seconds
            <% } %>
        });
    </script>
<% } %>  



<form action="EmployeeLoginAction" method="post">
<div class="mydiv">
<label><b>Employee Id :</b> </label>
<input type="text" name="employeeId" placeholder="Employee Id" required><br><br>
<label><b>Employee Password : </b></label>
<input type="text" name="employeePassword" placeholder="Employee Password" required><br><br>
<button type="submit"><b>Login</b></button>
</div>

</form>

</body>
</html>
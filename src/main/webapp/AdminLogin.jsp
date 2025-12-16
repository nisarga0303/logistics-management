<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>

 
<style>
       

body{
 background-repeat: no-repeat;
   background-size: 100% 120%;
   

}

label{
font-weight: bold;
color: dark black;
font-size: 25px;
}

form {

    padding:100px;
    display: flex;
    flex-direction: column;
    max-width: 250px; /* Adjust the max-width as needed */
    margin: 0 auto; /* Center the form horizontally */
   
}



input {

	
   
   	  
    border-radius: 20px;
    padding: 10px;
    margin-bottom: 10px;
}


button{
background-color:white;
    border-radius: 10px;
    height:30px;
}

button:hover{
    border: 5px;
    border-style:solid;
    background-color: green;
    border-color:  black;
    
}
   h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
} 
   </style>
</head>
<body background="Images/admin2.jpg">

<center><h1>ADMIN LOGIN</h1></center>
<form action="AdminLoginAction">

<label><b>Admin Id :</b> </label>
<input type="text" name="adminId" placeholder="Admin Id"  required><br><br>
<label><b>Admin Password : </b></label>
<input type="text" name="adminPassword" placeholder="Admin Password" required><br><br>
<button type="submit"><b>Login</b></button>


</form>



</body>
</html>
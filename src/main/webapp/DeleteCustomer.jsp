<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Customer</title>
 
 <style>
       button{
       background-color:red;
       height:30px;
       width:190px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:red;
    border-color:  blueviolet;
    
}

body{
 background-repeat: no-repeat;
   background-size: 100% 190%;
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

        
        
    </style>


</head>
<body background="Images/Img1.jpg" >
<center><h1>DELETE CUSTOMER RECORD</h1></center>
<form action ="DeleteAction">
<div class="mydiv">
<input  type="number" name="DeleteCustomer" placeholder="Enter Customer ID" required>
<button type="submit"> Delete </button> 
</div>
</form>
</body>
</html>
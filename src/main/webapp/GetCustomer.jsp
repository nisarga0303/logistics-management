<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Customer Details</title>

<style>
        /* Colorful Button Styles */
        .colorful-button {
            display: inline-block;
            padding: 15px 30px;
            font-size: 18px;
            text-align: center;
            text-decoration: none;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            color: #fff;
            background: linear-gradient(to right, #f06, #9f6);
            transition: background 0.3s;
        }

        /* Hover Effect */
        .colorful-button:hover {
            background: linear-gradient(to right, #9f6, #f06);
        }
        
body{
 background-repeat: no-repeat;
   background-size: 100% 180%;
}
h1{
    color: blueviolet;
    
    
}



form {


    display: flex;
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
<body background="Images/Img1.jpg">

<form action="GetCustomerAction">
<div class="mydiv">

<button  class="colorful-button" type="submit">View Customer Details</button>

</div>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get By ID </title>
<style>
        /* Pink Button Styles */
        .pink-button {
            display: inline-block;
            
           
            text-align: center;
            text-decoration: none;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            color: #fff;
            background-color: #ff69b4; /* Pink color */
            transition: background-color 0.3s;
        }

        /* Hover Effect */
        .pink-button:hover {
            background-color: #ff1493; /* Darker pink color on hover */
        
}
h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}


body{
 background-repeat: no-repeat;
   background-size: 100% 172%;
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



button{
    border-radius: 10px;
    height:30px;
    width:180px;
}

button:hover{
    border: 5px;
    border-style:solid;
    background-color: red;
    border-color:  blueviolet;
    
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
<h1><center>View Customer By ID</center></h1>
<form action ="GetByIDAction">

<div class="mydiv">
<input type="number" name="GetByID" placeholder="Get By ID" required>
<button  class="pink-button" type="submit">Get Customer By ID</button> 
</div>
</form>

</body>
</html>
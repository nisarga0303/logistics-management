<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Feedback</title>

<style>
       

body{
 background-repeat: no-repeat;
   background-size: 100% 210%;
}



form {


    display: flex;
    flex-direction: column;
    max-width: 250px; /* Adjust the max-width as needed */
    margin: 0 auto; /* Center the form horizontally */
   
}



input {
   
    border-radius: 10px;
    padding: 10px;
    margin-bottom: 10px;
}

button{
	 border: 5px;
	 border-radius:20px;
	 height:35px;
	 width:250px;
    border-style:solid;
    background-color: white;
    border-color:  black;
	
	
}

h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}

label{
color: black;
font-size: 25px;
font-weight: bold;
}
button:hover{
    border: 5px;
    border-style:solid;
    background-color: green;
    border-color:  black;
   




   </style>

</head>

<body background="Images/Img1.jpg">
<center><h1>ADD CUSTOMER FEEDBACK</h1></center>
<form action="CustomerFeedbackAction">
								
				
				<label><b>Customer ID</b></label><br><br>
                <input type="number" name="customerId" placeholder="Customer Id" required><br>
       			
				<label><b>Message</b></label><br><br>
                <textarea type="text" name="message" placeholder="Message" required rows=5 cols=21></textarea>
               
				<br><br>
       
                <button class="btn" type="submit">SUBMIT</button>


</form>




</body>
</html>
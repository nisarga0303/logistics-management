<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Add Customer</title>
        <link rel="stylesheet" type="text/css"  href="./Register.css"/>

<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 100%;
}
button:hover{
    border: 5px;
    border-style:solid;
    background-color:green;
    border-color:  blueviolet;
    
}
h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}

</style>


</head>
 
<body background="Images/Img1.jpg">
<center>	<h1>ADD CUSTOMER</h1></center>
<form action="createAction">
							
				
				<label><b>Customer ID</b></label>
                <input type="text" name="CustomerId" placeholder="Customer Id" required><br>
				<label><b>Customer Name</b></label>
                <input type="text" name="CustomerName" placeholder="Customer Name" required><br>
                <label><b>Customer Phone Number</b></label>
                <input type="number" name="CustomerNumber" placeholder="Customer Number" required><br>
                																											
                																											
                <label><b>Email</b></label>
                <input type="email" name="Email" placeholder="Email" required><br>
                <label><b>Item Name</b> </label>
                <input type="text"  name="ItemName" placeholder="Item Name" required><br>
                <label><b>Item Description</b></label>
                <textarea id="Item" name="ItemDescription"  rows="4" cols="50" required> </textarea><br>
                <label><b>From Address</b></label>
                <textarea id="Address" name="Address1" placeholder="Customer Address"  rows="4" cols="50" required> </textarea><br>
                
                 <label><b>To Address</b></label>
                <textarea id="Address" name="Address2" placeholder="Customer Address"  rows="4" cols="50" required> </textarea><br>
                 <button class="btn" type="submit">SUBMIT</button>


</form>

</body>

</html>
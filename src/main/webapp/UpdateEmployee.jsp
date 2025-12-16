<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>

<link rel="stylesheet" type="text/css"  href="./Employee.css"/>
<style>
body{
 background-repeat: no-repeat;
   background-size: 100% 110%;
}

h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}
 button{
       background-color:red;
       height:30px;
       width:170px;
       border-radius:10px;
       
       }
       button:hover{
    border: 5px;
    border-style:solid;
    background-color:red;
    border-color:  blueviolet;
    
}
</style>

</head>
<body background="Images/Img3.jpg">
<CENTER>	<h1>UPDATE EMPLOYEE DETAILS</h1></CENTER>
<form action="updateEmployeeAction">
			
				
				<label><b>Enter Employee Id to Update :</b></label><br>
                <input type="text" name="employeeId" placeholder="Employee Id" required><br>
                 <label><b>Set Employee Password : </b></label><br>
                <input type="text" name="employeePassword" placeholder="Employee Password" required><br>
				<label><b> Employee Name :</b></label><br>
                <input type="text" name="employeeName" placeholder="Employee Name" required><br>
                <label><b>Employee Phone Number :</b></label><br>
                <input type="number" name="employeeNumber" placeholder="Employee Number" required><br>
                <label><b> Gender :</b></label>															
                
                <label><b>Male</b></label><input type="radio" name="gender" value="male" placeholder="Employee Gender">																	
      
                 <label><b>Female</b></label><input type="radio" name="gender" value="female" placeholder="Employee Gender" ><br><br>
																
                <label><b>Employee Email :</b></label><br>
                <input type="email" name="employeeEmail" placeholder="Employee Email" required><br>
               
                <label><b>Employee Address :</b></label><br>
                <textarea id="Address" name="employeeAddress" placeholder="Employee Address"  rows="4" cols="20"  required> </textarea><br><br><br>
                
                 <button class="btn" type="submit"><b>UPDATE EMPLOYEE</b></button>


</form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>

<style>

form {

    display: block;
    flex-direction: column;
    max-width: 270px; /* Adjust the max-width as needed */
  
     text-align:left;
}

body{
 background-repeat: no-repeat;
   background-size: 100% 110%;
}

button{
	 border: 5px;
	 border-radius:20px;
	 height:35px;
	 width:180px;
    border-style:solid;
    background-color: green;
    border-color:  black;
	
	
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
label {

   text-align:left;
    margin-bottom: 5px;
}

input {
    border-radius: 10px;
    padding: 8px;
    margin-bottom: 10px;
}

</style>
</head>
<body background="Images/Img3.jpg">

<center><h1>ADD EMPLOYEE</h1>

<form action="addEmployeeAction">
								
				<label><b>Set Employee Id :</b></label><br>
                <input type="text" name="employeeId" placeholder="Employee Id" required><br>
                 <label><b>Set Employee Password : </b></label><br>
                <input type="text" name="employeePassword" placeholder="Employee Password" required><br>
				<label><b>Employee Name :</b></label><br>
                <input type="text" name="employeeName" placeholder="Employee Name" required ><br>
                <label><b>Employee Phone Number :</b></label><br>
                <input type="number" name="employeeNumber" placeholder="Employee Number" required><br>
                <label><b> Gender :</b></label>															
                
                <label><b>Male</b></label><input type="radio" name="gender" value="male" placeholder="Employee Gender" >																	
      
                 <label><b>Female</b></label><input type="radio" name="gender" value="female" placeholder="Employee Gender" ><br><br>
																
                <label><b>Employee Email :</b></label><br>
                <input type="email" name="employeeEmail" placeholder="Employee Email"  required><br>
               
                <label><b>Employee Address :</b></label><br>
                <textarea id="Address" name="employeeAddress" placeholder="Employee Address"  rows="4" cols="20"  required> </textarea><br><br><br>
                
                 <button class="btn" type="submit"><b>Add Employee</b></button>


</form>
</center>

</body>
</html>
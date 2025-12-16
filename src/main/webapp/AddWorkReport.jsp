<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Work Report</title>

 <style>
      
        

body{
 background-repeat: no-repeat;
   background-size: 100% 120%;
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
    border-style:solid;
    background-color: green;
    border-color:  black;
	
	
}
h1{
color:blueviolet;
background-color:orange;
border-radius:3px;
}

button:hover{
    border: 5px;
    border-style:solid;
    background-color: green;
    border-color:  blueviolet;
   

        
    </style>


</head>
<body  background="Images/Img1.jpg">


<center><h1>ADD WORK REPORT</h1></center>
<form action="AddWorkAction">

								
				
				<label><b>EmployeeId</b></label>
                <input type="text" name="employeeId" placeholder="EmployeeId" required><br>
                
				<label><b>StartDate</b></label>
                <input type="date" name="startDate" placeholder="StartDate" required><br>
				<label><b>EndDate </b></label>
                <input type="date" name="endDate" placeholder="EndDate" required><br>
                <label><b>Number of Ordere Received</b></label>
                <input type="text" name="ordereReceived" placeholder="OrdereReceived" required><br>
                																																																		
                <label><b>Number of Order Delivered</b></label>
                <input type="text" name="orderDelivered" placeholder="OrderDelivered" required><br>
               
                 <button class="btn" type="submit">SUBMIT</button>


</form>

 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <% 
        // Invalidate the session
        session.invalidate();
        // Redirect to the login page
        response.sendRedirect("EmployeeLogin.jsp");
    %>
    
    <form action="LogoutAction">
    <button>Logout</button>
    </form>
</body>
</html>
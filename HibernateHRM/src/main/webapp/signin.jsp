<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn</title>
</head>
<body style="background-color: cyan">

<%
    if(null!=request.getAttribute("message"))
    {
        out.println(request.getAttribute("message"));
    }
%>

<form action="EmployeeController" method="get">

<input type="hidden" name="action" value="signin">

Email<input type="text" name="empemailid"><br>
Password<input type="password" name="emppassword">

<input type="submit" value="SignIn">
</form>
</body>
</html>
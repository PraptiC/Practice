<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body bgcolor=burlywood text=maroon>
<jsp:include page="banner.jsp"/>
<form action="User.hola">
<fieldset>
    <legend>Set a new password:</legend>
<h4>Re-enter Email </h4>
<input type="text" name=email placeholder="Enter email id"></input>
<h4>Enter new password </h4>
<input type="password" name=password placeholder="Enter your password"></input><br><br>
</fieldset>
<input type = submit value = "Change Password" ><br>
<%@ include file="footer.html" %>

</body>
</html>
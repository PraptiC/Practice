<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login to Hola</title>
</head>
<body bgcolor=burlywood text=maroon>
<form>
<fieldset>
    <legend>Log in to your Hola account</legend>
<h4>Email </h4>
<input type="text" name=email placeholder="Enter email id"></input>
<h4>Password </h4>
<input type="password" name=password placeholder="Enter your password"></input><br><br>
</fieldset>
<input type = submit value = "Login" ><br>
<a href="register.jsp">New user? Register here</a><br><br>
<a href="forgotPage.jsp">Forgot password?</a>

</form>
</body>
</html>
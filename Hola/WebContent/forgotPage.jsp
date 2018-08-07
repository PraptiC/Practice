<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
</head>
<body bgcolor=burlywood text=maroon>
<form action="User.hola">
<h2>Seems like you forgot your password; Please enter these details to access your account again</h2><hr>
<h4>Email </h4>
<input type="text" name=email placeholder="Enter email id"></input>
<h4>What is the name of your favourite movie?</h4>
<input type="password" name=answerMovie placeholder="Enter your answer"></input><br><br>

<%--if() **somelogic, go to homepage --%>
<input type = submit value=Submit>
</form>
</body>
</html>
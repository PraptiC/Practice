<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola_Home</title>
</head>
<body>
<jsp:include page="banner.jsp"/>
<table width="400" align="center">
<tr><th colspan="2"><h3>Hola! These are your profile details:</h3></th></tr>
<tr><td><h4>Email: </td><td></td></tr>
<tr><td><h4>Password: </h4></td><td></td></tr>
<tr><td><h4>Name: </h4></td><td></td></tr>
<tr><td><h4>Age: </h4></td><td></td></tr>
<tr><td><h4>Gender: </h4></td><td></td></tr>
<tr><td><h4>City: </h4></td><td></td><tr>
<tr><td><h4>Your favourite movie is: </h4></td><td></td></tr>
<%--<h4>Photo: </h4> --%>
</table>
<%@ include file="footer.html" %>

</body>
</html>
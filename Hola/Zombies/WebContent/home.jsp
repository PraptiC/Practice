<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/media/bootstrap.min.css"/>">
<script src="<c:url value="/media/jquery.2.2.4.min.js"/>"></script>
<title>Login Page</title>
</head>
<body bgcolor=#ADD8E6 text=black>
<jsp:include page="banner.jsp"/>
	<h2>Login Page</h2>
	<%-- <% if(request.getParameter("invalid")!= null) { %>
	<font size="3" color = "red">Invalid Email ID / Password</font>
	<% } %> --%>
	<form action="login.do" >
	<font color="red">${Prompt}</font><br><br>
		<b>User id</B></br><input  name="userId"
			placeholder="Enter user id"></span> <br> <br> <B>
			
			
			Password :</B> <br> <input type="password" name="password" "
			placeholder="Minimum 8 characters"> <br> <br>
			<span><input
			type="submit" value="Submit" > </span>
			<br><a href="forget.jsp">Forgot password?</a>
			<br><a href="register.jsp">Register Now</a>
			</form>


	
</body>
</html>
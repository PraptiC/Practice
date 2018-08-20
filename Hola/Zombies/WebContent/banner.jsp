<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banner</title>
</head>
<body>
<hr>
<h1 align="center">ZOMBIE - Community of Experts</h1>
<% User user=(User) session.getAttribute("User");
if(user != null){
%>
<span>Hello <%= user.getUserId() %>!</span> |
<span><a href="dashboard.jsp">Home</a>| <a href="feeds.do">My Feeds</a>|  <a href = "logout.do">Logout</a></span>

<% } else { %>
<span>Hi there | <a href="home.jsp">Home</a></span>
<% }%>
<span style="text-align:right">
<form action="search.do">
	<input name="keyword">
	<input type="submit" value="Search">
</form>
</span>

<hr size ="3" color="midnightblue">
</body>
</html>
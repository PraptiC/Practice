<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/media/bootstrap.min.css"/>">
<script src="<c:url value="/media/jquery.2.2.4.min.js"/>"></script>
<title>Dashboard</title>
</head>

<body bgcolor="thistle" text="indigo">
<jsp:include page="banner.jsp"/>
<h1> My Dashboard</h1><hr size="3" color="crimson">
<b>User Id:</b> ${User.userId} <br>
<b>Email:</b>${User.email} <br><br>
<a href="query.jsp">Ask Question</a>
</body>
</html>
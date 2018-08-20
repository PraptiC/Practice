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
<title>AskQuestion</title>
</head>

<body bgcolor="thistle" text="indigo">
<jsp:include page="banner.jsp"/>
<h1> Ask a Question</h1><hr size="1" color="crimson">

<form action="query.do" method="post">
	<textarea name="query" rows="5" cols="30"></textarea><br>
	<input type="submit" value="Ask">
</form>
</body>
</html>
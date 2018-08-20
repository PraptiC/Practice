<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/media/bootstrap.min.css"/>">
<script src="<c:url value="/media/jquery.2.2.4.min.js"/>"></script>
<title>Feeds</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>

<body bgcolor=#ADD8E6 text=black>
<jsp:include page="banner.jsp"/>
	<table border="1" bordercolor="crimson" align="center" colspan="1">
		<tr bgcolor="wheat">
			<th>User</th><th>Time</th><th>Question</th><th>Comments</th>
		</tr>
		<c:forEach items="${Feeds}" var="feed">
		<tr>
			<td>${feed.user.userId}</td>
			<td>${ feed.feedTime }</td>
			<td><a href="question.do?id=${feed.feedId}">${feed.query}</a></td>
			<td>${ feed.totalCmnts}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
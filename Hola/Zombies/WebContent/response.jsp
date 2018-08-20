<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/media/bootstrap.min.css"/>">
<script src="<c:url value="/media/jquery.2.2.4.min.js"/>"></script>
<title>ShareResponse</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body bgcolor="thistle" text="indigo">
<jsp:include page="banner.jsp"/>

<h1>Share your response:</h1><hr size = "1" color="crimson">

<table border = "1" bordercolor="crimson" align="center">
	<tr>
		<th colspan="2">${Question.query}</th>
	</tr>
	
	<c:if test="${User!=null}">
		<form action="comment.do">
			<tr><td colspan="2"><textarea name="response" rows="5" cols="30"></textarea></td>
			</tr>	
			<tr><td colspan="2"><input type="submit" value="Respond"></td></tr>
		</form>
	</c:if>
	<c:forEach items="${Question.comments}" var="cmnt">
		<tr>
			<td>${cmnt.user.userId}</td>
			<td>${cmnt.response}</td>
		</tr>
	</c:forEach>
	
	



</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor=burlywood text=maroon>
<jsp:include page="banner.jsp"/>
<form action="User.hola">
<table width="400" align="center">
<tr><th colspan="2">Registration form</th></tr>
<tr><td>Name</td><td><input type="text" name="name" required></td></tr>
<tr><td>Email</td><td ><input type="text" name="email" required></td></tr>
<tr><td>Password</td><td><input type="password"  name="password" required></td></tr>
<tr><td>Age</td><td><select name="age">
					<% 	for(int a=18;a<=60;a++){ %>
						<option value="<%=a%>"><%=a%></option>
					<% } %>
					</select></td></tr>
<tr><td>Gender</td><td><input type="radio" name="gender" value="Male" checked>Male
						<input type="radio" name="gender" value="Female">Female</td></tr>
<tr><td>City</td><td><select name="city">
					<% String[] cities = {"Mumbai","Pune","Mangolare","Noida","Kanpur"}; 
					for(String ct : cities){%>
					<option value = "<%=ct%>"><%=ct%></option>
					<% } %>					
					</select>	</td></tr>
<tr><td>Favourite Movie</td><td><input name="movie" required></td></tr>
<tr><td>Photo</td><td><input type="file" name="photo"></td></tr>
<tr><th colspan="2"><input type="submit" value="Register"></th></tr>

</table>
<%@ include file="footer.html" %>
<%--
<h2>Welcome to Hola! Please enter these details to create your account</h2><hr>
<h4>Name</h4><input type="text" name=name placeholder="Enter name:"></input>
<h4>Email </h4><input type="email" name=email placeholder="Enter email id"></input>
<h4>Password </h4><input type="password" name=password placeholder="Set a password"></input>
<h4>Age</h4><input type="number" name=age placeholder="Enter age"></input>
<h4>Gender</h4><select name="gender">
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    <option value="Other">Other</option>
    </select>
<h4>City</h4><select name="city">
    <option value="Airoli">Airoli</option>
    <option value="Powai">Powai</option>
    <option value="Navi Mumbai">Navi Mumbai</option>
    <option value="Pune">Pune</option>
    <option value="Bangalore">Bangalore</option>
    <option value="Chennai">Chennai</option>
    </select>
<h4>What is the name of your favorite movie?</h4><input type="password" name=answerMovie placeholder="Enter your answer"></input><br><br>
<input type = submit value = "Register Me!" ><br>
--%>
</form>
</body>
</html>
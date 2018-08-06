<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor=burlywood text=maroon>
<form>
<h2>Welcome to Hola! Please enter these details to create your account</h2><hr>
<h4>Name</h4><input type="text" name=name placeholder="Enter name:"></input>
<h4>Email </h4><input type="text" name=email placeholder="Enter email id"></input>
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
</form>
</body>
</html>
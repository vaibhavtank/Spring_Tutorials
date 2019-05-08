<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>

Success Login Detail:

<br />
<hr />

Name : ${login.name} <br />
Password : ${login.password }

<br />
<hr />
Session Value Check : 
<br/>
Name : ${sessionScope.login.name } <br />
Password : ${sessionScope.login.password }

<br />

<a href="profile">Go to Profile</a>

<br />

<a href="logout">Logout</a>

</body>
</html>
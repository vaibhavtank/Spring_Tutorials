<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
</head>
<body>

<c:if test="${sessionScope.login != null}">

${sessionScope.login.name } is Activated!!!!

<br />

<a href="logout">Logout</a>


</c:if>
<c:if test="${sessionScope.login.name ==null || sessionScope.login.name ==''}">

<c:redirect url="index"></c:redirect>
</c:if>

</body>
</html>
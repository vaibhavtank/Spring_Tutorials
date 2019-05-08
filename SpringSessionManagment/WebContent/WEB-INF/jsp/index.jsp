<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<a href="profile">Check Profile</a>

	<br />


	<f:form method="post" commandName="login" action="login">
		
		<table>
			<c:if test="${logout !=null}">
			<tr>
				<td colspan="3">
					<c:out value="${logout}"></c:out>
				</td>
			</tr>
			</c:if>
			<c:if test="${error!=null}">
			<tr>
				<td colspan="3">
					<c:out value="${error}"></c:out>
				</td>
			</tr>
			</c:if>
			<tr>
				<td><f:label path="name">Name :</f:label></td>
				<td><f:input path="name" /></td>
				<td><f:errors path="name" /></td>
			</tr>
			<tr>
				<td><f:label path="password">Password : </f:label></td>
				<td><f:password path="password" /></td>
				<td><f:errors path="password" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" name="submit"
					value="Login" /></td>
			</tr>

		</table>

	</f:form>

</body>
</html>
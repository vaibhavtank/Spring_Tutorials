<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
<style type="text/css">
.error{
	color: #ff0000;
}
</style>
</head>
<body>

<a href="show">Show Students</a>
<br />
<f:form method="post" commandName="student" action="add">
	<table>
		<tr>
			<td colspan="3">
				<f:errors path="*" cssClass="error" />
			</td>
		</tr>
		<tr>
			<td><f:label path="name">Name :</f:label> </td>
			<td><f:input path="name"/> </td>
			<td><f:errors path="name" cssClass="error"></f:errors> </td>
		</tr>
		<tr>
			<td><f:label path="address">Address :</f:label> </td>
			<td><f:textarea path="address" rows="5" cols="25" /></td>
			<td><f:errors path="address" cssClass="error"></f:errors> </td>
		</tr>
		<tr>
			<td colspan="3">
				<input type="submit" name="submit" value="Add Student" />
			</td>
		</tr>
	</table>
</f:form>
</body>
</html>
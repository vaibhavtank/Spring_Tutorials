<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Data Entry</title>
<style type="text/css">
.error{
	color:#ff0000;
}

.errorBlock{
	color: #000;
	background-color: #ffeeee;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px
}

</style>
</head>
<body>
	<form:form method="POST" action="addCustomer.html" commandName="customer">
		<form:errors path="*" cssClass="errorBlock" element="div"></form:errors>
	
		<table>
			<tr>
				<td><form:label path="name">Name :</form:label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password :</form:label></td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address :</form:label></td>
				<td><form:textarea cols="30" rows="5" path="address" /></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="language">Technologies :</form:label></td>
				<td>
					<form:checkboxes items="${customerDynamic.languages}" path="language"/>
				</td>
				<td><form:errors path="language" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender :</form:label></td>
				<td>
					<form:radiobutton path="gender" value="Male"/> Male
					<form:radiobutton path="gender" value="Female"/> Female
				</td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="degree">Education :</form:label></td>
				<td>
					<form:select path="degree" items="${customerDynamic.degrees}" />
				</td>
				<td><form:errors path="degree" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td colspan="3">
				<form:hidden path="id" />
				<input type="submit" name="submit" value="Add Customer" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
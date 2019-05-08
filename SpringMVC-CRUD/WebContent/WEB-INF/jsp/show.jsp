<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show List of Students</title>
</head>
<body>

<a href="index">Add Student</a>
<br />
<table>
	<tr>
		<td>NO</td>
		<td>ID</td>
		<td>NAME</td>
		<td>ADDRESS</td>
		<td>EDIT</td>
		<td>DELETE</td>
	</tr>
	<c:forEach var="student" varStatus="studentStatus" items="${students}">
		<tr>
			<td>${studentStatus.count }</td>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.address}</td>
			<td>
				<a href="edit?id=${student.id}">EDIT</a>
			</td>
			<td>
				<f:form action="delete" method="post">
					<input  type="hidden" name="id" value="${student.id}" />
					<input type="submit" name="submit" value="DELETE" />
				</f:form>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>
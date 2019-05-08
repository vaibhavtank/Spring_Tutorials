<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Uploading Form</title>
</head>
<body>

	<f:form method="post" commandName="form" enctype="multipart/form-data" action="upload">
		<table>
			<tr>
				<td><f:label path="name">File Name</f:label></td>
				<td><f:input path="name" /></td>
				<td><f:errors path="name" cssStyle="color:#ff0000;" /></td>
			</tr>
			<tr>
				<td>Upload File</td>
				<td><input type="file" name="file" /></td>
				<td><f:errors path="file" cssStyle="color:#ff0000;" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" name="submit"
					value="Upload" /></td>
			</tr>
		</table>

	</f:form>

</body>
</html>
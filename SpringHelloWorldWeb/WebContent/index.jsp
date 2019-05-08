<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<a href="hello.vishal">Hello</a>
<a href="welcome.vishal">Welcome</a>


<form action="passParam.vishal" method="post">
	<table>
		<tr>
			<td>Name : </td>
			<td>
				<input type="text" name="name" />
			</td>
		</tr>
		<tr>
			<td>Address : </td>
			<td>
				<textarea  cols="30" rows="5" name="address"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="submit" value="Add" />
			</td>
		</tr>
	</table>
</form>

</body>
</html>
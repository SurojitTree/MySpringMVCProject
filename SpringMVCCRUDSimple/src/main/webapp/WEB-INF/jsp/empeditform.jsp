<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: powderblue;">

	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div align="center">

		<h1>Edit Employee</h1>
		<form:form method="POST" action="/SpringMVCCRUDSimple/editsave">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lName" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
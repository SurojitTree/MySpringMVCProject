<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: powderblue;">

	<div align="center">

		<h1>Add New Employee</h1>
		<form:form method="post" action="save">
			<table>
				<tr>
					<td>First Name:</td>
					<td><form:input path="fName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lName" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><form:input path="telephone" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
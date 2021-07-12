<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View List</title>

</head>
<body style="background-color: rgba(255, 100, 0, 0.2);">
	<div style="display: flex; justify-content: space-around">
		<div>
			<h1>
				<a href="/SpringMVCCRUDSimple" title="back to home">Home</a>
			</h1>
		</div>
		<div align="center">
			<br /> <br />
			<table border="1">

				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Password</th>
					<th>Telephone</th>
					<th>Age</th>
					<th>Email</th>
					<th>Edit</th>

				</tr>
				<c:forEach var="emp" items="${msg}" varStatus="status">

					<tr>
						<td>${emp.id}</td>
						<td>${emp.fName}</td>
						<td>${emp.lName}</td>
						<td>${emp.password}</td>
						<td>${emp.telephone}</td>
						<td>${emp.age}</td>
						<td>${emp.email}</td>
						<td><a href="/SpringMVCCRUDSimple/editemp/${emp.id}">Edit</a></td>
					</tr>

				</c:forEach>

			</table>
			<br /> <br /> <a href="/SpringMVCCRUDSimple/viewmp1/1">1</a> <a
				href="/SpringMVCCRUDSimple/viewmp1/2">2</a> <a
				href="/SpringMVCCRUDSimple/viewmp1/3">3</a>
		</div>


	</div>
</body>
</html>
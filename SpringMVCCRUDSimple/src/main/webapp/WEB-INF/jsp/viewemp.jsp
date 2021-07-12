<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees List</title>
<style>
body, html {
	height: 100%;
	margin: 0%;
	opacity: 0.8;
}

.bg {
	/* The image used */
	background-color: rgba(255, 100, 0, 0.2);
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>


	<div class="bg" style="display: flex; justify-content: space-around">
		<div>
			<h1>
				<a href="index.jsp">back</a>
			</h1>
		</div>
		<div>
			<h1>Employees List</h1>

			<div style="background-color: rgb(153, 204, 0);">

				<table border="1">
					<tr>
						<th>Sl.No</th>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Password</th>
						<th>Telephone</th>
						<th>Age</th>
						<th>Email</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<c:forEach var="emp" items="${list}" varStatus="status">
						<tr>
							<td>${status.index+1}</td>
							<td>${emp.id}</td>
							<td>${emp.fName}</td>
							<td>${emp.lName}</td>
							<td>${emp.password}</td>
							<td>${emp.telephone}</td>
							<td>${emp.age}</td>
							<td>${emp.email}</td>
							<td><a href="editemp/${emp.id}">Edit</a></td>
							<td><a href="deleteemp/${emp.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>

		</div>
	</div>


</body>
</html>
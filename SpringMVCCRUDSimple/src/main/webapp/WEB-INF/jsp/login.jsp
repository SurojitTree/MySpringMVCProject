<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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

<body class="bg">

	<form:form modelAttribute="user" action="loginPage" method="post">
		<table align="center">
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="mail" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>

</html>
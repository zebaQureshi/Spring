<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Users List:</h1>
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
		</tr>
		<c:forEach items="${users}" var="userobj">
			<tr>
				<td>${userobj.id}</td>
				<td>${userobj.name}</td>
				<td>${userobj.email}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>
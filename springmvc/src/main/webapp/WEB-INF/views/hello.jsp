<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Title</title>
</head>
<body>
	<h1>Hello h1 from spring mvc!!!</h1>
	<%
	Integer id1 = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("empname");
	out.println("ID: " + id1 + "  Name:" + name);
	%>
	<br />
	<hr>
	ID:
	<b>${id}</b> 
	Name:
	<b>${empname}</b>
</body>
</html>
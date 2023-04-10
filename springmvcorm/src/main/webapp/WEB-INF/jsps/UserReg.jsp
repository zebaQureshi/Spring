<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script>
	$(document).ready(function() {

		$("#userId").change(function() {

			$.ajax({

				url : 'validateId',
				data : {
					id : $("#userId").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);
					if (responseText != "") {
						$("#userId").focus();
					}
				}
			});
		});

	});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
			ID:  <input type="text" name="id" id="userId" /> <span id="errMsg"> </span>
			<br />
			Name: <input type="text" name="name" />
			<br />
			Email:  <input type="text" name="email" />
			<br />
			<input type="submit" id="register" value="register" />
		</pre>
	</form>
	<hr />
	<%=request.getAttribute("result")%>
</body>
</html>
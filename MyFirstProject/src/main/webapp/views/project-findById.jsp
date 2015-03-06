<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find by ID</title>
</head>
<body>
	<form action="findById" method="POST">
		<h3>Input Data:</h3>
		Enter ID <input name="id" value="${id}" type="text" placeholder="Enter ID">
		</br>
		<button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> Submit</button>
	</form>
</body>
</html>
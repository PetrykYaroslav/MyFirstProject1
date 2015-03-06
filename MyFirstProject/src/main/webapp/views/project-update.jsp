<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<form action="edit" method="POST">
		<h3>Edit Data:</h3>
		Title Course <input class="form-control" name="titleCourse"	value="${titleCourse}" type="text" placeholder="Title Course">
		</br>
		Time Course <input class="form-control" name="timeCourse" value="${timeCourse}" type="text" placeholder="Time Course">
		</br>
		Quantity Lesson <input class="form-control" name="quantityLessons" value="${quantityLessons}" type="text" placeholder="Quantity Lesson">
		</br>
		Cost <input class="form-control" name="cost" value="${cost}" type="text" placeholder="Cost">
		</br>
		<button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			Submit
		</button>
	</form>
</body>
</html>
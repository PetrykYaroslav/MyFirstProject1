<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Lesson</title>
</head>
<body>
<form action="showLesson" method="POST">
		<h3>Input Data</h3>
		Subject <input class="form-control" name="subject" value="${subject}" type="text" placeholder="Subject">
		</br>
		Time Lesson <input class="form-control" name="timeLesson" value="${timeLesson}" type="text" placeholder="Time Lesson">
		</br>
		Course ID <input class="form-control" name="courseId" value="${courseId}" type="text" placeholder="Course ID">
		</br>
		<button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> Submit</button>
	</form>
</body>
</html>
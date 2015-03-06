<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course</title>
</head>
<body>
	<h3>Course:</h3>
	<div class="panel panel-info">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title Course</th>
					<th>Time Course</th>
					<th>Quantity Lesson</th>
					<th>Cost</th>
				</tr>
			</thead>
			<tbody>
					<tr>
						<td>${course.id}</td>
						<td>${course.titleCourse}</td>
						<td>${course.timeCourse}</td>
						<td>${course.quantityLessons}</td>
						<td>${course.cost}</td>
					</tr>
					
			</tbody>
		</table>
	</div>
<!-- 	<button type="button" class="btn btn-primary" -->
<!-- 		onclick="window.location.href='createCourse'">New Course</button> -->
<!-- 	<button type="button" class="btn btn-primary" onclick="window.location.href='find'">Find by ID</button> -->
	<button type="button" class="btn btn-primary" onclick="window.location.href='showCourse'">Show all course</button>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lesson</title>
</head>
<body>
	<h3>Lesson:</h3>
	<div class="panel panel-info">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Subject</th>
					<th>Time Lesson</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lesson}" var="lesson">
					<tr>
						<td>${lesson.id}</td>
						<td>${lesson.subject}</td>
						<td>${lesson.timeLesson}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<button type="button" class="btn btn-primary"
		onclick="window.location.href='createLesson'">New Lesson</button>
	<!-- 	<a href="createLesson">New Lesson</a> -->
</body>
</html>
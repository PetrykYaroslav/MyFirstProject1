<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course</title>
<style>
.row {
	float: right;
	margin-right: 30px;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-6">
			<div class="input-group">
				<form action="findById" method="POST">
					<input type="text" class="form-control"
						placeholder="&#x1f50d; Enter ID..." name="id" value="${id}"
						type="text">

					<!-- 						<button class="btn btn-default" type="submit">&#x1f50d;</button> -->

				</form>
			</div>
			<!-- /input-group -->
		</div>
		<!-- /.col-lg-6 -->
	</div>
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
				<c:forEach items="${course}" var="course">
					<tr>
						<td>${course.id}</td>
						<td>${course.titleCourse}</td>
						<td>${course.timeCourse}</td>
						<td>${course.quantityLessons}</td>
						<td>${course.cost}</td>
						<td><a href="updatePage?id=${course.id}">edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<button type="button" class="btn btn-primary"
		onclick="window.location.href='createCourse'">New Course</button>
	<!-- 	<button type="button" class="btn btn-primary" -->
	<!-- 		onclick="window.location.href='find'">Find by ID</button> -->
</body>
</html>
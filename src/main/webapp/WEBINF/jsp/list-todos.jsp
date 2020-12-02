<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
<title>Todo's List for ${name} </title>
</head>
<body>
<div class="container">
<table class="table table-striped">
<caption>Your Todos are </caption>
	<thead>
	<tr>
		<th>Description</th>
		<th>Target Date</th>
		<th>Is it Done?</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${todos }" var="todo">
	<tr>
		<td>${todo.desc}</td>
		<td>${todo.targetDate }</td>
		<td>${todo.done}</td>
		<td><a type="button" class="btn btn-warning" href="/update-todo?id=${todo.id }">Update</a></td>
		<td><a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id }">Delete</a></td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>

<br/>
<div><a class="button" href="/add-todo">Add a Todo</a></div>
</div>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>

</body>
</html>
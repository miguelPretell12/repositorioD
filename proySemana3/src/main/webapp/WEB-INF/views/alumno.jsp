<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/app.css">
</head>
<body>
<h2>Notas de Alumnos</h2>
<form method="post" name="frm1" action="/process">
	<p>
		<label>Codigo</label>
		<input type="text" name="codigo">
	</p>
	<p>
		<label>Nombre</label>
		<input type="text" name="nombre">
	</p>
	<p>
		<label>nota1</label>
		<input type="number" name="nota1">
	</p>
	<p>
		<label>nota2</label>
		<input type="number" name="nota2">
	</p>
	<p>
		<label>nota3</label>
		<input type="number" name="nota3">
	</p>
	<input type="submit" value="Send">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notas</title>
</head>
<body>
	<h2>Registro de Notas</h2>
	
	<form action="/SendNota" method="post">
		<label>Nombre 
			<input type="text" name="nombre">
		</label>
		<br>
		<label>
			nota1
			<input type="number" name="nota1">
		</label>
		<br>
		<label>
			nota2
			<input type="number" name="nota2">
		</label>
		<br>
		<label>
			nota3
			<input type="number" name="nota3">
		</label>
		<br>
		<input type="submit" value="Enviar">
	</form>
	<br>
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Nota1</th>
				<th>Nota2</th>
				<th>Nota3</th>
				<th>Promedio</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${n_nombre}</td>
				<td>${n_nota1}</td>
				<td>${n_nota2}</td>
				<td>${n_nota3}</td>
				<td>${n_promedio}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
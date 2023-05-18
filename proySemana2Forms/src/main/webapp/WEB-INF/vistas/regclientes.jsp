<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registro</title>
</head>
<body>
	<h2>Registro de Clientes</h2>
	<form name="frmcliente" id="frmcliente"  method="post" action="/enviar">
		<p>
			<label>Nombre</label>
			<input type="text" name="nombre">
		</p>
		<p>
			<label>apellido</label>
			<input type="text" name="apellido">
		</p>
		<p>
			<label>correo</label>
			<input type="email" name="correo">
		</p>
		<p>
			<label>Telefono</label>
			<input type="number" name="telefono">
		</p>
		<input type="submit" value="Enviar">
	</form>
	<h3>REPORTE DE REGISTRO</h3>
	NOMBRE: ${a_nombre}
	APELLIDO: ${a_apellido}
	CORREO: ${a_correo}
	TELEFONO: ${a_telefono}
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Pagos a Obreros</h2>
	<form name="frm2" method="post" action="/procesar">
		<p>
			<label>Nombre</label>
			<input type="text" name="nombre">
		</p>
		<p>
			<label>Tarifa</label>
			<input type="number" name="tarifa" step="any">
		</p>
		<p>
			<label>Horas</label>
			<input type="number" name="horas">
		</p>
		<input type="submit" value="Send" >
	</form>
	
	${a_nombre }
	${a_tarifa }
	${a_horas }
	${a_salariobruto }
	${a_descto }
</body>
</html>
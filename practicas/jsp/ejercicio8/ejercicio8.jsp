<%--
Ejercicio 8 de JSP

Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de ese número. El resultado
se debe mostrar en una tabla (<table> en HTML)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ejercicio 8 de JSP</title>
	</head>
	<body>
		<h1>Tabla de multiplicar</h1>
		<form class="tabla" method="post" action="calcular.jsp">
			Introduce un número: <input type="number" name="numero">
			<input type="submit" value="Calcular">
		</form>
	</body>
</html>

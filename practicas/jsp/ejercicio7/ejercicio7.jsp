<%-- 
Ejercicio 7 de JSP

Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal aparezcan dos formularios
y se pueda elegir pasar de euros a pesetas o de pesetas a euros según dónde introduzcamos el valor y el botón que
pulsemos. Adorna la página con alguna foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ejercicio 7 de JSP</title>
	</head>
	<body>
		<h1>Conversor de monedas</h1>
		<form class="dinero" method="post" action="convertir.jsp">
			Cantidad: <input type="number" min="0" step="0.01" name="cantidad">
			<input type="radio" name="cambio" value="eurosAPesetas" checked="checked"> De Euros a Pesetas 
			<input type="radio" name="cambio" value="pesetasAEuros"> De Pesetas a Euros 
			<input type="submit" value="Convertir">
		</form>
	</body>
</html>

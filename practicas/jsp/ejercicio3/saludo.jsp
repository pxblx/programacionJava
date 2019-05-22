<%--
Ejercicio 3 de JSP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ejercicio 3 de JSP</title>
	</head>
	<body>
		<%request.setCharacterEncoding("UTF-8"); %>Hola, <% out.print(request.getParameter("nombre"));%>.
	</body>
</html>

<%-- 
Ejercicio 7 de JSP
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ejercicio 7 de JSP</title>
	</head>
	<body>
		<%Double c = Double.parseDouble(request.getParameter("cantidad"));
		DecimalFormat formatoEuros = new DecimalFormat("0.00");
		if (request.getParameter("cambio").equals("eurosAPesetas")) {
			out.print(formatoEuros.format(c) + " euros son " + Math.round(c * 166.386) + " pesetas.");
		} else {
			out.print(Math.round(c) + " pesetas son " + formatoEuros.format(c / 166.386) + " euros.");
		}%>
	</body>
</html>

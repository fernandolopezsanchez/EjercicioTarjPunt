<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="cliente" method="POST">
		<table>
			<tr>
			
			<td>Nombre:</td> 
				<td><form:input path="nombre" /></td>
				
			</tr>
			<tr>
			<td>Apellidos:</td> 
				<td><form:input path="apellidos" /></td>
				
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Guardar info" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>
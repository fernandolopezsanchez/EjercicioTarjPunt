<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="login" method="POST">
		<table>
			<tr>
				<td><spring:message code="login.usuario.login"></spring:message></td> 
			<%//<td>Login:</td> %>
				<td><form:input path="login" /></td>
				<td><form:errors path="login"></form:errors></td>
			</tr>
			<tr>
				<td><spring:message code="login.usuario.password"></spring:message></td>
			<%//<td>Password:</td> %>
				<td><form:input path="password" /></td>
				<td><form:errors path="password"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Guardar info" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
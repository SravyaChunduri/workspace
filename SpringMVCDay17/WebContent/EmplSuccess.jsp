<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee code=${e.empcode}<br>
Employee name=${e.empname}<br>
Employee Salary=${e.salary}<br>
<table border="2" align="center">
<tr>
	<th>EMPLCODE<th>EMPNAME<th>SALARY
</tr>
<c:forEach var="e1" items="${empls}">
<tr>
<td><c:out value="${e1.empcode}"></c:out></td>
<td><c:out value="${e1.empname}"></c:out></td>
<td><c:out value="${e1.salary}"></c:out></td>
</tr>
</c:forEach>
</table>

</body>
</html>
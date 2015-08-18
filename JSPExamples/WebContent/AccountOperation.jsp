<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=request.getParameter("user");%>
<%if(name.equals("manager")){%>
<jsp:forward page="manager.jsp"></jsp:forward>
<%}else if(name.equals("staff")){ %>
<jsp:forward page="staff.jsp"></jsp:forward>
<%}else { %>
<h2>Invalid details!!!</h2>
<%} %>
</body>
</html>
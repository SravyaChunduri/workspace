<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String user=request.getParameter("username");%>
<%if(user.equals("admin")){%>
<jsp:forward page="UsingBean.jsp"></jsp:forward>
<%}else{%>
<h2>Not Authenticated!!!!</h2>
<%} %>
</body>
</html>
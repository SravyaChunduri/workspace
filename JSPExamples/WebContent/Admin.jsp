<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession sess=request.getSession();

 
 if(sess.getAttribute("loggedin")!=null){ %>
 
<%String name=request.getParameter("username"); %>
<h1>Welcome <%=name %></h1>
<form action="Login.jsp">
<input type="submit" value="Logout">
</form>
<%}else{ %>
<h3>Invalid Credentails to open dis page!!!</h3>
<%} %>
</body>
</html>
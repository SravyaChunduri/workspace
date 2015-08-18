<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String uname=request.getParameter("username");
String pass=request.getParameter("password");%>

<%if(uname.equals("admin") && pass.equals("admin")){ %>
<%HttpSession sess=request.getSession(true);
sess.setAttribute("loggedin", "yes"); %>
<jsp:forward page="Admin.jsp"></jsp:forward>
<%}else if(uname.equals("sravya") && pass.equals("sravya")){ %>
<jsp:forward page="User.jsp"></jsp:forward>
<%}else if(uname.equals("") ||pass.equals("")){ %>
<h2>Fields cannot be empty</h2>

<%}else{ %>
<h2>Invalid Credentials!!!</h2>
<h3>Please Re-Login...</h3>
<jsp:include page="Login.jsp"></jsp:include>
<%} %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">
function checkCode(code){
var xmlhttp;
if(code.length==0){
	document.getElementById("cd").innerHTML="";
	return;
}
if(window.XMLHttpRequest)//non i.explorer
{
	xmlhttp=new XMLHttpRequest();
}
else{
	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");//for i.e
}

xmlhttp.onreadystatechange=function(){
	if(xmlhttp.readyState==4 && xmlhttp.status==200){
		document.getElementById("cd").innerHTML=xmlhttp.responseText;
	}
}
xmlhttp.open("GET","addCustomer.jsp?c="+code,true);
xmlhttp.send();
}
</script>
</head>
<!-- this is a jsp file to display a page to add employee details -->

<body bgcolor="pink">
<form  action="AddEmployee">
<table align="center" cellpadding="1" border="2">
<tr>
<td bgcolor="biege">CODE</td>
<td><input type="text" name="empcode" onblur="checkCode(this.value)"></td>
<!-- td><input type="submit" value="verify" ></td-->
<td bgcolor="red"><span id="cd"></span></td>
</tr>
<tr>
<td bgcolor="yellow">NAME</td>
<td><input type="text" name="empname"></td>
</tr>
<tr>
<td bgcolor="green">SALARY</td>
<td><input type="text" name="salary"></td>
</tr>
</table>
<center><br><input type="submit" value="submit"><br></center>
<center><a href="ViewEmployees">view employee table</a></center>
</form>


</body>
</html>
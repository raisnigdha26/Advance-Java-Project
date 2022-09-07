<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%
 String name=request.getParameter("username");
 String password=request.getParameter("pass");
if(password.equals("Srai@1234"))
{
%>
<h2> Login Successful</h2>
<h1> Hello <%=name %> </h1>
<% 
}
else {
%>
<h2 > Login unsuccessful </h2>
<% } %>

</body>
</html>
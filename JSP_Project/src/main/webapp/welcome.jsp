<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% String name=request.getParameter("firstName");
if(name!=null)
{
%>
<h1> Hello <%=name %> </h1>
<% 
}
else{
	
%>
<form action="welcome.jsp" method="get">
<p> Type your name </p>
<p> <input type="text" name="firstName" />
<input type="submit" name="submit" />
</p>
</form>
<% } %>

</body>
</html>
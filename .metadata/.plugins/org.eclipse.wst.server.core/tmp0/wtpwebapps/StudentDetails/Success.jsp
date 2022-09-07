<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
    <form action="Home.jsp">
        <h3>
            <%=request.getParameter("msg")%>
            Successful
        </h3>
  
        <br /> <input type="submit" value="Return to Home page" />
  
    </form>
  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date JSP</title>
<style type="text/css">
p.big
{
font-color:red;
font-weight: bold; 
font-size: 2em;
}
</style>
</head>
<body>
<p class="big"> Hello </p>
<table style="border: 6px outset;">
<tr> 
<td style = "background-color:black">
<p class="big" style="color:cyan">
Today's date: <%= (new java.util.Date()).toString()%>
</p>
</td>
</tr>
</table>
</body>
</html>
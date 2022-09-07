<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details - Result</title>
</head>
<body>
  
    <h2>Details</h2>
  
    <form>
        <input type="hidden" name="stid"
            value="<%=request.getParameter("id")%>">
  
        <table>
            <tr>
                <td>ID:</td>
                <td><%=request.getParameter("id")%></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><%=request.getParameter("name")%></td>
            </tr>
            <tr>
                <td>Email Id:</td>
                <td><%=request.getParameter("email")%></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><%=request.getParameter("phone")%></td>
            </tr>
            <tr />
        </table>
        <br />
    </form>
    <br />
    <input type="button" value="Update data" onclick="update()" />
    <br />
    <input type="button" value="Return to Home"
        onclick="window.location.href='Home.jsp'" />
  
</body>
  
<script lang="javascript" type="text/javascript">
    function update() {
        var sid = document.forms[0].elements['stid'].value;
        window.location.href = "Update.jsp?id=" + sid;
    }
</script>
</html>
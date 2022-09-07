<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">MTECH IT Section B</h2>
    <br />
    <h3 align="center">Attendance </h3>
      <form action="./DateAttendance" method="get">
    <br/>
   Date :  <input type ="text" name="date"> <br/> 
    <table>
  
        <tr>
            <th> Roll Number </th>
            <th> Name </th>
            <th> Present </th>
            <th> Absent </th>
        </tr>
        <tr>
            <td> IT-2k19-59 </td>
            <td> Snigdha Rai </td>
            <td><input type="radio"  value="P" name="rb1" /></td>
            <td><input type="radio" value="A" name="rb1"/></td>
        </tr>
        <tr>
            <td> IT-2k19-72 </td>
            <td> Vinayak Singoriya </td>
            <td><input type="radio" value="P" name="rb2"/></td>
            <td><input type="radio" value="A" name="rb2"/></td>
        </tr>
    </table>
    <input type="submit" name="bt1">
    </form>
    <%@ page import="java.sql.*" %>
    <%
    String arr[]={null};
    int i;
    for(i=1;i<=72;i++) 
    {
    	arr[i]=request.getParameter("rb"+i);
 
   		 if(arr[i].equals("P"))
   			 {
    	try {
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");
              String date=request.getParameter("date");
              // Query/statement to insert the values
              for(int j=1;j<=72;i++)
				{
            	  String sql2="update Attendance set `"+date+"`=? where Roll_Number=?";
            	  PreparedStatement st=conn.prepareStatement(sql2);
            	  st.execute(sql2);
            	}
              conn.close();
    		}
   			 
    
    	catch(Exception e){
    		System.out.println(e);
    	}
   			 }
    }
    %>
    
    </body>
</html>
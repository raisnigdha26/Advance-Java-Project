import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Attendance2
 */
@WebServlet("/Attendance2")
public class Attendance2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attendance2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement sts = con.createStatement();
            ResultSet rs=sts.executeQuery("SELECT * FROM Attendance");
            
            
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<table border ><tr> <th>Roll Number </th> <th> Name </th> <th> Attendance </th> <tr><br>");
           // doGet(request, response);
            while (rs.next()){
            	String id=rs.getString("Roll_Number");
            	String name=rs.getString("Name");
            	String At=rs.getString("Attendance");
            	out.println("<tr>");
            	out.println("<td>"+id+"</td>");
            	out.println("<td>"+name+"</td>");
            	out.println("<td>"+At+"</td></tr><br>");
            	
            }
            
            out.println("</body></html>");
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Attendance
 */
@WebServlet("/Attendance")
public class Attendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private static final String SELECT_STUDENT_QUERY =  "SELECT * FROM Attendance";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attendance() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            Connection con = DatabaseConnection.initializeDatabase();
          //  Connection conn = DatabaseConnection.initializeDatabase();
            PreparedStatement st = con.prepareStatement("insert into Attendance values(?, ?, ?)");
            
            st.setString(1, request.getParameter("Roll_Number"));
            st.setString(2, request.getParameter("Name"));
            st.setString(3, request.getParameter("Attendance"));
            st.executeUpdate();
            
            st.close();
            

            con.close();
           // Statement sts = conn.createStatement();
            //ResultSet rs=sts.executeQuery("SELECT * FROM Attendance");
            
            
            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted" + "</b><br>");
           // doGet(request, response);
            /*
            while (rs.next()){
            	String id=rs.getString("Roll_Number");
            	String name=rs.getString("Name");
            	String At=rs.getString("Attendance");
            	out.println("<tr>");
            	out.println("<td>"+id+"</td>");
            	out.println("<td>"+name+"</td>");
            	out.println("<td>"+At+"</td></tr><br>");
            	
            }*/
            
            out.println("</body></html>");
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		
		}
	}



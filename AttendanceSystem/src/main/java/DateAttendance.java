import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateAttendance
 */
@WebServlet("/DateAttendance")
public class DateAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            Class.forName(DbUtil.driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");
              String date=request.getParameter("date");
              // Query/statement to insert the values
           Statement st=conn.createStatement();
           String sql="alter table Attendance add `" + date + "` varchar(10)";
           st.execute(sql);
           st.close();
            
            
            
           // String sql2="update Attendance set `"+date+"`=? where Roll_Number=?";
          //  PreparedStatement sts=conn.prepareStatement(sql2);
            PrintWriter out=response.getWriter();
            out.println("<html><body><h1> Attendance recorded successfully </h1> </body></html>");
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertDetails
 */
@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
            Class.forName(DbUtil.driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");
              
              // Query/statement to insert the values
            PreparedStatement st = conn.prepareStatement("insert into studentdetails values(?, ?, ?, ?)");
  
            // set values into the query
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
            st.setString(2, request.getParameter("name"));
            st.setString(3, request.getParameter("email"));
            st.setString(4, request.getParameter("phnum"));
  
            // Execute the query
            st.executeUpdate();
  
            st.close();
            conn.close();
  
            // Redirect the response to success page
            response.sendRedirect("Success.jsp?msg=Insert");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
	}

}

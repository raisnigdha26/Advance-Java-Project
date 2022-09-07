import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateStatic {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
			Statement st=con.createStatement();
			int res=st.executeUpdate ("update user set name='ABC',pass='A123',age=22 where id=101");
			if(res>=0)
				System.out.println(res+" row updated");
			else
				System.out.println("no row updated");
			con.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e);
		}
		catch(SQLException e) {
			System.out.println("Exception "+e);	
		}
			}
		
	}


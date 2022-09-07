import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectSortedByName {
	public static void main(String[] args) {
		Connection con;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from user order by name");
		while (rs.next()){
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t\t"+rs.getInt(4));
			}
			
			}
			catch(ClassNotFoundException e)

			{
			System.out.println(e.toString());

			}

			catch(SQLException e)
			{
			System.out.println(e.toString());
			}
	}
}

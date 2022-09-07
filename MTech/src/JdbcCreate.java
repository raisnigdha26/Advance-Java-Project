import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {

	public static void main(String[] args) {
		Connection con;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		Statement st = con.createStatement();
		st.executeUpdate ("create table user" + "(id integer,name varchar(30),pass varchar(30),age integer,primary key(id))");
		System.out.println("Table created");
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertStatic {
	public static void main(String[] args)
	{
	Connection con;
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
	Statement st = con.createStatement();
	st.executeUpdate ("insert into user values" + "(59,'Snigdha Rai','Srai@1234',20)");
	System.out.println("Row inserted");
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

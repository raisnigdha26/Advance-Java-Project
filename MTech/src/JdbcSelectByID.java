import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSelectByID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		Connection con;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		Statement stm=con.createStatement();
		String q="Select * from user where id='"+id+"'";
		ResultSet rs=stm.executeQuery(q);
		if(rs.next())
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4));
		else
			System.out.println("Record not found");
		}
		catch(ClassNotFoundException e)

		{
		System.out.println(e.toString());

		}

		catch(SQLException e)
		{
		System.out.println(e.toString());
		}
		sc.close();
	}

}

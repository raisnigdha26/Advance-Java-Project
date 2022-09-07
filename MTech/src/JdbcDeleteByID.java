import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDeleteByID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		Connection con;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		Statement stm=con.createStatement();
		String q="delete from user where id='"+id+"'";
		int res=stm.executeUpdate(q);
		if(res>=0)
			System.out.println(res+" row deleted");
		else
			System.out.println("no row deleted");
		con.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e);
		}
		catch(SQLException e) {
			System.out.println("Exception "+e);	
		}
		sc.close();
	}

}

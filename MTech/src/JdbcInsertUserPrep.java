import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcInsertUserPrep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter password : ");
		String pass = sc.next();
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		Connection con;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, pass);
		ps.setInt(4, age);
		int res=ps.executeUpdate();
		if(res==1){
		System.out.println("\nRow inserted");
		}
		else{
		System.out.println("\nRow is not inserted");
		}
		ps.close();
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertUserStmt {

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
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","Srai@1234");
		Statement st=con.createStatement();
		int res=st.executeUpdate("insert into user values("+id+",'"+name+"','"+pass+"',"+age+")");
		if(res==1){
		System.out.println("\nRow inserted");
		}
		else{
		System.out.println("\nRow is not inserted");
		}
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCTest {
	
	public static void main(String[] args) {
		Connection connection =null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
		}
		catch(ClassNotFoundException c){
			System.out.println("Class not found");
		}
		catch(SQLException sqlException){
			System.out.println("Could not connect");
		}
		
		finally{
			if(connection!=null){
				System.out.println("Connection created");
			}
		}
	}

}

package Day046;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Oracle002 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn;
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "O2", "2222");
			if(conn!=null) {
				System.out.println("Database에 연결되었습니다.");
			}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); }
	}

}

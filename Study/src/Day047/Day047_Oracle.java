package Day047;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Day047_Oracle {
	public static void main(String[] args) {
		try {
			//driver연동
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db연동
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "o3", "3333");
			if(conn!=null) {
				System.out.println("DataBase에 연결되었습니다.");
			}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); }
	}
}

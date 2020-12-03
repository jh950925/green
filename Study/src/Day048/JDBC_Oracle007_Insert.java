package Day048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Oracle007_Insert {
	public static void main(String[] args) {
		Connection conn = null; Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o4";
		String pass = "4444";
		String sql = "insert into test (no,email) values ('3','ccc@gmail.com')";
		try {
			//1.드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.db연동 o4/4444
			conn = DriverManager.getConnection(url, id, pass);
			//3.insert sql구문 실행
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) { System.out.println("Insert성공 " + result); } //1
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace(); 
		} finally {
			if(stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}//end main
}//end class

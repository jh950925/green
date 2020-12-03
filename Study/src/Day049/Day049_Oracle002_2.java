package Day049;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day049_Oracle002_2 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o5";
		String pass = "5555";
		Connection conn = null;	
		Statement stmt = null;
		String sql = "update userinfo set age =1";
		try {
			Class.forName("oracle.jdbc.driver.OracleDirver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>-1) {
				System.out.println("성공!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt !=null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

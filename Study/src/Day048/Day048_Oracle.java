package Day048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day048_Oracle {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o4";
		String pass = "4444";
		Statement stmt = null;
		int result = 0;
		
		try {
			//1. 드라이버 연동
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Connection /   o4/4444 연동
			conn = DriverManager.getConnection(url,id,pass);
			if(conn!=null) { System.out.println("DB연동 완료"); }
			////////////////////////////////////////////////////////////////////////////////////////////////////
			//3. Statement sql 구문 실행시켜줌.
			stmt = conn.createStatement();
			result = stmt.executeUpdate("create table jdbc0 (no number primary key , email varchar2(100))");
			
			////////////////////////////////////////////////////////////////////////////////////////////////////
			stmt.close(); // 다썻으면 구문 닫기
			conn.close(); // 다썻으면 다른곳에서 db사용가능하게 닫기
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace(); }
	}
}

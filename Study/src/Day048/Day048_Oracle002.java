package Day048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day048_Oracle002 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o4";
		String pass= "4444";
		Connection conn=null;
		Statement stmt;
		int result =0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			if(conn!=null) { System.out.println("DB연결"); }
			stmt = conn.createStatement();
			result = stmt.executeUpdate("create table userinfo (no number primary key, name varchar2(100), age number)");
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); }
	}
}

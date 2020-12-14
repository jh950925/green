package Day052;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day052_1 {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="ouser";
		String pass="1111";
		Connection conn=null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			if(conn != null) { System.out.println("DB연결"); } 
			stmt = conn.createStatement();
			ResultSet srt = stmt.executeQuery("select * from milk");
			System.out.println("mno\tmname\tmprice");
			System.out.println("=======================");
			while(srt.next()) { 
				System.out.println(
				  srt.getInt("mno") + "\t" 
				+ srt.getString("mname") + "\t"
				+ srt.getString("mprice"));
			}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); 
		} finally {
			if(stmt !=null) { try { stmt.close(); } catch (Exception e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
		}
	}
}

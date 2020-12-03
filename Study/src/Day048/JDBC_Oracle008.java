package Day048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Oracle008 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o4";
		String pass = "4444";
		String [] sql = {
				"insert into coffee values ('1','아메리카노','1500')",
				"insert into coffee values ('2','카페라뗴','2500')",
				"insert into coffee values ('3','아메리카노','1500')"
				};
		Statement stmt = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			for(int i=0; i<sql.length;i++) {
				int num = stmt.executeUpdate(sql[i]);
				System.out.println(num);
			}
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt !=null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		
	}//end main
}//end class

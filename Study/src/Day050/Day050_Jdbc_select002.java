package Day050;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day050_Jdbc_select002 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o6";
		String pass = "6666";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from coffee"); 
			
			System.out.println("CNO\tCNAME\t\tCPRICE");
			while(rset.next()) { 
				System.out.println("---------------------------------------------------------------");
				System.out.println(rset.getInt("CNO") + "\t" 
				+ rset.getString("CNAME") + "\t"
				+ rset.getString("CPRICE"));
			}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); 
		} finally {
			if(rset != null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

package Day049;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Day049_Oracle003 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o5";
		String pass = "5555";
		Connection conn = null;
		Statement stmt = null;
		int result =-1;
		String sql = "update coffee_up set cnum=1, ctotal=cprice*cnum";
		String sql2="update coffee_up set cnum=3 where cno=2";
		String sql3="update coffee_up set cnum=2 where cno=3";
		String sql4="upeate coffee_up set ctotal=cpirce*cnum";
		//////////////////////////////////////////////////////////////////
		try {
			// db연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			// 입력값
			stmt = conn.createStatement();
			if(Integer.parseInt(JOptionPane.showInputDialog("1.초기화, 2.값계산")) == 1) {
				result = stmt.executeUpdate(sql);
			}else {
				result= stmt.executeUpdate(sql2);
				result= stmt.executeUpdate(sql3);
				result= stmt.executeUpdate(sql4);
			}
			if(result != -1) { System.out.println("업데이트 성공"); }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if (stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

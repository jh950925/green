package Day048;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_Controller {
	public static void main(String[] args) {
		Db_Frame db = new Db_Frame();
		db.show();
		
		db.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String id = "o4";
				String pass = "4444";
				Statement stmt = null;
				Connection conn = null;
				int num = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, id, pass);
					System.out.println("o4연결");
					stmt = conn.createStatement();
					num = stmt.executeUpdate("create table coffee (CNO number primary key not null,CNAME varchar2(20) not null, CPRICE number not null)");
					System.out.println("2. 테이블 완성 : DDL - " + num);
				} catch (ClassNotFoundException e) { e.printStackTrace(); 
				} catch (SQLException e) { e.printStackTrace(); 
				} finally {
					if(stmt != null) {try { stmt.close();} catch (SQLException e){ e.printStackTrace(); } }
					if(conn != null) {try { conn.close();} catch (SQLException e){ e.printStackTrace(); } }
				}//end finally
			}//end ActionEvent
		});//end btn
	}//end main
}//end class

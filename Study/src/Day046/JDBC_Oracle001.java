package Day046;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC_Oracle001 {
	public static void main(String[] args) {

		try {
			//1.oracle 연동하기 - 드라이버 연동
			//회사명.프로젝트명.단위
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.database연동
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "1234"); 
			if(conn!=null) {
				System.out.println("DataBase에 연결되었습니다.");
			}
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); }
		
	}
}
//SID 확인 명령어
//select name from v$database;
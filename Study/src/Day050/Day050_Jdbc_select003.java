package Day050;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Day050_Jdbc_select003 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o6";
		String pass = "6666";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; 
		Scanner scanner =new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from userinfo"); 
			
			System.out.println("NO\tNAME\t\tAGE");
			while(rset.next()) { 
				System.out.println("---------------------------------------------------------------");
				System.out.println(rset.getInt("NO") + "\t" 
				+ rset.getString("NAME") + "\t"
				+ rset.getString("AGE"));
			}
			System.out.println("ㅁ 검색하고자 하는 학생 번호를 입력해 주세요 : ");
			int num = scanner.nextInt();
			System.out.println("== 학생 정보입니다.");
			ResultSet srt = stmt.executeQuery("select * from userinfo where no = "+num+"");
			while(srt.next()) { 
				System.out.println("---------------------------------------------------------------");
				System.out.println(srt.getInt("NO") + "\t" 
				+ srt.getString("NAME") + "\t"
				+ srt.getString("AGE"));
			}
			scanner.close();
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); 
		} finally {
			if(rset != null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

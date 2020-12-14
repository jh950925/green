package Day050;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Day050_Jdbc_select001 {
	public static void main(String[] args) {
		//1. 드라이버 로딩
		//2. o6/6666접속
		//3. select * from coffee
		//4. create table board as select * from o5.board; 가져오기
		//5. Q1) user o5에 있는  coffee 테이블 복사해서 가져오기 => create table coffee as select * from o5.coffee;
		//6. Q2) user o3에 있는  emp 테이블 복사해서 가져오기 => create table emp as select * from o3.emp;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o6";
		String pass = "6666";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; //result들의 결과물의 집합 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			//1. stmt.executeUpdate(sql); -=> insert, update, delete   (DDL) 사용할때 사용
			//2. stmt.executeQuery(sql); //SQL select statement 
			rset = stmt.executeQuery("select * from board"); //표 전체를 rset에 넣기 1.표
			
			/** "select * from board" **/
//	        NO SUBJECT                        CONTENT                                            W_DATE
//	        ---------- ------------------------------ -------------------------------------------------- --------
//	                 1 oracle                         시퀀스001                                          20/12/03
//	                31 oracle                         시퀀스003                                          20/12/03
			System.out.println("no\tsubject\t\tcontent\t\tw_date");
			while(rset.next()) { //2.줄
				System.out.println("---------------------------------------------------------------");
				System.out.println(rset.getInt("NO") + "\t" 
				+ rset.getString("SUBJECT") + "\t\t"
				+ rset.getString("CONTENT") + "\t\t"
				+ rset.getString("W_DATE"));//3. 칸
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

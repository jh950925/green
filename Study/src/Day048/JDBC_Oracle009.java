package Day048;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class UserInfo{
	public static int cnt = 0; //static처럼 공용으로 사용하는 무언가가 db상에 존재해야합니다.
	private int no;
	private String name;
	private int age;
	
	public UserInfo() { super(); }
	public UserInfo(String name) { super(); this.no = ++cnt; this.name = name; }
	public UserInfo(String name, int age) { super(); this.no = ++cnt; this.name = name; this.age = age; }
	public UserInfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	@Override
	public String toString() { return "UserInfo [cnt=" + cnt + ", no=" + no + ", name=" + name + ", age=" + age + "]"; }
}

public class JDBC_Oracle009 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o4";
		String pass = "4444";
		Statement stmt = null;
		Connection conn = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<UserInfo> list = new ArrayList<>();
		/////////////////////////////////////////////////////////////////////////////////////////
		UserInfo [] users = {new UserInfo("first" ,11),new UserInfo("second" ,22),new UserInfo("third",33),new UserInfo("fourth") };
		for(int i=0; i<users.length;i++) { list.add(users[i]); }
		/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println(list);
		System.out.println("유저이름 입력 : "); String name = scanner.next();
		System.out.println("유저나이 입력 : "); int age = scanner.nextInt();
		list.add(new UserInfo(name,age));
		System.out.println(list);
		/////////////////////////////////////////////////////////////////////////////////////////
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			if(conn != null) { System.out.println("DB 연동\n"); }
			stmt = conn.createStatement();
			
			for(int i=0; i<list.size();i++) {
				UserInfo temp = list.get(i);
				stmt.executeUpdate("insert into userinfo (no,name,age) values ('"+temp.getNo()+"','"+temp.getName()+"','"+temp.getAge()+"')");
			}
			
			System.out.println("insert 성공!");
		} catch (ClassNotFoundException e) { e.printStackTrace(); 
		} catch (SQLException e) { e.printStackTrace(); 
		} finally {
			if(conn!=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt!=null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}//end main
}

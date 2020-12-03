package Day049;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

class UserInfo{
	private String name;
	private int age;
	public UserInfo() { super(); }
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
}

public class Day049_Oracle001 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o5";
		String pass = "5555";
		Connection conn = null;	
		Statement stmt = null;
		ArrayList<UserInfo> list = new ArrayList<>();
		UserInfo user = new UserInfo();
		//////////////////////////////////////////////////////////////////
		try {
			//db연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			if(conn != null) { JOptionPane.showMessageDialog(null, "DB연결!!"); }
			
			//입력값
			String name = JOptionPane.showInputDialog("추가할 유저 이름을 적어주세요");
			int age = Integer.parseInt(JOptionPane.showInputDialog("유저 나이를 적어주세요"));
			stmt = conn.createStatement();
			user.setName(name);
			user.setAge(age);
			list.add(new UserInfo(user.getName(),user.getAge()));
			System.out.println(list);
			stmt.executeUpdate("update userinfo set age=10 where no=1");
			stmt.executeUpdate("update userinfo set age=20 where no=2");
			stmt.executeUpdate("update userinfo set age=30 where no=3");
			stmt.executeUpdate("update userinfo set age=40 where no=4");
			stmt.executeUpdate("insert into userinfo values (seq_u.nextval,'"+user.getName()+"','"+Integer.toString(user.getAge())+"')");
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

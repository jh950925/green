package Day049;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

class UserInfo2{
	private String cname;
	private int cage;
	public UserInfo2() { super(); }
	public UserInfo2(String cname, int cage) {
		super();
		this.cname = cname;
		this.cage = cage;
	}
	public String getCname() { return cname; } public void setCname(String cname) { this.cname = cname; }
	public int getCage() { return cage; } public void setCage(int cage) { this.cage = cage; }
	@Override
	public String toString() {
		return "UserInfo [name=" + cname + ", age=" + cage + "]";
	}
}

public class Day049_Oracle002 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "o5";
		String pass = "5555";
		Connection conn = null;	
		Statement stmt = null;
		ArrayList<UserInfo2> list = new ArrayList<>();
		UserInfo2 user = new UserInfo2();
		//////////////////////////////////////////////////////////////////
		try {
			//db연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pass);
			if(conn != null) { JOptionPane.showMessageDialog(null, "DB연결!!"); }
			
			//입력값
			String name = JOptionPane.showInputDialog("주문할 커피 이름을 적으시오");
			int age = Integer.parseInt(JOptionPane.showInputDialog("주문할 커피 가격을 적으시오 적어주세요"));
			stmt = conn.createStatement();
			user.setCname(name);
			user.setCage(age);
			list.add(new UserInfo2(user.getCname(),user.getCage()));
			System.out.println(list);
			stmt.executeUpdate("insert into coffee values (seq_coffee1.nextval,'"+user.getCname()+"','"+Integer.toString(user.getCage())+"')");
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}

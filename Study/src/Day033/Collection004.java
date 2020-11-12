package Day033;

import java.util.Vector;

class UserInfo{

	private String name;
	private int age;
	private int cnt;
	public static int cnt_no=1;
	public UserInfo() {
		super();
		this.cnt= cnt_no++;
	} 
	
	public UserInfo(String name, int age) {
		super(); 
		this.name = name;
		this.age = age;
		this.cnt=cnt_no++;
	}
	
	@Override
	public String toString() {
		return "User"+cnt +" : " + name + " / " + age ;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class Collection004 {
	public static void main(String[] args) {

		Vector user  = new Vector();
		
		user.add(new UserInfo("아이언맨",50));
		user.add(new UserInfo("헐크",40));
		user.add(new UserInfo("캡틴",120));
		
		for(int i=0; i<user.size();i++) {
			System.out.println(user.get(i));
			
		}
	}
}

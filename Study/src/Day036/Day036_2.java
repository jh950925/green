package Day036;

import java.util.HashSet;
import java.util.Iterator;

class UserInfo {
	private String name;
	private int age;
	public UserInfo() { super(); }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override
	public String toString() {
		return name+"\t"+age;
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class Day036_2 {
	public static void main(String[] args) {

		HashSet<UserInfo> ironHash = new HashSet<>();

		ironHash.add(new UserInfo("IRON",50));
		ironHash.add(new UserInfo("HULK",40));
		ironHash.add(new UserInfo("CAPTAIN",120));
		
		Iterator<UserInfo> iter = ironHash.iterator();
		
		System.out.println("========================");
		System.out.println("NAME\tAGE");
		System.out.println("========================");
		while(iter.hasNext()) {
			UserInfo temp = iter.next();
//			System.out.println(iter.next());
			System.out.println(temp.getName()+"\t"+temp.getAge());
		}
	}
}

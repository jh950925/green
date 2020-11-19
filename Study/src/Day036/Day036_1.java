package Day036;

import java.util.ArrayList;

public class Day036_1 {
	public static void main(String[] args) {
		ArrayList<UserInfo> user = new ArrayList<UserInfo>();
		
		user.add(new UserInfo("IRON",50));
		user.add(new UserInfo("HULK",40));
		user.add(new UserInfo("CAPTAIN",120));
		line();
		for(int i=0;i<user.size();i++) {
			System.out.println(user.get(i).getName()+"\t"+user.get(i).getAge());
		}
	}
	public static void line() {
		System.out.println("====================");
		System.out.println("Name\tAge");
		System.out.println("====================");
	}
}

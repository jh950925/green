package Day035;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class UserInfo{
	private String name;
	private int age;
	public UserInfo() {
		this.name=name;
		this.age =age;
	}
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override
	public String toString() {
		return name + "\t" + age;
	}
	
}
////////////////////////////////////////////////////////////////////////////////////////////////////
public class ArrayList003 {
	public static void main(String[] args) {

		//q1) DTO 목적 : 멤버변수 private / 멤버함수 : getter + setter / 생성자
		//    UserInfo : name(이름) / age(나이)
		//q2) 
		line();
		System.out.println("NAME\tAGE");
		line();
		//q3) ㅁmain
			//3-1) ArrayList를 이용해서 Users 만들기
			ArrayList<UserInfo> Users = new ArrayList<UserInfo>();
			//3-2) UserInfo 이용해서 다음 데이터 셋팅 Iron(50) / Hulk(40) / Captain(120)
			UserInfo[] user = {
								new UserInfo("Iron",50), 
								new UserInfo("Hulk",40), 
								new UserInfo("Captain",120) 
							  };
			//3-3) users에 3-2) 한 데이터 담기
			for(int i=0; i<user.length;i++) {
				Users.add(user[i]);
			}
			//3-4) for구문 이용해서 출력하기
			String prit = "";
			for(int i=0; i<user.length;i++) {
				prit+=Users.get(i)+"\n------------------\n";
//				System.out.println(Users.get(i));
			}
				JOptionPane.showMessageDialog(null, prit);
	}
	public static void line() {
		System.out.println("=========================");
	}
}

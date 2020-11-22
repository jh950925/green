package Day031_interface;

import java.util.Arrays;
import java.util.Scanner;

//model역할
class UserInfo{
	public static int ucnt=0;
	private int uno;
	private String uid,upass;
	
	
	public UserInfo() { super(); }
	public UserInfo(int uno, String uid, String upass) {
		super();
		this.uno = ucnt;
		this.uid = uid;
		this.upass = upass;
	}
	public static int getUcnt() {
		return ucnt;
	}
	public static void setUcnt(int ucnt) {
		UserInfo.ucnt = ucnt;
	}
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "UserInfo [uno=" + uno + ", uid=" + uid + ", upass=" + upass + "]";
	}
	
}
////////////////////////////////////////////////////////
//controller역할
interface Menu{
	void menu();	//메뉴판 
	void create();	//유저입력받아주는 기능
	void read();	//출력
}
////////////////////////////////////////////////////////
class Using001 extends UserInfo implements Menu{
	UserInfo[] users;
	static int usercnt =0;
	int num =0;
	Scanner scanner;
	public Using001() {
		users = new UserInfo[3];
		scanner = new Scanner(System.in);
	}
	@Override public void menu(){ 
		while(true) {
			int num = 0;
			System.out.println(Arrays.toString(users));
			System.out.println("==메뉴를 선택하시오.");
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("9.종료");
			System.out.println("=선택>>>");
			num = scanner.nextInt();
			switch(num) {
			case 1:
				create();continue;
			case 2:
				read();continue;
			}if(num==9) {break;}
		}
	}
	
	@Override public void create(){  
			users[usercnt] = new UserInfo();
			System.out.println();
			System.out.println("========================");
			System.out.println("= 유저정보 입력");
			System.out.println("========================");
			System.out.println("Id   입력 : ");
			users[usercnt].setUid(scanner.next());
			System.out.println("Pass 입력 : ");
			users[usercnt].setUpass(scanner.next());
			users[usercnt++].setUno(usercnt);
			
		}
	@Override public void read(){  
		System.out.println();
		System.out.println("=============================");
		System.out.println("NO\tID\tPASS");
		System.out.println("=============================");
		for(int i=0; i<usercnt;i++) {
			System.out.println(users[i].getUno()+"\t"+users[i].getUid()+"\t"+users[i].getUpass());
		}
		
	}
	
}
////////////////////////////////////////////////////////
public class Interface006 {
	public static void main(String[] args) {
		Using001 user = new Using001();
		user.menu();
	}
}

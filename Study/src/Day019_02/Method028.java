package Day019_02;

import java.util.Scanner;

public class Method028 {

	public static void main(String[] args) {
		//변수
		String user = "";
		String [] user2 = {"","",""};
		//입력
		user = user_input();
		//출력
		user_show(user, user2);
	}
	public static String user_input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("유저정보를 입력하세요 : ");
		return scanner.next();
	}
	
	public static void user_show(String user, String[] user2) {
		user2 = user.split("/");	//split(분리기준 문자열) : String[]
		
		System.out.println(user2[0]+"\t"+user2[1]+"\t"+user2[2]);
	}
}

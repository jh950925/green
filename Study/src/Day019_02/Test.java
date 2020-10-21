package Day019_02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//변수
		String[][] users= {
				{"aaa","111","한국"},
				{"bbb","222","호주"},
				{"ccc","333","중국"}};
		
		//입력
		who_are_you(users); //사용자에게 입력을 받는 메서드

		//출력
		who_pass_change(users); //비밀번호 변경 메서드

	}
	public static void who_are_you(String users[][]) {
		String user=null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		user = scanner.next();
		for(int i=0;i<users.length;i++) {
			if(user.equals(users[i][0])){
				System.out.println(users[i][0]+"는 "+users[i][2]+"사람입니다.");
			}
		}
	}
	//method name : who_are_you
	//return : void
	//parameter : String users[][]
	
	public static void who_pass_change(String users[][]) {
		String id=null, pass=null;
		boolean first=true;
		Scanner scanner = new Scanner(System.in);

		System.out.print("아이디를 입력해주세요 > ");
		id = scanner.next();
		System.out.print("비밀번호를 입력해주세요 > ");
		pass = scanner.next();
		for(int i=0;i<users.length;i++) {
			if(id.equals(users[i][0])&&pass.equals(users[i][1])){
				System.out.println(users[i][0]+"님 반갑습니다. 바꿀 비밀번호를 입력해주세요");
				users[i][1] = scanner.next();
				System.out.print("정보확인 : ");
				for(int j=0;j<users[i].length;j++) {
					if(first) {first=false;}
					else {System.out.print("/");}
					System.out.print(users[i][j]);
				}System.out.println();
			}
			else System.out.println("정확히 입력해주세요");break;
		}
	}
	//method name : who_pass_change
	//return : void
	//parameter : String users[][]
}



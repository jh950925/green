package Day019;

import java.util.Arrays;
import java.util.Scanner;

public class Method029 {

	public static void main(String[] args) {
		String[][] users = {{"aaa","111","한국"},
							{"bbb","222","호주"},
							{"ccc","333","중국"}};
		
		//입력
		who_are_you(users);		// 사용자에게 입력을 받는 메서드
		
		who_pass_change(users);	// 비밀번호 변경메서드
		
	}//end main
	public static void who_are_you(String users[][]) {
		Scanner scanner = new Scanner(System.in);
		String st1 ="";
		System.out.println("아이디를 입력 해주세요 : ");
		st1 = scanner.next();
		for(int i=0; i<users.length; i++) {
			if(st1.equals(users[i][0])) {
				System.out.println(st1+"는 "+users[i][2]+"사람입니다.");
			}
		}
	}
	public static void who_pass_change(String users[][]){
		Scanner scanner = new Scanner(System.in);
		String id ="",pass="",pass_ch="";
		
		System.out.println("아이디를 입력 해주세요 : ");
		id = scanner.next();
		System.out.println("비밀번호를 입력 해주세요 : ");
		pass = scanner.next();
		
		for(int i=0; i<users.length;i++) {
			if(pass.equals(users[i][1])) {
				System.out.println(users[i][0]+"님 반갑습니다. 바꿀 비밀번호를 입력해 주세요 :");
				pass_ch = scanner.next();
				users[i][1] = pass_ch;
				if(pass_ch.equals(users[i][1])) {
					System.out.println("정보확인 : " + Arrays.toString(users[i]));
				}break;
			}else {
				System.out.println("정확히 입력해 주세요");
				break;
			}
		}
	}
}//end class

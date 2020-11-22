package Day007;

import java.util.Scanner;

public class Switch011 {

	public static void main(String[] args) {

		int user = 0, com =0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		com = (int)(Math.random()*3)+1;	//컴퓨터가 1,2,3 랜덤하게 숫자 처리
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. : ");
		user = scanner.nextInt();
		
		//처리
		switch(user-com){
			case 0 : result = "무승부";break;
			case -1 : case 2 :result = "컴승"; break;
			case -2 : case 1 :result = "유저승"; break;
			
		}
		//출력
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴은" + com + "입니다.");
		System.out.println(result );
		
		
	}

}

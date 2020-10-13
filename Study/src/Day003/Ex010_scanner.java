package Day003;

import java.util.Scanner;

public class Ex010_scanner {

	public static void main(String[] args) {
		// [GIGO]
		
		// 변수
		int mynum = 0;
		Scanner scanner = new Scanner(System.in);
		// 1.Scanner (입력을 받아주는 클래스 : 자료형) = new(공간상에 Scanner써야 하니까 공간 마련)
		// 2.Scanner(System.in)	System.in(키보드로 입력하겠다) 
		// 2. ctrl + shift + o(알파벳)
		
	 	// 입력
		System.out.println("당신이 좋아하는 숫자는?");
		mynum = 10; //예시
		mynum = scanner.nextInt(); //키보드로 정수형 입력 받는 기능
		// 처리
		
		// 출력
		System.out.println("당신이 좋아하는 숫자는 " + mynum + "입니다.");
	}

}

package Day006;

import java.util.Scanner;

public class IF010 {

	public static void main(String[] args) {
		
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		a = scanner.nextInt();
		
		if(a%2 == 0 ) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
	
	}

}

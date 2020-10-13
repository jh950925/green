package Day006;

import java.util.Scanner;

public class IF011 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("어린이의 나이를 입력하시오 : ");
		age = scanner.nextInt();
		
		if(age>=1 && age <=5) {
			System.out.println(""+age+"살 입니다.");
		}else {
			System.out.println("1~5의 이런이가 아닙니다.");
		}

	}

}

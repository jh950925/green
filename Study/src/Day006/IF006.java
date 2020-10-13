package Day006;

import java.util.Scanner;

public class IF006 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력해주세요 : ");
		a = scanner.nextInt();
		System.out.println("숫자 2을 입력해주세요 : ");
		b = scanner.nextInt();
		System.out.println("숫자 3을 입력해주세요 : ");
		c = scanner.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("최대 값 : " + a);
			}else {
				System.out.println("최대 값 : " + c);
			}
		}else if(b>c) {
			System.out.println("최대 값 : " + b);
		}else {
			System.out.println("최대 값 : " + c);
		}

	}

}

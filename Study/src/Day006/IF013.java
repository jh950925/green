package Day006;

import java.util.Scanner;

public class IF013 {

	public static void main(String[] args) {
		
		int a,b = 0;
		String c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 1을 입력해주세요 : ");
		a = scanner.nextInt();
		System.out.println("정수 2을 입력해주세요 : ");
		b = scanner.nextInt();
		System.out.println("연산자를 입력해주세요 : ");
		c = scanner.next();
		char ch = c.charAt(0);
				
		if(ch=='+'){
			System.out.println(""+a+ch+b+"="+(a+b));
		}else if(ch=='-'){
			System.out.println(""+a+ch+b+"="+(a-b));
		}else if(ch=='*'){
			System.out.println(""+a+ch+b+"="+(a*b));
		}else if(ch=='/'){
			System.out.println(""+a+ch+b+"="+(a/b));
		}else {
			System.out.println("숫자와 연산자를 제대로 입력해주세요");
		}

	}

}

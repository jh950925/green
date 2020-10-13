package Day003;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1 입력 : ");
		a = scanner.nextInt();
		
		System.out.println("숫자 2 입력 : ");
		b = scanner.nextInt();
				
		System.out.println("더하기 결과 : " + a + " + " + b + " = " + (a+b) );
		System.out.println("빼 기 결과 : " + a + " - " + b + " = " + (a-b) );
		System.out.println("곱하기 결과 : " + a + " * " + b + " = " + (a*b) );
		System.out.println("나누기 결과 : " + a + " / " + b + " = " + String.format("%.5f", a/(double)b) );
		
	}

}

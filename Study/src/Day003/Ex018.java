package Day003;

import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		
		int a, b = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자1 입력 : ");
		a = scanner.nextInt();
		System.out.println("숫자2 입력 : ");
		b = scanner.nextInt();
		
		double result = a / (double)b;
		
		System.out.println("나누기 결과 : " + a +" / " + b + " = " + result);
		System.out.println("나누기 결과 : " + a +" / " + b + " = " + Math.round(result*100)/100.0);
		System.out.println("나누기 결과 : " + a +" / " + b + " = " + (int)(result*100)/100.0F);
		
		
	}

}

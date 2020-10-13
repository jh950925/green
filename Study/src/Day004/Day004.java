package Day004;

import java.util.Scanner;

public class Day004 {

	public static void main(String[] args) {
		
		int a, b, c ,result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		a = scanner.nextInt();

		System.out.println("영어 점수 입력 : ");
		b = scanner.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		c = scanner.nextInt();
		
		result = a + b + c;
		
		System.out.println("총점\t\t\t : " + result);
		System.out.println("총점\t\t\t : " + String.format("%.2f",((result*100)/100)*3f));
		
		
	}

}

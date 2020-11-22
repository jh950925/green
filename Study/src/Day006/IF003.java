package Day006;

import java.util.Scanner;

public class IF003 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num = scanner.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}else if(num == 0) {
			System.out.println("zero");
		}else {
			System.out.println("음수");
		}
	}

}

package Day006;

import java.util.Scanner;

public class IF004 {

	public static void main(String[] args) {
		

		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1,2,3 중 좋아하는 숫자를 입력하세요");
		num = scanner.nextInt();
		
		if(num == 1) {
			System.out.println("one");
		}else if(num==2) {
			System.out.println("two");
		}else if(num==3) {
			System.out.println("three");
			
		}else {System.out.println("1,2,3 을 입력하세요");}
	}

}

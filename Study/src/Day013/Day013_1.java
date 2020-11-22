package Day013;

import java.util.Scanner;

public class Day013_1 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("10,20,30중에 입력하세요 : ");
		num = scanner.nextInt();
		
		if(num==10) {
			System.out.println("ten");
		}else if(num==20) {
			System.out.println("twenty");
		}else if(num==20) {
			System.out.println("thirty");
		}
		scanner.close();
	}

}

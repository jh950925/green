package Day013;

import java.util.Scanner;

public class Day013_2 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("10,20,30중에 입력하세요 : ");
		num = scanner.nextInt();
		
		switch(num) {
		case 10 : 
			System.out.println("ten");break;
		case 20 : 
			System.out.println("twenty");break;
		case 30 : 
			System.out.println("thirty");break;
		}
		
		scanner.close();
	}

}

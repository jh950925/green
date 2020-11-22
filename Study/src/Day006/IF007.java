package Day006;

import java.util.Scanner;

public class IF007 {

	public static void main(String[] args) {
		
		double year = 0;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 : ");
		year = scanner.nextDouble();
		
		if(year%4==0 && year%100 !=0 || year%400 == 0 ) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}


	}

}

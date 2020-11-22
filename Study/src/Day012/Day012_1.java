package Day012;

import java.util.Scanner;

public class Day012_1 {

	public static void main(String[] args) {

		int a = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 한개 입력받기 : ");
		a = scanner.nextInt();
		
		if(a==1) {
			System.out.println("1이다.");
		}else if(a==2) {
			System.out.println("2이다.");
		}else if(a==3) {
			System.out.println("3이다.");
		}else {
			System.out.println("1,2,3중에 입력해 주세요");
		}
		scanner.close();
	}

}

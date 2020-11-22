package Day008;

import java.util.Scanner;

public class For014 {

	public static void main(String[] args) {

		int age = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("조용필씨 나이를 입력해 주세요 : ");
			age = scanner.nextInt();
			if(age ==70) {
				break;	
			}
		}
		System.out.println("조용필씨 나이는 " + age + "입니다.");
		scanner.close();
	}

}

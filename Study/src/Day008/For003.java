package Day008;

import java.util.Scanner;

public class For003 {

	public static void main(String[] args) {
		int num = 0, i=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구구단 프로그램입니다.");
		System.out.print("원하는 단을 입력해주세요 : ");
		num = scanner.nextInt();
		System.out.println("["+num+"단]");
		
		for(i=1;i<10;i++) {
			System.out.println(num + "*" + i + "=" + num*i );
		}
	
		scanner.close();
	}

}

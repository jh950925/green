package Day007;

import java.util.Scanner;

public class Switch004 {

	public static void main(String[] args) {

		int month = 0;
		
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력하시오 : ");
		month = scanner.nextInt();
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "현재 계절은 봄입니다.";break;
		case 6 : case 7 : case 8 : result = "현재 계절은 여름입니다.";break;
		case 9 : case 10 : case 11 : result = "현재 계절은 가을입니다.";break;
		case 12 : case 1 : case 2 : result = "현재 계절은 겨울입니다.";break;
		}
		System.out.println(result);
	}

}

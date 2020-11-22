package Day010;

import java.util.Scanner;

public class Day010_1 {

	public static void main(String[] args) {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("1,2,3 중에 한개의 숫자를 입력하세요 : ");
		num = scanner.nextInt();
		if (num == 1) {
			result = "1이다.";
		} else if (num == 2) {
			result = "2이다.";
		} else if (num == 3) { 
			result = "3이다.";
		} else {
			result = "유효하지 않은 숫자입니다.";
		}

		System.out.println(result);
		scanner.close();
	}

}

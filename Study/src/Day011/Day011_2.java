package Day011;

import java.util.Scanner;

public class Day011_2 {

	public static void main(String[] args) {

		char num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("a,b,c중에 한개의 문자를 입력하시오 : ");
		num = scanner.next().charAt(0);

		switch (num) {
		case 'a':
		case 'A':
			System.out.println("apple입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("banana입니다.");
			break;
		case 'c':
		case 'C':
			System.out.println("coconut입니다.");
			break;
		default:
			System.out.println("a,b,c중에 입력해주세요");
			break;
		}
		scanner.close();
	}

}

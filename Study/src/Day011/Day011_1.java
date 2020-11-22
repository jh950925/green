package Day011;

import java.util.Scanner;

public class Day011_1 {

	public static void main(String[] args) {

		char num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("a,b,c중에 한개의 문자를 입력하시오 : ");
		num = scanner.next().charAt(0);

		if (num == 'a' || num == 'A') {
			System.out.println("apple입니다.");
		} else if (num == 'b' || num == 'B') {
			System.out.println("banan입니다.");
		} else if (num == 'c' || num == 'C') {
			System.out.println("coconut입니다.");
		} else {
			System.out.println("a,b,c중에 입력해주세요");
		}

		scanner.close();
	}

}

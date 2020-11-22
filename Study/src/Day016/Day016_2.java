package Day016;

import java.util.Scanner;

public class Day016_2 {

	public static void main(String[] args) {

		String A = " ";
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("생일의 영단어를 입력하세요");
			A = scanner.next();
			if(A.equals("birthday")) {
				System.out.println("생일축하합니다.");
				break;
			}
		}
		scanner.close();
	}

}

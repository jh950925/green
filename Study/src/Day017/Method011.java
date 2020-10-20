package Day017;

import java.util.Scanner;

public class Method011 {

	public static void main(String[] args) {
		char ch =' ';
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("입력받은 문자 : ");
		ch = scanner.next().charAt(0);
		System.out.println("변환된 문자 : " + lower(ch));
		
		scanner.close();
	}
	public static char lower(char ch) {
		int result = 0;
		if (ch >= 'A' && ch <= 'Z') {
			result = ch + 32;
		} else if (ch >= 'a' && ch <= 'z') {
			result = ch - 32;
		}

		return (char) result;
	}
}

package Day006;

import java.util.Scanner;

public class IF012 {

	public static void main(String[] args) {
		
		String str;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 a 또는 A, b 또는 B, c 또는 C를 입력하시오 : ");
		str = scanner.next();
		char ch=str.charAt(0);
		
		
		if(ch == 'A' || ch == 'a') {
			System.out.println("apple");
		}else if(ch == 'B' || ch == 'b') {
			System.out.println("banan");
		}else if(ch == 'C' || ch == 'c') {
			System.out.println("coconut");
		}else {
			System.out.println("a,b,c 가 아닙니다.");
		}
	}

} 


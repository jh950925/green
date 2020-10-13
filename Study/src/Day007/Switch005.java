package Day007;

import java.util.Scanner;

public class Switch005 {

	public static void main(String[] args) {

		char fruit = ' ';
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 알파벡 a,b,c, 중에 입력해주세요 : ");
		fruit = scanner.next().charAt(0);
		
		switch(fruit) {
		case 'a' : case 'A' : result ="apple"; break;
		case 'b' : case 'B' : result ="banan"; break;
		case 'c' : case 'C' : result ="coconut"; break;
		default : result = "a,b,c,A,B,C가 아닙니다..";
		}
		System.out.println(result);
	}

}

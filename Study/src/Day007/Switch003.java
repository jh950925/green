package Day007;

import java.util.Scanner;

public class Switch003 {

	public static void main(String[] args) {

		char fruit = ' ';
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 알파벳 a,b,c 중에 입력해주세요 : ");
		fruit = scanner.next().charAt(0);
		
		switch(fruit) {
		case 'a' : result = "apple"; break;
		case 'b' : result = "banan"; break;
		case 'c' : result = "coocnut"; break;
		default : result ="a,b,c 가 아닙니다.";
		}
		System.out.println(result);
	}

}

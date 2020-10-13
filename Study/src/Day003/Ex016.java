package Day003;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		
		String str = "abc";		//문자열 : abc
		char ch = ' '; 			//문자  : a   ★초기화 잡을 떄 주의사항 : '공백하나' 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 좋아하는 색상은?");
		str = scanner.next();	// "abc" , "ab", "abcd"
		
		System.out.println("당신이 좋아하는 알바벳(a,b,c)은?");
		ch = scanner.next().charAt(0);	//charAt(0)

		/*
		 * scanner.next()	문자열 선택("abc")
		 * .charAt(0)		첫번째 번호("a(0)")
		 */
		
		System.out.println("문자열 - 색상 :" + str);
		System.out.println("문자열 - 색상 :" + str.charAt(0));
		System.out.println("문자열 - 색상 :" + str.charAt(2));
		System.out.println("문자열 - 색상 :" + str.charAt(1));
		System.out.println("문자 - 알파벳 :" + ch);
		
	}

}

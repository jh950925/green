package Day003;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		String str = "";
		char ch = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요");
		str = scanner.next();
		
		System.out.println("당신의 반을 입력하시오(A/B)");
		ch = scanner.next().charAt(0);
		
		System.out.println("USERINFO");
		System.out.println("===================");
		System.out.println("Name : " + str);
		System.out.println("Class : " + ch );
		System.out.println("===================");
		
		
	}

}

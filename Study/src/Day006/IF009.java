package Day006;

import java.util.Scanner;

public class IF009 {

	public static void main(String[] args) {
		
		String str = " ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력해 주세요 : ");
		str = scanner.next();
		char ch=str.charAt(0);
				
		if(ch>='A' && ch<='Z') {
			char ch01 = (char)(ch+32); 
			System.out.println("대문자" + ch +"의 소문자는" + ch01);
		}else if(ch>='a' && ch<='z'){
			char ch02 = (char)(ch-32); 
			System.out.println("소문자"+ch +"의 대문자는" + ch02);
		}else {
			
		}

	}

}

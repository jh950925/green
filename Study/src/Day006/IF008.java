package Day006;

import java.util.Scanner;

public class IF008 {

	public static void main(String[] args) {
		
		String str = " ";
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력해 주세요 : ");
		str = scanner.next();
		char ch=str.charAt(0);
				
		if(ch>='A' && ch<='Z') {
			System.out.println(""+ch+" : 문자는 대문자입니다.");
		}else if(ch>='a' && ch<='z'){
			System.out.println(""+ch+" : 이 문자는 소문자입니다.");
		}else {
			
		}
		
		

	}

}

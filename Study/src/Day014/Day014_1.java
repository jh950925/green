package Day014;

import java.util.Scanner;

public class Day014_1 {

	public static void main(String[] args) {
		char ch = ' '; String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("j,s,e중에 입력해 주세요 > ");
		ch = scanner.next().charAt(0);
				
		if(ch == 'j') {
			result = "java";
		}else if(ch == 's') {
			result = "spring";
		}else if(ch == 'e') {
			result = "e-gov";
		}
		
		System.out.println(result);
		scanner.close();
	}

}

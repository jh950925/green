package Day014;

import java.util.Scanner;

public class Day014_2 {

	public static void main(String[] args) {

		char ch = ' '; String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("j,s,e중에 입력해 주세요 > ");
		ch = scanner.next().charAt(0);
		
		switch(ch) {
		case 'j' : 
			result = "java";break;
		case 's' :
			result = "spring";break;
		case 'e' :
			result = "e-gov";break;
		}
		
		System.out.println(result);
		scanner.close();
	}

}

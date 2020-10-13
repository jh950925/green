package Day007;

import java.util.Scanner;

public class Switch008 {

	public static void main(String[] args) {

		int age = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하시오.");
		age = scanner.nextInt();
		
		//case 안쪽에 if / 삼항연산자를 붙이는게 가능
		switch(age/10) {
		case 0 : case 1 : result = (age == 19)? "청년:":"-";break;
		case 2 : case 3 : result = "청년";break; 
		case 4 :  		  result = "중년";break; 
		case 5 : 		  result = "장년";break;
		default : result = "노인";
		}
		System.out.println(result);
	}

}

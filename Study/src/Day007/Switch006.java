package Day007;

import java.util.Scanner;

public class Switch006 {

	public static void main(String[] args) {

		char gender = ' ';
		String result="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요. (011231-1111222) : ");
		gender = scanner.next().charAt(7);
		
		switch(gender) {
		case '1' : case '3' : result = "남자"; break;
		case '2' : case '4' : result = "여자"; break;
		default : result ="유효하지 않은 주민등록 번호입니다..";
		}
		System.out.println(result);
	}

}

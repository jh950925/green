package Day007;

import java.util.Scanner;

public class Switch010 {

	public static void main(String[] args) {

		char jumin= ' ';
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요. ex)011231-1111111");
		jumin = scanner.next().charAt(7);
		
		//switch 구문안에 switch가 들어갈 수 있다.
		switch(jumin) {
		case '1' : case '3' : {result = "남성";
			switch(jumin) {
			case '1' : result += "-1900년대생"; break;
			case '3' : result += "-2000년대생"; break;
			}
		}break;
		case '2': case '4' : {result = "여성";
		switch(jumin){
		case '2' : result += "-1900년대생";break;
		case '4' : result += "-2000년대생";break;
		}
		}break;
		default : result = "휴효하지 않은 주민등록 번호입니다.";
		}
		System.out.println(result);
	}
}

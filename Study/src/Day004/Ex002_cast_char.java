package Day004;

public class Ex002_cast_char {

	public static void main(String[] args) {
		
		// 정수형, 문자형과의 변환
		// 아스키코드 ASCII code
		// 문자 A 숫자 65
		System.out.println((int)'A');			// char (2byte) => 65	int (4byte)
		System.out.println((char)65);			// int (4byte) => 'A' char(2byte)
		System.out.println((int)'B');			//q1) 대문자 B는 숫자로 변환시 얼마?    -> 66
		System.out.println((int)'a');			//q2) 소문자 a는 숫자로 변환시 얼마?    -> 97
		System.out.println((int)' ');			//q3) ' '는 숫자로 변환시 얼마?    -> 32
		System.out.println((int)'\r');			//q4) \r는 숫자로 변환시 얼마?    -> 13
		
		System.out.println((char)('A' + 32));			//q5) 대문자 A를 소문자 a로 변환하기
		System.out.println((int)('A'-'a'));		//q5) 얼마?					-> -32
		
		//q7) 아래의 변수를 이용하여 10 + 3 = 13 출력하시오.
		int a = 10; int b = 3; char op = '+';
		System.out.println("" + a + op + b + "=" + (a+b));
		
	}

}

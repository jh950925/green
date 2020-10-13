package Day003;

public class Ex009_dataType {

	public static void main(String[] args) {
		
		System.out.println("1. 논리형 : boolean ");
		boolean flag = true;
		System.out.println("논리형은 맞다 틀리다. 현재상태는 : " + flag);
		flag = false;
		System.out.println("논리형은 맞다 틀리다. 현재상태는 : " + flag);
		
		System.out.println("\n2. 정수형 : 10, 20, 30");
		// 용량만 확인하기!!
		byte by = 1;	short sh = 2;	int in = 4;		long lo = 8;
		System.out.println(by +"\t"+ sh +"\t"+ in +"\t" + lo);
		
		System.out.println("\n3. 실수형 : 3.14");
		// float는 뒤에 f를 붙여서 표현
		float fl = 3.14f;	double dou = 3.14;
		System.out.println(fl +"\t"+ dou);
		
		System.out.println("\n4. 문자형 : A");
		// 문자는 '' 로 표시
		char ch = 'A';
		System.out.println(ch);
		
		System.out.println("\n5. 문자열 : ABC");
		String str = "abc";
		System.out.println(str);
	}

}

//		논리형 :  true(맞다) / false(틀리다)
//		정수형 : byte 	shot 	int 	long / 양수(unsigned) 	음수(signed)
//		실수형 : float	double
//		문자형 : char    
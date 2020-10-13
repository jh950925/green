package Day004;

public class Ex001_cast {

	public static void main(String[] args) {
		
//		 1. 자동형변환
//		 작은 타입의 데이터형은 큰타입의 데이터형으로 아무런 작업없이 변환할 수 있다.
//		 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
//		 실수형 : float(4byte), double(8byte)
		
		byte b = 10; int a;
		a = b; //b를 a에 대입하세요 a = 4byte,   b = 1byte
		
//		ql) int a2 = 3;	long lo = a2; 		가능한 코드?
//		q2) a2 = lo;					  		가능한 코드?
//		q3) float fl = 1.2f; double d = fl; 	가능한 코드?
//		q4) fl = d
		
		int a2 = 3;	long lo = a2; //가능
//		a2 = lo; 불가능
		float fl = 1.2f; double d = fl;	//가능
//		fl = d; 불가능
		
		
		
//		2. 강제형변환
//		q5) 강제형변환을 이용해서 다음과 같은 결과가 나오게 만들어주세요
		System.out.println((int)(1.5) + (int)(2.7));		//3
//		q6) 결과를 적어주세요!
		System.out.println((int)(1.5 + 2.7)); //4
		

	}

}

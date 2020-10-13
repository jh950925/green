package Day009_02;

public class For016_Ex {

	public static void main(String[] args) {

		System.out.println("문자역(String) 비교는 == 으로 처리해서는 안된다.");
		
		//기본형 : boolean, byte, short, int ,long, float, double, char (2byte)
		//참조형 : String
		char op = '+';		//2byte 문자 1개밖에 못집어 넣어요!!
		String a ="Hello World";	//2byte, 4byte 6byte
		String b = a;
		String c = new String("Hello World");
		
		// == 		비교하는 대상의 (링크)를 비교
		// equals 	비교하는 대상의 (값, 내용)을 비교
		System.out.println(a==b);			//true
		System.out.println(a==c);			//false
		System.out.println(a.equals(b));	//true		문자열비교시 equals 사용
		System.out.println(a.equals(c));	//true
		
		System.out.println("주소확인1: "+ System.identityHashCode(a));	//2111991224
		System.out.println("주소확인2: "+ System.identityHashCode(b));	//2111991224
		System.out.println("주소확인3: "+ System.identityHashCode(c));	//292938459
		
	}

}

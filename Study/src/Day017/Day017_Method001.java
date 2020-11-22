package Day017;

public class Day017_Method001 {

	public static void main(String[] args) {
		System.out.println("====================================");
			System.out.println("[ver-1]");
			System.out.println("HI");
			System.out.println("HI");
			System.out.println("HI");
			
			
			line();
			System.out.println("[ver-2]"); 
			hi();	//2-2 함수 호출
	}//end main
	
//	1. 함수구조 익히기 	(리턴값		함수이름			(파라미터)) {}
//	함수이름만 부르면 자동으로 {} 처리
//	public(어디에서나 접근가능) 	static(Method001라는 클래스 안에 멤버, 공용가능)
//	void(리턴값 : {}안에 처리한 값, 처리한 숫자나 문자열을 호출한 곳에 결과 보고할께 없으면 void)
//	() 재료, 인수, 인자, 파라미터가 들어갈 곳
//	2-1 함수 정의
	public static void hi() {
		System.out.println("Hi");
	}
	
	public static void line() {
		System.out.println("\n====================================");
	}
	
}//end class

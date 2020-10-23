package Day021;

public class Wrapper001 {

	public static void main(String[] args) {

		System.out.println("10"+3); //103 +의 의미1)숫자+숫자(연산)  /2) 문자열+문자열(연결)
		System.out.println(Integer.parseInt("10")+3);
		System.out.println(Integer.parseInt("-10")+3);
		//리턴값 : int java.lang.Integer.parseInt:메서드명 (String s:파라미터)
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
	}

}

//	api 안내
//		-wrapper 클래스는 기본자료형의 업그레이드 기능들을 자바팀에서 만들어 놨습니다.
//		int a = 5;  //2진법으로 만들어주세요.
//	■ Wrapper 클래스
//		1. 기본자료형 (boolean,byte,short,int,long,float,double,char)
//		의 데이터 타입을 객체화할 수있는 클래스들		
//		※ 참조형(String)
//		2. int vs Integer	
//		int는     정수를 저장					=>단순히 값 처리시 사용
//		Integer는 정수를 저장 + 기능(메소드)들을 포함
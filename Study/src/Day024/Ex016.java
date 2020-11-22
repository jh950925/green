package Day024;

public class Ex016 {

	public static void main(String[] args) {
		System.out.println("Q16)다음 중 지역변수에 대한 설명으로 옳지 않은것은?(모두 고르시오)");
		System.out.println("a.자동 초기화 되므로 별도의 초기화가 필요없다."); // 지역변수는 초기화를 무조건 시켜줘야한다. 
		System.out.println("b.지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.");
		System.out.println("c.메서드의 매개변수로 선언된 변수도 지역변수이다.");
		System.out.println("d.클래스변수나 인스턴스 변수보다 메모리 부담이 적다."); 
		System.out.println("e.힙 영역에 생성되며 가비지 컬렉터에 의해 소멸된다."); // 스택영역 생성
		System.out.println("정답 : a, e");
	}

}

package Day024;

public class Ex014 {

	public static void main(String[] args) {
		System.out.println("Q14) 다음중 초기화에 대한 설며으로 옳지 않은것은?(모두 고르시오)");
		System.out.println("a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.");
		System.out.println("b.지역변수는 사용하기전에 반드시 초기화해야한다.");
		System.out.println("c.초기화 블럭보다 생성자가 먼저 수행된다."); //생성자가 맨 마지막
		System.out.println("d.명시적 초기화를 제일 우선적으로 고려해야한다."); // 기본값이 제일 우선적으로 초기화
		System.out.println("e.클래스 변수보다 인스턴스 변수가 먼저 초기화 된다."); //클래스변수가 메모리 할당 되어있어서 먼저 초기화
		System.out.println("정답 : c,d,e");
	}

}

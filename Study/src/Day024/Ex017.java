package Day024;

public class Ex017 {

	public static void main(String[] args) {
		
//		println("Color.red")
//		method1
//		method2
//		main
		System.out.println("Q17)호출스택이 다음과 같은 상황일때 옳지 않은 설명은?(모두 고르시오)");
		System.out.println("a.제일먼저 호출스택에 저장된 것은 main 메서드이다.");
		System.out.println("b.println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.");
		System.out.println("c.method2메서드를 호출한 것은 main 메서드이다.");
		System.out.println("d.println메서드가 종료되면 method1메서드 수행을 재개한다.");
		System.out.println("e.main-mathod1-print의 순서대로 호출되었다.");
		System.out.println("f.현재 실행중인 메서드는 println뿐이다.");//나머지는 실행은 되지만 '현재'는 println만이고 나머지 호출
		System.out.println("정답 : b");
	}

}

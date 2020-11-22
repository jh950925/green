package Day024;

public class Class028 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");// 1
		firstMethod(); // 3번호출 -> 그 밑줄 secondMethod(); 호출 -> 5 6번 순서대로 출력 => 4
		secondMethod();// 다시 5 6번 호출
		System.out.println("main(String[] args)이 끝났음");// 2
	}

	// 순서 : 1 => 3 => 5 => 6 => 4 => 5 => 6 => 2
	static void firstMethod() {
		System.out.println("main(String[] args)이 시작되었음");// 3
		secondMethod();
		System.out.println("main(String[] args)이 끝났음");// 4
	}

	static void secondMethod() {
		System.out.println("main(String[] args)이 시작되었음");// 5
		System.out.println("main(String[] args)이 끝났음");// 6
	}
}

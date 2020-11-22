package Day017;

public class Method005 {

	public static void main(String[] args) {
		System.out.println("RETURN");

		line("ver-1"); // 줄바꿈 두개 [ver-1]
		System.out.println("1. 내가 좋아하는 숫자는 : " + 5); // 무조건 숫자 5
		System.out.println("2. 10/3 을 실수로 표현 : " + 3.333); // 실수표현
		System.out.println("3. BEST COLOR : " + "RED"); // 문자열
		System.out.println("4. 장수돌침대 별이 : " + "★★★★★"); // 별
		System.out.println("5. 10 + 20 = " + 30); // 두 수의 합
		System.out.println("6. 반(A/B) :  " + 'A'); // 문자

		line("ver-2"); // 줄바꿈 두개 [ver-1]
		System.out.println("1. 내가 좋아하는 숫자는 : " + return_num());
		System.out.println("2. 10/3을 실수로 표현 : " + return_float());
		System.out.println("3. BEST COLOR : " + mycolor());
		System.out.println("4. 장수돌침대 별이 : " + jangsu());
		System.out.println("5. 10 + 20 = " + myadd(10, 20));
		System.out.println("6. 반(A/B) :  " + myclass());
		System.out.println("당신의 학번은? : " + stdId(1111)); // 당신의학번은? G1111
		System.out.println("당신의 평균은? : " + stdAvg(88)); // 당신의 평균은? B

	}// end main

//	Method
	// stdId
	public static String stdId(int A) {
		return "G" + A;
	}

	// stdAvg
	public static char stdAvg(int A) {
		if (A >= 90 && A <= 100) {
			return 'A';
		} else if (A >= 80 && A < 90) {
			return 'B';
		} else if (A >= 70 && A < 80) {
			return 'C';
		} else {
			return 'D';
		}
	}

	// line
	public static void line(String A) {
		System.out.println("\n\n[" + A + "]");
	}

	// return_num
	public static int return_num() {
		return 5;
	}

	// return_float
	public static float return_float() {
		return 3.333f;
	}

	// mycolor
	public static String mycolor() {
		return "red";
	}

	// jabgsu
	public static String jangsu() {
		return "red";
	}

	// myadd
	public static int myadd(int a, int b) {
		return a + b;
	}

	// myclass
	public static char myclass() {
		return 'A';
	}

}// end class

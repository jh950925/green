package Day023;

class MyMath3 {
	// 멤버변수

	// 멤버함수
	//int보다 long이 큰 범위를 가지고 있어서 long으로 하면 되지만 형 변환을 연습하려고 이렇게 썻습니다.
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int add(long num1, int num2) {
		return (int) num1 + num2;
	}

	public int add(int num1, long num2) {
		return num1 + (int) num2;
	}

	public long add(long num1, long num2) {
		return num1 + num2;
	}

	public int add(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	// 생성자
	MyMath3() {

	}
}

public class Class018 {
	public static void main(String[] args) {
		// MyMath3 인스턴스 변수 : [num1 | num2]
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : mm
		MyMath3 mm = new MyMath3();
		// 인스턴스 변수 : [int num1=3 |int num2=3]
		System.out.println("mm.ad(3,3) 결과 : " + mm.add(3, 3));
		// 인스턴스 변수 : [long num1=3 |int num2=3]
		System.out.println("mm.ad(3L,3) 결과 : " + mm.add(3L, 3));
		// 인스턴스 변수 : [int num1=3 |long num2=3]
		System.out.println("mm.ad(3,3L) 결과 : " + mm.add(3, 3L));
		// 인스턴스 변수 : [long num1=3 |long num2=3]
		System.out.println("mm.ad(3L,3L) 결과 : " + mm.add(3L, 3L));

		// 인스턴스 변수 : []
		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}


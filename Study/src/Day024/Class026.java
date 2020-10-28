package Day024;

public class Class026 {
	int a;
	public static String COMPANYNAME = "(주) 프로그램 시작부터 종료까지";

	public static void main(String[] args) {
		Class026 b = new Class026();
		System.out.println("1.인스턴스 변수와 클래스 변수 : 인스턴스(a),클래스(COMPANYNAME)");
		System.out.println("2.각각의 변수가 runtime data area에서 저장되는 위치를 적으시오 : Heap : a | Method : COMPANYNAME");
		System.out.println("클래스변수 : " + Class026.COMPANYNAME);
		System.out.println("인스턴스 변수 : " + b.a);
	}
}
 
package Day023;

public class Ex012 {

	public static void main(String[] args) {
		System.out.println("Q12. 다음 중 아래의 add 메서드를 올바르게 오버로딩 한 것은?(모두고르시오)");
		System.out.println("==선언==");
		System.out.println("[\t\tlong add (int a, int b) {return a+b}]\t\t\t]");
		System.out.println("==문제==");
		System.out.println("a.[\tlong add (int x, int y) {return x+y}]\t]");
		System.out.println("b.[\tlong add (long x, long y) {return x+y}]\t]");
		System.out.println("c.[\tlong add (byte x, byte y) {return x+y}]\t]");
		System.out.println("d.[\tlong add (long x, int y) {return x+y}]\t]");
		System.out.println("정답 : b,c,d");
	}

}

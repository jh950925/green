package Day032_Inner;

public class Ineer001 {
	public static void main(String[] args) {
		System.out.println("ver-1");
		Outer o1 = new Outer();
		System.out.println("1.객체(tostring) : " + o1);
		System.out.println("2.satic변수 : " + Outer.oi);
		System.out.println("인스턴스 변수 : " + o1.oa);
		o1.show0();
		
		System.out.println("\nver-2");
		Outer.Inner1 inner = new Outer().new Inner1();
		System.out.println("4. 내부클래스 멤버 : " + inner.ii1);
		inner.show2();
		
		System.out.println("\nver-3");
		Outer o2 = new Outer();
		Outer.Inner1 inner2 = o2.new Inner1();
		inner2.show2();
		////////////////////////////////////////////////////////////
		//q1) Outer안에 Inner2 클래스의 show3 호출해주세요
		System.out.println("\nOuter안에 Inner2 클래스의 show3 호출해주세요");
		Outer.Inner2 test = new Outer().new Inner2();
		test.show3();
	}
}

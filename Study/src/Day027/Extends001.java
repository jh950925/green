package Day027;

class A1 extends Object {
	int a;
}

class B1 extends A1 {//## extends 상속
	int b;
}

class C1 extends B1 {//##
	int c;

	public void showC() {
		System.out.println("상속받은 A클래스의 a : " + a); // 상속을 받았기 때문에 a 사용가능
		System.out.println("상속받은 A클래스의 B : " + b); // 상속을 받았기 때문에 b 사용가능
		System.out.println("자신의멤버 C클래스의 c : " + c); // 상속을 받았기 때문에 c 사용 가능
	}
}
 
public class Extends001 { 

	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a=10; myc.b=20; myc.c=30;
		myc.showC();
	}

}

package 포트폴리오;

class A {
	int a;
}

class B {
	public void setting(A tempdata) {
		tempdata.a = 10;
	}
}

public class Test2 {
	public static void main(String[] args) {
		A maindata = new A();
		B joindata = new B();
		joindata.setting(maindata); // 정보받아오기 : maindata

		System.out.println(maindata.a);
	}// 아 이해했어요 네네네~
}

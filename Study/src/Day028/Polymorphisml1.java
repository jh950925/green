package Day028;

class TestA{
	int a = 10;
	public TestA() {
		super();
	}
}
class TestB{
	int a= 20;
	public TestB() {
		super();
	}
}

public class Polymorphisml1 {
	private void mian(String[] args) {

		TestA ta = new TestA();
//		TestB tb = ta; : TestA와 TestB는 서로 상속관계가 이니기때문에 다른 클래스로 판별, 조건자체를 사용할 수 없다.
//		System.out.println(tb.a);
	}
}

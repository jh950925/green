package Day028;

class TestA4{
	int a = 10;
	public TestA4() {
		super();
	}
	
	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
}
/////////////////////////////////////////////////
class TestB4 extends TestA4{
	int b=20;
	public TestB4() {
		super();
	}
	
	@Override
	public String toString() {
		return "TestB2 [b=" + b + "]";
	}
}

public class Polymorphisml4 {
	public static void main(String[] args) {

		TestA4 ta = new TestA4();
		TestB4 tb = new TestB4();
//		tb = (TestB4) ta; : 2번과 동일하게 형 변환을 시켜줘야한다.
	}
}

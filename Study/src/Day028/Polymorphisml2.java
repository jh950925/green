package Day028;

class TestA2 extends Object{
	int a = 10;
	public TestA2() {
		super();
	}
	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
}
////////////////////////////////////////////////
class TestB2 extends TestA2{
	int b= 20;
	public TestB2() {
		super();
	}
	@Override
	public String toString() {
		return "TestB2 [a=" + b + "]";
	}
}
///////////////////////////////////////////////////
public class Polymorphisml2 {
	private void mian(String[] args) {

		//1. TestA2[a=10]		2.new	3.TestA2() [a=10]		4.ta(1000) = (1000) TestA2()[a=10]
		//2. Object [멤버변수 | 멤버함수]
		//3. TestA2 [a=10   | toString()]
		TestA2 ta = new TestA2();
		System.out.println(ta);
		
		System.out.println();
		
		//생성되는 순서 
		//2. Object [멤버변수 | 멤버함수]
		//3. TestA2 [a=10   | toString()]
		//4. TestB2	[b=20   | @Override toString(0) ]
		TestB2 tb = new TestB2();
//		System.out.println(b2);
		//자손클래스의 참조변수는 조상클래스의 인스턴스변수를 참조할 수 없다.
		//생성자의 역할은 인스턴스변수를 초기화하여 사용할 수있게 해준다.
		//초기화한적이 없다.
		System.out.println();
		
		TestB2 Test = (TestB2) ta; //: TestB2를 A2로 바꾸던지 아니면 강제 형 변환을 시켜야 한다. => 자식이 부모를 참조할때
	}
}

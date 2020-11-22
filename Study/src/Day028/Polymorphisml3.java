package Day028;

class TestA3{
	int a = 10;
	public TestA3() {
		super();
	}
	@Override
	public String toString() {
		return "TestA3 [a=" + a + "]";
	}
}
////////////////////////////////////////////////
class TestB3 extends TestA3{
	int b= 20;
	public TestB3() {
		super();
	}
	@Override
	public String toString() {
		return "TestB3 [b=" + b + "]";
	}
}
///////////////////////////////////////////////////
public class Polymorphisml3 {
	public void mian(String[] args) {
		
		System.out.println("\n\n=====================================================");
		TestA3 ta = new TestA3();
		System.out.println(ta + "\t");
		
		System.out.println("\n\n=====================================================");
		TestB3 tb = new TestB3();
		System.out.println(tb + "\t");
		ta = tb;	//자손 클래스는 부모클래스에 담길 수 있다 : 업캐스팅
					//자식은 부모를 담을 수 없다			  : 다운캐스팅
		System.out.println(ta);
//		System.out.println(ta.a+"/"+ta.b ); : 조상클래스는 자손 클래스의 정보듣 받지 않는다. 정보는 조상 => 자손으로 넘어감
	}
}

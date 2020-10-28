package Day024;

final class FianlBasic {
	String name;
	final int age = 10;

	public final void show() { // 메서드에 붙이면 상속받는 자식에서 오버라이드가 안됌
		System.out.println("::::: STATIC + FINAL");
		System.out.println(":: 이름 : " + this.name);
		System.out.println(":: 나이 : " + this.age);
	}

	@Override
	public String toString() {
		return "FianlBasic [name=" + name + ", age=" + age + "]";
	}

	public FianlBasic() {

	}
}

//class FianlBasic02 extends FianlBasic {
//	// void show()는 오버라이드 불가
//}

public class Class029_final_basic {
	public static void main(String[] args) {
		System.out.println(Math.PI); // s.f가 있으면 static final;
		// 1.FianlBasic FianlBasic[name=,age=]
		// 2.new 공간불러오비
		// 3.FianlBasic[name=null,age=10]

		FianlBasic f1 = new FianlBasic();
//		f1.age=20;//상수는 변경 불가
		f1.show();
	}
}

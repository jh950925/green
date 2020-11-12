package Day032_Inner;

public class Class004 {

	public static void main(String[] args) {
		System.out.println("다음과 같은 실행결과를 얻도록 코드를 완성하시오");
		Outer004 outer = new Outer004();
		Outer004.Inner inner = outer.new Inner();
		inner.mehthod11();
	}

}

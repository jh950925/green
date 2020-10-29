package Day025;

class SutdaCard14{
	final int NUM; //private선언 후 get 사용해서 값만 넘겨주고 set을 쓰지 않아서 다시 못받음
	final boolean IS_KWANG;// 혹은 멤버변수들을 final로 선언
	
	SutdaCard14(){
		this(1, true);
	}
	SutdaCard14(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG=isKwang;
	}
	
	@Override
	public String toString() {
		return "SutdaCard14 [NUM=" + NUM + ", IS_KWANG=" + IS_KWANG + "]";
	}
	
}
////////////////////////////////////////////////////////////////////
public class Ex020 {
	public static void main(String[] args) {
		SutdaCard14 a = new SutdaCard14();
		System.out.println(a);
	}
}

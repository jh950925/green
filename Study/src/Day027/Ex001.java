package Day027;

class CA{
	private int a;

	public int getA() { return a; }
	public void setA(int a) { this.a = a; }
	
	public CA() {
		super();
		System.out.println("[CA() 1. CA안의 a 변수 : 인스턴스변수 a 를 사용할 수 있게 생성자가 초기화");
		System.out.println("\t"+this.toString());
	}
	public CA(int a) {
		super();
		this.a = a;
	}
	@Override
	public String toString() {
		return "CA [a=" + a + "]";
	}
}
class CB extends CA{
	private int b;

	public CB() {
		super();
		System.out.println("[CB() 1. CB안의 b 변수 : 인스턴스변수 b 를 사용할 수 있게 생성자가 초기화");
		System.out.println("\t"+this.toString()); // CB [b=0]
	}
	public CB(int b) {
		super();
		this.b = b;
	}
	@Override
	public String toString() {
		return "CB [b=" + b + "]";
	}
}
public class Ex001 {

	public static void main(String[] args) {
		System.out.println("1-1. 상속이란 객체를 재활용하는것이 목적임.");
		System.out.println("1-2. 상속을 하려면 기존의 어떤 클래스가 먼저 생성되어야 함.");
		System.out.println("1-3. 클래스 생성순서 Object => CA => CB");
		CB fishbread = new CB();
		System.out.println(fishbread);
		//생성되는 순서 : Object => CA => CB
		//호출되는 순서 : CB => CA => Object
		//////////////////////////////////
		//객체 => 클래스 : 어떤 사물을 나타낼대는 상태와 행위로 구분하여 표시하는 것이 가능하다.
		//Object [멤버변수 : 	/ 멤버함수 :	]
		//CA	 [멤버변수 : a=0	/ 멤버함수 :			  ----------, getA, setA ]
		//CA	 [멤버변수 : b=0	/ 멤버함수 :	@Override toString(), getB, setB ]
		
	}

}

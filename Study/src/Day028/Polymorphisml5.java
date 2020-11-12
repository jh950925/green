package Day028;

class Papa extends Object{
	//멤버변수
	int money= 10000;
	//멤버함수
	public void sing() {
		System.out.println("남행열차");
	}
	//생성자
	public Papa() {
		super();
	}
}
////////////////////////////////////////////////////////
class Son extends Papa{
	//멤버변수
	int money = 1500;
	
	@Override
	public String toString() {
		return "Son [money=" + money + "]";
	}

	//생성자
	public Son() {
		super();
	}
}
////////////////////////////////////////////////////////
public class Polymorphisml5 {
	public static void main(String[] args) {

		Papa mypapa = new Son();
		System.out.println(mypapa.money);
		mypapa.sing();
	}
}

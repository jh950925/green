package Day029;

abstract class Milk_a {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Milk_a() {
	}

	abstract void drink();
	public void welcome() {
		System.out.println("Wellcome! Green Milk");
	}
}

///////////////////////////////////////////////////////////
class WhiteMilk_a extends Milk_a {
	
	@Override
	void drink() {
		setName("흰우유");
		System.out.println(super.getName()+"를 주문하셨습니다.");
	}
}

///////////////////////////////////////////////////////////
class ChocoMilk_a extends Milk_a{

	@Override
	void drink() {
		setName("초코우유");
		System.out.println(super.getName()+"를 주문하셨습니다.");
	}
}
///////////////////////////////////////////////////////////
class BananaMilk_a extends Milk_a{

	@Override
	void drink() {
		setName("바나나우유");
		System.out.println(super.getName()+"를 주문하셨습니다.");
	}
}
///////////////////////////////////////////////////////////
public class Abstract004 {
	public static void main(String[] args) {

		Milk_a m11 = null;
		m11 = new WhiteMilk_a();
		m11.welcome();
		m11.drink();//흰우유를 주문하셨습니다.
		
		m11 = new ChocoMilk_a();
		m11.drink();//초코우유를 주문하셨습니다.
		
		m11 = new BananaMilk_a();
		m11.drink();//바나나우유를 주문하셨습니다.
		
	}
}

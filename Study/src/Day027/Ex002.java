package Day027;

class Product{
	int price; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public Product() {
		super();
	}

	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}
class Tv extends Product{
	Tv(){ //Product에서 오버로딩은 했는데 기본 생성자가 존재 하지 않았다.
		super();
	}
	
	public String toString() {
		return "Tv";
	}

	public Tv(int price) {
		super(price);
	}
}

public class Ex002 {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println("부모클래스에 기본생성자를 추가하여 인스턴스 변수를 사용가능하게 초기화 시켜야한다.");
		//생성되는 순서 : Object => Product => Tv
		//호출되는 순서 : Tv => Product => Object
		//////////////////////////////////
		//생성자 오버로딩 :	1. default - 자동으로 생성
		//				2. 파라미터 있는 생성자 - default 생성자는 수동으로 만들어야 함
		//dhqjfheld, tkdthr
		
		//Object 	[멤버변수 | 멤버함수 ]
		//Product   [price=0, bonusPoint=0 | 멤버함수 : X] 
		//Tv 		[X | 멤버함수 : toString] 
	}
}

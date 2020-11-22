package Day029;

class Product {
	int price;
	// 생성자
	public Product() { super(); }
	public Product(int price) {
		super();
		this.price = price;
	}
}
///////////////////////////////////////////////
class Tv extends Product {
	public Tv() { super(100); }
	@Override
	public String toString() {
		return "Tv";
	}
}
///////////////////////////////////////////////
class Computer extends Product {
	public Computer() { super(200); }
	@Override
	public String toString() {
		return "Computer";
	}
}

///////////////////////////////////////////////
class Audio extends Product {
	public Audio() { super(50); }
	@Override
	public String toString() {
		return "Audio";
	}
}

///////////////////////////////////////////////
class Buyer {
	static int cnt = 0;
	int money;
	Product[] cart;
	boolean mymoney = true;
	
	//#001. 생성자 : money는 1000으로 셋팅하고 car를 만든다.
	public Buyer() { money=1000; cart = new Product[7]; }
	
	//#002. b.buy(new Tv());
	// 분석 | 리턴값 : void | 메서드명 : buy | 파라미터 : new Tv() 
	public void buy(Product product){
//		System.out.println(product + "\t"+ product.price);
		// (3) 만약 가진돈이 물건의 가격보다 적다면 바로 종료
		if(money < product.price) {
			if(true) {
				System.out.println("1.잔액이 부족하여 " + product + "를 살 수 없습니다.");
				mymoney = false;
				return;
			}
		}
		// (1) 가진돈에서 물건의 가격을 빼고  
		money -= product.price;
		// (2) 장바구니에 담고  
		cart[cnt++] = product;
	}
	
	//#003. b.summary();
	// 분석 | 리턴값 : void | 메서드명 : summary | 파라미터 : X
	// (10 구입한 물건의 목록과 사용금액의 남은 금액을 출력한다.
	public void summary() {
		String item = "";
		int total = 0;
		for(int i=0;i<cart.length;i++) {
			System.out.println(cart[i]);
			total += cart[i].price;
		}
		System.out.println("2.구입한 물건 : " + item);
		System.out.println("2.사용한 금액 : " + total);
		System.out.println("2.남 은 금액 : " + money);
	}
}

public class Ex006 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}

}

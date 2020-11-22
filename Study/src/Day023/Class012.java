package Day023;

class Mobile003{
	//멈베함수
	String company;
	int price; 
	String product;
	//멤버함수
	public void show() {
		System.out.println("=== MOblie_ver3 ===");
		System.out.println("회사 : " + company);
		System.out.println("제품 : " + product);
		System.out.println("가격 : " + price +"원");
	}
	public void sale() {
		price = (int)(price*0.9);
	}
	//생성자
	Mobile003(){
		this.company = "Samsung";
		this.product = "NOTE9";
		this.price = 1200000;
	}
	//생성자오버로딩
	Mobile003(String company, int price, String product) {
		this.company = company;
		this.price = price;
		this.product = product;
	}
}

public class Class012 {
	public static void main(String[] args) {
		// Mobile003 라는 자료형으로 만들 수 있는 인스턴스 변수 : [company | product | price]
		// Mobile003("Sansung",10000,"Note20") => 인스턴스 변수에 [company : "MBC"| price : 10000 |product : "Note20"] 셋팀됨
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : mobile1, mobile2, mobile3
		Mobile003 mobile3 = new Mobile003("Sansung",10000,"Note20");
		mobile3.show();
		
		
		Mobile003 mobile2 = new Mobile003();
		mobile2.show();
		//오버로딩 되어 있는 값이 아닌 일반 생성자를 수동으로 불러옴 
		//인스턴스 변수에 [company : "Samsung"| price : 1200000 |product : "NOTE9"] 셋팀됨
		
		Mobile003 mobile1 = new Mobile003();
		mobile1.company = "Samsung";
		mobile1.price = 1000000;
		mobile1.product = "NOTE20";
		//mobile1이 가지고 있는 주소에 직접 값을 대입함
		//인스턴스 변수에 [company : "Samsung"| price : 1000000 |product : "NOTE20"] 셋팀됨
		mobile1.sale();	//10%세일
		mobile1.show();	//출력
		
	}//end main
}//end Class012

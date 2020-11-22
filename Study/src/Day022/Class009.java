package Day022;

class Coffee002 {
	//멤버변수
	String name;
	int price;
	int num;
	//멤버함수
	public void show() {
		System.out.println("==== 커피");
		System.out.println("커피명 : " + name + "\n커피잔수 : " + num + "\n커피가격 : " + price);
		System.out.println();
	}

	Coffee002(String name, int num, int price) {
		this.name = name;
		this.num = num;
		this.price = price;
	}

	Coffee002() {
		this.name = "아메리카노";
		this.num = 1;
		this.price = 2000;
	}
}

public class Class009 {
	public static void main(String[] args) {
		Coffee002 a1 = new Coffee002("카페라떼", 2, 4000); //생성자 오버로딩시 default 생성자는 수동으로 호출됨.
		a1.show();
		Coffee002 a2 = new Coffee002(); // 디폴트 생성자 Coffee002() {} 안쓰면오류남
		a2.show();
	}
}

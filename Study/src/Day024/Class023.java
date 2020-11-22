package Day024;

class Sawon{
	int pay = 10000;
	static int su = 10;
	
//	static int basicpay = pay; ///###001  ->클래스 변수 안에 인스턴스 변수 대입 못함
	static int basicpay2;
	static {
		basicpay2=20000;
	};
	public static void showSu() {
		System.out.println(su);///###001
	}
	public static void showPay() {
//		System.out.println(this.pay);///###002 -> 클래스 안에 인스턴스 변수 호출 못함
	}
	public void showAll001() { ///###003 
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() { ///###004
//		showAll01();  // -> 클래스안에 인스턴스 못불러옴
//		System.out.println(this.pay); // -> 클래스안에 인스턴스변수 사용 못함
	}
	 
}

public class Class023 {
	public static void main(String[] args) {
		Sawon sola = new Sawon();
	}
}

package Day022;

class MyPrice002{
	String name;
	int price;
	
	public void show() {
		System.out.println("상품이름 : " + name + "\n상품가격 : " + price);
	}
	//생성자 오버로딩
	MyPrice002(){	//러틴값(X) 메서드명 : 클래스명과 동일 / 파라미터() - 기본생성자
		name = "갤럭시노트12";
		price = 110000;
	}
	//진도 - 생성자 오버로딩 (추가)
	//new MyPrice002("갤럭시 폴더", 100000) - 생성자 : 리턴값(X) 메서드명 : 클래스명과 동일 / 파라미터 : String / int
	MyPrice002(String name02, int price02){
		name = name02;
		price=price02;
	}
}

public class Class008 {
	public static void main(String[] args) {
		// 1. MyPRcie002 [name | price | show] 만들 수 있는 단위의 자료형
		// 2. new 공간을 빌려오고
		// 3. [MyPrcie002()] 인스턴스 변수를 초기화 [name | price | show]
		//4. procduct 인스턴스 변수를 사용하게 주소(hip)를 가짐   
		MyPrice002 product = new MyPrice002();
		product.show();
		
		MyPrice002 product2 = new MyPrice002("갤럭시 폴더", 100000);
		product2.show();
	}
}

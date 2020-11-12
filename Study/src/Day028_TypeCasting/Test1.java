package Day028_TypeCasting;

class TestPapa extends Object{
	int money = 10000;
	
	public void sing() {
		System.out.println("남행열차");
	}
	
	public TestPapa() {
		super();
	}
	
}
//////////////////////////////////////////////////
class TestSon extends TestPapa{
	int money = 1500;
	
	
	@Override
	public void sing() {
		System.out.println("안녕 - 폴킴");
	}
	public void papasing() {
		super.sing();
	}
	
	public TestSon() {
		super();
	}
	
}
/////////////////////////////////////////////////////

public class Test1 {

	public static void main(String[] args) {
		TestPapa papa = new TestSon();
		
		//1. papa가 쓸 수 있는 인스턴스변수 [money]
		//2. TestSon() 생성자를 호출해서 초기화단계 체크  TestSon() => [money = 1500 , sing() 안녕-폴킴] => TestPapa() TestPapa [money =10000 #, -----]
		
		//3. 사용할 수 있는 공간 출력
		System.out.println(papa.money);				//10000
		System.out.println(((TestSon)papa).money);	//1500
		papa.sing();								//안녕 - 폴킴
		((TestSon)papa).papasing();					//남행열차
	}

}

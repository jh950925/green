package Day028_TypeCasting;

class Mama extends Object{
	int money = 10;
	public Mama() {
		super();
	}
	@Override
	public String toString() {
		return "Mama [money=" + money + "]";
	}
}

class Son_0001 extends Mama {
	int money = 150;
	int car = 2;
	public Son_0001() {
		super();
	}
	@Override
	public String toString() {
		return "Son_0001 [money=" + money + ", car=" + car + "]";
	}
}


public class Polymorphisml_ex {

	public static void main(String[] args) {
		//1.생성자는 인스턴스 변수를 초기화해서 사용가능하게 해준다.
		//Mama[money]
		Mama mom = new Mama(); ////Mama[money]
		Son_0001 son = new Son_0001();//Son[money,car] - Mama[money]
		
		System.out.println(mom.money);					//#1.10
		
		//2.조상클래스는 자식클래스를 담을 수 있다. : 업캐스팅 : 부모 <= 자식
		Mama mom2 = new Son_0001();		//mom2[money]
		//Son()[--,--] =>moma[money=10]
		Son_0001 son2 = new Son_0001();
		son2 = (Son_0001) mom2;							//#2.
		System.out.println(son2.money+"\t"+son2.car);	//#3.
		//#4. 엄마돈 10원 출력해주기
	}

}

package Day031_interface;
//abstract, interface 공통점 : 설계를 목적으로 함. 자손 클래스에서 구현해야함.
abstract class TestA{}
abstract class TestB{}
abstract class testC extends TestA{} // 클래스는 단일 상속 => 인터페이스로 사용

interface Order{ void order(); }	 // 주문 
interface Best{ void best(); }		 // 베스트
interface OTime { void otime(); }	 // 시간
interface Using1 extends Order, Best, OTime{}
//interface Using2 implements Order, Best, OTime{} => X
	
class MyMilk1 implements Using1{
	@Override public void order() {  }
	@Override public void best()  {  }
	@Override public void otime() {  }
}
class MyMilk2 implements Order, Best, OTime{
	@Override public void order() {  }
	@Override public void best()  {  }
	@Override public void otime() {  }
}
class MyMilk3 extends TestA implements Order,Best{
	@Override public void order() {  }
	@Override public void best()  {  }
}

public class Interface004 {
	public static void main(String[] args) {
		MyMilk3 milk = new MyMilk3();
		if(milk instanceof MyMilk3) { System.out.println("1. MyMilk3"); }
		if(milk instanceof TestA)   { System.out.println("1. TestA"); }
		if(milk instanceof Order)   { System.out.println("1. Order"); }
		if(milk instanceof Best)    { System.out.println("1. Best"); }
		if(milk instanceof Using1)  { System.out.println("1. Using1"); }
	}
}

package Day037;

class Wild001<Integer>{
	private int a;
	public Wild001() { super(); }
	public Wild001(int a) { super(); this.a = a; }
	public int getA() { return a; } public void setA(int a) { this.a = a; }
}
class Wild002<Integer>{
	private String a;
	public Wild002() { super(); }
	public Wild002(String a) { super(); this.a = a; }
	public String getA() { return a; }  public void setA(String a) { this.a = a; }
}
class Wild2<Object>{	//Object 부모는 자식을 담을 수 있다. (Integer,String,double)
	private Object a;
	public Wild2() { super(); }
	public Wild2(Object a) { super(); this.a = a; }
	public Object getA() { return a; }  public void setA(Object a) { this.a = a; }
}
class Wild<k>{
	private k a;
	public Wild() { super(); }
	public Wild(k a) { super(); this.a = a; }
	public k getA() { return a; }  public void setA(k a) { this.a = a; }
}
public class Generics003 {
	public static void main(String[] args) {
		
		/**
		 제네틱1
		 1-1) 기본제네릭스를 이용 : 100
		 1-2) 기본제네릭스를 이용 : abc
		**/
//		System.out.println("\n\n[ver-1]제네릭1");
//		Wild001<Integer> t1 = new Wild001<Integer>(100);
//		System.out.println("1-1) 기본 제네릭스를 이용 : "+ t1.getA());
//		Wild002<String> t2 = new Wild002<String>("abc");
//		System.out.println("1-2) 기본 제네릭스를 이용 : "+ t2.getA()+"\n\n\n");
//		
		/////////////////////////////////////////////////////////////////////
//		System.out.println("\n\n[ver-2]제네릭2 => Test");
//		Wild2<Integer> w1 = new Wild2<Integer>(100);
//		System.out.println("1) 와일드카드를 이용 : " + w1.getA());
//		Wild2<String> w2 = new Wild2<String>("씨리얼");
//		System.out.println("2) 와일드카드를 이용 : " + w2.getA());
//		Wild2<Double> w3 = new Wild2<>(3.14);
//		System.out.println("3) 와일드카드를 이용 : " + w3.getA());
		/////////////////////////////////////////////////////////////////////
		System.out.println("\n\n[ver-3]제네릭3");
		Wild2<Object> w20 = new Wild2<Object>(100);
		System.out.println("0) 와일드카드를 이용 : " + w20.getA());
		Wild2<Integer> w21 = new Wild2<Integer>(100);
		System.out.println("1) 와일드카드를 이용 : " + w21.getA());
		Wild2<String> w22 = new Wild2<String>("씨리얼");
		System.out.println("2) 와일드카드를 이용 : " + w22.getA());
		Wild2<Double> w23 = new Wild2<>(3.14);
		System.out.println("3) 와일드카드를 이용 : " + w23.getA());
		/////////////////////////////////////////////////////////////////////
		System.out.println("\n\n[ver-4]제네릭4");
		Wild2<?> q1 = w21;
		System.out.println(q1.getA());
		Wild2<?> q2 = w22;
		System.out.println(q2.getA());
		/////////////////////////////////////////////////////////////////////
		System.out.println("\n\n[ver-5]제네릭5 - 변수의 제한 (extends 하위타입만 지정 / super 상위타입지정가능)");
		Wild2<? extends Number> ten = w21;
		System.out.println( ten.getA());
		ten = w23;
		System.out.println(ten.getA());
//		ten = w20;
		
		Wild2<? super Number> ten2 = w20; // Object = Number - Integer
		System.out.println(ten2.getA());
//		ten2=w21;	Integer는 Number의 자식이므로 super는 사용 불가
	}
}

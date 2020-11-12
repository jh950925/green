package Day028;

class Parent02{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
///////////////////////////////////////////////////
class Child02 extends Parent02{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
////////////////////////////////////////////////////
public class Polymorphisml7 {
	public static void main(String[] args) {
		//1. Parent [x=100]
		Parent02 p = new Child02();
		//2. Child [x=200,method() ] - Parent [x=100 , ---------------]
		Child02 c = new Child02();
		System.out.println("p.x = "+ p.x); //100
		p.method();
		System.out.println("c.x = "+ c.x); //200
		c.method();
	}
}
//출력화면
//p.x = 100 
//Child Method
//c.x = 200
//Child Method

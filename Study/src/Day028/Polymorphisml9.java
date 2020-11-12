package Day028;

/*********
 1.다향성(Poly Morphism)
 	-poly : 다양한 , 많은
 	-Morphism : 형태
 	
 	다양한 형태를 가질 수 있는 능력
 	하나의 객체를 여러개의 타입으로 해석될 수 있는 성질
 	=>부모클래스는 자식클래스를 담을 수 있다
 	=> Object는 모든 클래스를 담을 수 있다.
  
*********/
//////////////////////////////////////
class ObjectTest extends Object{
	public ObjectTest() { }

	public void show(String A) { System.out.println(A); }

	public void show(Integer A) { System.out.println(A); }

	public void show(Double A) { System.out.println(A); }
	//1. 부모클래스는 자식클래스를 담을 수 있다
	//2. Object는 어떤 형태의 클래스이든지 간에 부모가 된다.
	//3. Object는 모든 클래스를 담을 수 있다.
	public void showTotal(Object A) {
		System.out.println(A.toString());
	}
	//Object.A = new String("Happy") | Object.A = new Integer(10) | Object.A = new Double(3.14)
	//    @Override toString				@Override toString			@Override toString
}
//////////////////////////////////////
public class Polymorphisml9 {
	public static void main(String[] args) {

		ObjectTest test = new ObjectTest();
		
		test.show(new String("Happy"));				//happy
		test.show(new Integer(10));					//10
		test.show(new Double(3.14));				//3.14
		
		System.out.println("\n\nshowTotal이라는 메서드 한개만 만들기\n");
		test.showTotal(new String("Happy"));				//happy
		test.showTotal(new Integer(10));					//10
		test.showTotal(new Double(3.14));					//3.14
	}
}

package Day027;
//////////////////////////////////////////
class Grand extends Object{
	public void one() {
		System.out.println("grand : one");
	}
	public void two() {
		System.out.println("grand : two");
	}

	public Grand() { super(); }
}
/////////////////////////////////
class Father extends Grand{
	public void three() {
		System.out.println("father : three"); 
	}
	public Father() { super(); }
}
/////////////////////////////////
class Uncle extends Grand{
	public void four() {
		System.out.println("uncle : four"); 
	}
	@Override
	public void one() {
		super.one();
		System.out.println("uncle : one");
	}
	@Override
	public void two() {
		super.two();
		System.out.println("uncle : two");
	}
	public Uncle() { super(); }
}
/////////////////////////////////
class Aunt extends Object{
	String name = "MIMI";

	@Override
	public String toString() {
		return "옆집이모클래스";
	}
	public Aunt() { super(); }
}
/////////////////////////////////
public class Extends004 {
	public static void main(String[] args) {

		Father father = new Father();
		father.three(); father.two(); father.one();
		
		Uncle uncle = new Uncle();
		uncle.four(); uncle.two(); uncle.one();
		
		Aunt aunt = new Aunt();
		
		System.out.println(aunt.toString());
		System.out.println(aunt);
	}
}
// father : three
// grand : two
// grand : one
// uncle : four
// grand : two
// uncle : two
// grand : one
// uncle : one
// 옆집이모클래스
// 옆집이모클래스
package Day027;

class Parent{
	int i,j;
	public Parent() {
		super();	///1)Object의 호출
	}
	public Parent(int i, int j) {
		super();	///2)Object의 호출
		this.i=i;
		this.j=j; 
	}
}
////////////////////////////////////////////
class Child extends Parent{
	int k;
	
	public Child() {
		super();	///3)Parent의 호출
	} 
	public Child(int i, int j, int k) {
		super(i,j);	///4)Parent(i,j)의 호출
		this.k =k;
	}
}

public class Extends007 {
	public static void main(String[] args) {

		Child child = new Child(10,20,30);
		System.out.println(child.i);	//5
		System.out.println(child.j);	//5
		System.out.println(child.k);	//5
	}
}

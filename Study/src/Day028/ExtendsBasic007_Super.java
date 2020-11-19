package Day028;

class Parent {
	int i, j;
	public Parent(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
}

class Child extends Parent {
	int k;

	public Child(int k) {
		super();
		this.k = k;
	}

	public Child(int i, int j, int k) {// Parent의 호출
		super(i, j);
		this.k = k;
	}
}

public class ExtendsBasic007_Super {
	public static void main(String[] args) {

		Child child = new Child(10, 20, 30);
		System.out.println(child.i);
		System.out.println(child.j);
		System.out.println(child.k);

	}
}

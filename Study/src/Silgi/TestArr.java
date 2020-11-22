package Silgi;

class A {
	String name;

	public A() {
		super();
	}
	public A(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	} 
}
class Print extends A {
	
	void show(A[] arr) {
		for(int i=0;i<3; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class TestArr {
	public static void main(String[] args) {	
	A [] arr = new A[3];
	arr[0] = new A();
	arr[1] = new A();
	arr[2] = new A();
	Print print = new Print();
	print.show(arr);
	}
}

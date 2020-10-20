package Day017;

public class Method004 {

	public static void main(String[] args) {
		
		test1(50);
		test2(1.2);
		hap(3,5);
		disp(7,'*');
		disp(2,'♥');

	}//end main

//	Method
	//test1
	public static void test1(int num) {
		System.out.println("test1 : "+ num);
	}
	
	//test2
	public static void test2(double d1) {
		System.out.println("test2 : " + d1);
	}
	
	//hap
	public static void hap(int num1, int num2) {
		int hap=0;
		for(int i=num1; i<=num2; i++) {
			hap += i;
		}
			System.out.println("hap   : " + hap);
	}
	
	//disp
	public static void disp(int d2, char d3) {
		System.out.print("결과값 : ");
		for(int i=1; i<=d2; i++) {
			System.out.print(d3);
		}
		System.out.println();
	}
	
}//end class

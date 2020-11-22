package Day021;

class MyPrice001{
	//1.멤버변수
	String name;
	int price;
	//2.멤버함수
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("가겨 : " + price);
	}//end show()
}//end MyPrice001

public class Class002 {

	public static void main(String[] args) {

		MyPrice001 MyPrice = new MyPrice001();
		
		MyPrice.name = "노트";
		MyPrice.price = 100000;
		MyPrice.show();
		
	}//end main
}//end class

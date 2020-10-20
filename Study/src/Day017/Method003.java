package Day017;

public class Method003 {

	public static void main(String[] args) {
			
		myInt(1);		//myInt( 1 )
		myInt(9);		//재료받는자리( 1 )
		myInt(7);		//myInt( 자료형 변수 )
		
		line();
		System.out.println("예시2");
		myFloat(1.1f);
		myFloat(1.2f);
		myFloat(1.3f);
		myFloat(10);
		myFloat('a'); // 0~ 65535
		
		line();
		System.out.println("예시3");
		myDouble(1.1, 1.2);
	}//end main
	
//	Method
	public static void myInt(int num) {
		System.out.println("para1 : " +num);
	}
	
	public static void myFloat(float num) { // float(-21억~21억) > int
		System.out.println("para2 : " +num);
	}
	
	public static void myDouble(double d1, double d2) { // float(-21억~21억) > int
		System.out.println("para3 : " + d1 + " , "+d2);
	}
	
	public static void line() {
		System.out.println("=================");
	}
}//end class

/*
  함수구조 : 
  일단은 그냥 붙이기 public static [리턴값] [메서드명] (파라미터)
*/

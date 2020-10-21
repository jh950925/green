package Day019;

public class Method021 {

	public static void main(String[] args) {
//		★★★★ 오버로딩 
//		같은 목적으로 비슷한 동작을 수행하는 메소드들은 같은 이름으로 일관되게 작업
//		1. 같은 클래스내에서 [같은이름의 메소드]를 여러개 선언
//		2. JVM은 같은 이름의 메서드가 있으면 파라미터[타입]과 개수로만 비교하여 다른 메소드로 인식함..
//		
//		ㅁ 메소드 오류나는것 찾기! ()
//		1) pulbic static void star()				- 오류 안남 	()
//		2) pulbic static void star(int a)			- 오류 안남 	(int a)
//		3) pulbic static void star(int b)			- 오류 남		(int b) => int b라서 오류 남
//		4) pulbic static int star(int c)		    - 오류 남		(int c)	=> int c(타입이 int라서 오류 남)
//		5) pulbic static void star(int a, int b)	- 오류 안남   (int a, int b) => 개수가 달라서 오류 안남
//		
//		3.아무런 영향을 안주는것 ★
//		public static int [접근제한자][멤버변수][리턴값]
		
		System.out.println("[BASIC001] 메소드 중복중의 - 오버로딩1)매개변수의 자료형");
		//메소드 오버로딩이 가능한 이유 : 
		print(3);			//3출력				리턴값 : void / 파라미터 : int  
		print(1.2);			//1.2출력			리턴값 : void / 파라미터 : double	
		print('A');			//'A'출력			리턴값 : void / 파라미터 : char 
		print("HAPPY");		//"HAPPY" 출력		리턴값 : void / 파라미터 : String
		
		System.out.println();
		System.out.println("[BASIC002] 메소드 중복중의 - 오버로딩2)매개변수의 갯수");
		print(3,5);				//8출력			리턴값 : void / 파라미터 : int, int 
		print(1.2,3.4);			//4.6출력		리턴값 : void / 파라미터 : double, double
		print('3','5');			//104출력		리턴값 : void / 파라미터 : char, char
		print("3","5");			//35 출력		리턴값 : void / 파라미터 : String, String
	}
	//이것만 만들면 'A'도 빠지는데 넓은 범위는 좁은 범위 포함 : int 4byte(-21억 ~ 21억) / char : 0 ~ 65535
	public static void print(int num1) {
		System.out.println(num1);
	}
	public static void print(double d1) {
		System.out.println(d1);
	}
	public static void print(char ch1) {
		System.out.println(ch1);
	}
	public static void print(String st1) {
		System.out.println(st1);
	}
	public static void print(int num2, int num3) {
		System.out.println(num2+num3);
	}
	public static void print(double d2, double d3) {
		System.out.println(d2+d3);
	}
	public static void print(char ch2, char ch3) {
		System.out.println(ch2 + ch3);
	}
	public static void print(String st2, String st3) {
		System.out.println(st2+st3);
	}
}

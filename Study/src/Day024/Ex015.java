package Day024;

public class Ex015 {

	public static void main(String[] args) {
		System.out.println("Q15) 초기화 순서를 적으시오");
//		class Test{
//			static int cv = 1; => 클래스변수 	//1
//			int iv = 1; => 인스턴스 변수		//2
//			static{ cv=2; }					//3
//			{ iv=2; }						//4
//			Test(){	iv=3; }					//5
//		}
		System.out.println("클래스 변수 순서 : 1 = > 3");
		System.out.println("클래스 변수 다 돌고 난 이후");
		System.out.println("인스턴스 변수 순서 : 2 => 4 => 5");
	}

}

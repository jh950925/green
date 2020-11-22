package Day024;


class StaticInit {
	static int cv = 1;
	int iv = 1;
	static {
		cv = 2;
	} 
	//  
	{ 
		iv = 2;
	} 

	public StaticInit() {  
		this.iv = 3;
	}

}

public class Class022_static_init {
	public static void main(String[] args) {
		System.out.println("초기화 순서를 적으시오");
		System.out.println("1.클래스 변수 : cv | 생성되는 위치 : Method area");
		System.out.println("기본값 | 명시적초기화 = | 클래스초기화 블럭{}");
		//					cv=0    cv=1           cv=2
		System.out.println(StaticInit.cv);
		 
		System.out.println();
		
		System.out.println("2.인스턴스 변수 : iv | 생성되는 위치 : Heap area");
		System.out.println("기본값 | 명시적초기화 = | 인스턴스초기화 블럭{} | 생성자");
		//                  iv=0    iv=1           iv=2           iv=3
		StaticInit si = new StaticInit();
		System.out.println(si.iv);
	}
}

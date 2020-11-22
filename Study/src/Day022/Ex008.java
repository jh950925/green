package Day022;

class PlayingCard{
	int kind,num;		//(3) (4)
	static int width;	//(1)
	static int heghit;	//(2)
	
	//멤버함수
	public PlayingCard() { 
		super();
	}
	public PlayingCard(int k,int n){
			           //(5)   (6)
		super();
		this.kind = k;
		this.num = n;
	}
}

public class Ex008 {
	public static void main(String[] args) {
		System.out.println("클래스 변수(static) : 1,2 ");
		System.out.println("인스턴스변수 : 3,4");
		System.out.println("지역변수 : 5,6,");
		System.out.println("main에서의 지역변수 : args");
	}
}

 
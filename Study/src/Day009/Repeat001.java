package Day009;

public class Repeat001 {

	public static void main(String[] args) {
		System.out.println("REPEAT001");
		System.out.println("======================");
		//for
		for(int i=1;i<4;i++) {
			System.out.println(i);
		}
		System.out.println("======================");
		//while
		//1.초기값 2.조건식 3.증감문
		int i=10;	//초기값 - 실행이 안될수도 있다.
		while(i<4) {
			System.out.println(i);
			i++;
		}
		System.out.println("======================");
		//do while
		i =10;
		do {
			System.out.print(i);
			i++;
		}while(i<4);
	}

}

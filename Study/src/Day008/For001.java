package Day008;

public class For001 {

	public static void main(String[] args) {

		//출력 1 2 3
		System.out.println("VER-1");
		System.out.print(1);	// 시작
		System.out.print(2);	// 1개씩 증가
		System.out.print(3);	// 종료
		
		System.out.println("VER-2");
		System.out.println("1. 반복구문을 찾아서 : {System.out.print(3)}");
		System.out.println("2. 바뀌는 부분을 찾아서 변경 : {System.out.print(변수);}");
		System.out.println("3. 패턴찾기 : for(시작; 종료; 변화)\n");
		
		for(int i=1; i<=5; i++){
			System.out.print(i);
		}
		
		for(int i=1; i<=10; i++){
			System.out.print(i);	//1~10 반복
		}
		
		for(int i=3; i<9; i++){
			System.out.print(i);	//3~8 반복
		}
		
	}

}

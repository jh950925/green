package Day003;

public class Ex008 {

	public static void main(String[] args) {
		/*GIGO
		1.변수 
		int a = 0;
		int b = 0;
		
		2.입력
		a = 20;
		b = 3;
		
		3.처리 + 출력
		*/
		
		int a = 0;
		a = 10;
		int b = 0;
		b = 3;
				
		System.out.println(a +" + "+ b + " = " +(a+b));
		System.out.println(a +" - "+ b + " = " +(a-b));
		System.out.println(a +" * "+ b + " = " +(a*b));
		System.out.println(a +" / "+ b + " = " +(a/b)); //int는 정수형이기때문에 소수점이 필요할 경우 double로 선언한다.
		
	}

}

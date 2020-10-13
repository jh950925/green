package Day005;

public class Ex001 {

	public static void main(String[] args) {
		
//		1) 산술 연산자			+ - * / %
		int a = 10, b = 3;
		System.out.println(a+b);	//10
		System.out.println(a-b);	//7
		System.out.println(a*b);	//30
		System.out.println(a/b);	//3
		System.out.println(a%b);	//1
		
		
		
//		2) 비교(관계) 연산자		>, <, <=, >=, ==, true / false (제어문)
		System.out.println(a > b);	//초과 true
		System.out.println(a < b);	//미만
		System.out.println(a >= b);	//이상 true
		System.out.println(a <= b);	//이하
		System.out.println(a == b);	//같다
		System.out.println(a != b);	//다르다

//		q1) a가 짝수라면 true / 아니라며 false
//		1(홀수)	1%2 = 1	짝수면 나머지가 1
//		2(짝수)	2%2 = 0	홀수면 나머지가 0
//		3(홀수)	3%2 = 1
//		4(짝수)	4%2 = 0
		System.out.println(1 % 2 == 0);
		System.out.println(2 % 2 == 0);
		System.out.println("a가 짝수 : "+ (a % 2 == 0));
		System.out.println("b가 짝수 : "+ (b % 2 == 0));
		
//		q2) a가 3의 배수라면 true출력 / 아니면 false출력
		System.out.println("a 는 3의 배수인가? : " + (a % 3 == 0));
		
		
		
		
//		3) 논리연산자		 &&(그리고, 모든 조건이 맞아야 참), ||(조건중 하나라도 걸리면 참), true / false
//		q3) a가 2의 배수이면서 5의 배수라면 true 출력 / 아니라면 false 출력 [&&]
		System.out.println("a가 2의 배수이면서 5의 배수일때 : "+ ((a % 2 == 0) && (a % 5 == 0)));
//		q4) a가 2의 배수이거나 3의 배수라면 true출력 / 아니라면 false 출력 [||]
		System.out.println("a가 2의 배수이거나 3의 배수라면 : "+ ((a % 2 == 0) || (a % 3 == 0)));
//		q5) a가 3의 배수가 아니라면 true 출력 / 맞다면 false 출력
		System.out.println("a가 3의 배수가 아닌가? : " + (b%3 !=0));
		
		
		
//		4) 삼항연산자		조건? 참 : 거짓
//		q6) a가 양수라면 양수출력 / 아니면 음수출력
//		q6) a가 양수라면 (a>0) 양수출력 / 아니라면 음수출력
		String result = (a>0)? "양수" : "음수"; System.out.println(result);
//		q7) a가 양수라면 1 출력 / 아니면 0 출력
		int result2 = (a>0)? 1: 0; System.out.println(result2);
//		q8) a가 양수라면 1.1곱하기 출력 / 아니라면 0.9 곱하기 출력
		double result3 = (a>0)? a*1.1 : a*0.9;	System.out.println(result3);
		
//		5) 단항연산자 - 뒤에서 예제 정리(for)

	}

}

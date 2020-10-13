package Day010;

public class Ex001 {

	public static void main(String[] args) {
//		다음문장들을 조건식으로 출력하시오.
//		q1-1 int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식 
		System.out.println("if(x>10 && x<20);");
//		q1-2 char형 변수 ch가 공백이나 탭이 아닐때  true인 조건식 
		System.out.println("if(ch != '' || ch != '\t')");
//		q1-3 char형 변수 ch가 'x' 또는 'X'일때   true인 조건식    
		System.out.println("if(ch == 'x' && ch == 'X')");
//		q1-4 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식    
		System.out.println("if(ch >= '0' && ch <= '9')");
//		q1-5 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식
		System.out.println("if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))");
//		q1-6 윤년의 조건식
		System.out.println("if((year%400==0) || (year%4==0 && year%100!=0))");
//		q1-7 boolean형 변수 powerOn가 false일때   true인 조건식  
		System.out.println("if(!powerOn)");
//		q1-8 문자열 참조변수 str이 \"yes\" 일때  true인 조건식	
		System.out.println("if(str.equals(\"yes\"))");
		
		
		
		
	}

}

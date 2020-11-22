package Day017;

import java.util.Scanner;

public class Method012 {

	public static void main(String[] args) {
		//변수
		int num1=0, num2=0; 
		float result =0.0f;
		char op='\u0000';
		System.out.println("숫자 1 입력 : ");
		num1 = inputNum();
		System.out.println("연산자 입력");
		op = inputOper();
		System.out.println("숫자 2 입력 : ");
		num2 = inputNum();
		
		result = calc(num1,num2,op);
		show(num1, num2, op, result);
		
	}//end main
	
	public static int inputNum() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
	public static char inputOper() {
		Scanner scanner = new Scanner(System.in);
		char op = scanner.next().charAt(0);
		return op;
	}
	public static float calc(int a, int b, char c) {
		float result = 0.0f;
		if(c=='+') {
			result = a+b;
		}else if(c=='-') {
			result = a-b;
		}else if(c=='*') {
			result = a*b;
		}else if(c=='/') {
			result = a/(float)b;
		}
		return result;
	}
	public static void show(int num1, int num2, char op, float result) {
		if(op=='+'||op=='-'||op=='*') {
			System.out.println(""+num1+op+num2+"="+(int)(result));
		}else if(op=='/') {
			System.out.println(""+num1+op+num2+"="+(String.format("%.2f", result)));
		}
	}
	
}

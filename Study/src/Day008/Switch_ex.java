package Day008;

import java.util.Scanner;

public class Switch_ex {

	public static void main(String[] args) {

		int num1=0, num2=0;
		char ch = ' ';
		String result="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.println("정수를 하나 입력해주세요 : ");
		num2 = scanner.nextInt();
		System.out.println("연산자 한개 입력 (+,-,*,/)");
		ch = scanner.next().charAt(0);
		
		switch(ch){
		case '+' : 
			result =""+(num1+num2);break;
		case '-' : 
			result =""+(num1-num2);break;
		case '*' : 
			result =""+(num1*num2);break;
		case '/' : result =""+String.format("%.6f", num1/(double)num2); break;	
		}
		System.out.println(""+ num1+ch+num2+"="+result);
		
		scanner.close();
	}

}

package Day008;

import java.util.Scanner;

public class For015 {

	public static void main(String[] args) {

		double num = 0, num2=0;
		char ch = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
		System.out.print("정수를 하나 입력해주세요 : ");
		num = scanner.nextInt();
			if(num>=0 && num<=100) {
				break;
			}
		}
		for(;;) {
			System.out.print("정수를 하나 입력해주세요 : ");
			num2 = scanner.nextInt();
				if(num>=0 && num<=100) {
					break;
				}
			}
		for(;;) {
			System.out.print("\n연산자를 하나 입력해주세요 : ");
			ch = scanner.next().charAt(0);
				if(ch== '+' || ch== '-' ||ch== '*' ||ch== '/') {
					break;
				}
			}
		switch(ch){
		case '+' : 
			result =""+(num+num2);break;
		case '-' : 
			result =""+(num-num2);break;
		case '*' : 
			result =""+(num*num2);break;
		case '/' : result =""+String.format("%.2f", num/(double)num2); break;	
		}
		System.out.println(result);
		scanner.close();
	}

}

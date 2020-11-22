package Day009;

import java.util.Scanner;

public class Day009_3 {

	public static void main(String[] args) {
		int num1=0,num2=0;
		char ch = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("정수를 하나 입력해주세요 : ");
			num1 = scanner.nextInt();
				if(num1>=0 && num1<=100) {
					break;
				}
			}
			for(;;) {
				System.out.print("정수를 하나 입력해주세요 : ");
				num2 = scanner.nextInt();
					if(num2>=0 && num2<=100) {
						break;
					}
				}
			for(;;) {
				System.out.print("연산자를 하나 입력해주세요 : ");
				ch = scanner.next().charAt(0);
					if(ch== '+' || ch== '-' ||ch== '*' ||ch== '/') {
						break;
					}
				}
			
			switch(ch){
			case '+' : 
				result =""+(num1+num2);break;
			case '-' : 
				result =""+(num1-num2);break;
			case '*' : 
				result =""+(num1*num2);break;
			case '/' : result =""+String.format("%.2f", num1/(double)num2); break;	
			}
			
			System.out.println(result);
			scanner.close();
	}

}

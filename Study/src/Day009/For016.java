package Day009;

import java.util.Scanner;

public class For016 {

	public static void main(String[] args) {

		int num1 =0, num2=0; 
		String yn ="";
		String result = "";
		char ch = ' ';
		
		Scanner scanner = new Scanner(System.in);
		for(;;) {
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
			if(ch=='+') {
				result = ""+(num1+num2);
			}else if(ch == '-') {
				result = ""+(num1-num2);
			}else if(ch == '*') {
				result = ""+(num1*num2);
			}else if(ch == '/') {
				result = ""+String.format("%.2f", (num1/num2));
			}
			
			System.out.println(""+num1+ch+num2+"="+result);
			for(;;) {
				System.out.println("다시 시작하시겠습니까? (no ->종료, yes"
						+ "->다시)");
				yn = scanner.next();
				if(yn.equalsIgnoreCase("yes")) {
					break;
				}else if(yn.equalsIgnoreCase("no")){
					break;
				}else {
					continue;
				}
			}
			if(yn.equals("yes")){
				continue;
			}else{
				break;
			}
			}
			
			
	}

}

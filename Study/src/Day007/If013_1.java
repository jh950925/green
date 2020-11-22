package Day007;

import java.util.Scanner;

public class If013_1 {

	public static void main(String[] args) {
		int num = 0, num2 =0; char ch =' '; float result = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 정수를 하나 입력해주세요 : "); 
		num = scanner.nextInt();
		System.out.println("2. 정수를 하나 입력해주세요 : "); 
		num2 = scanner.nextInt();
		System.out.println("3. 연산자를 입력해주세요(+,-,*,/) : ");
		ch =scanner.next().charAt(0);
		
		if(ch=='+') {
			result = (num + num2);
		}else if(ch=='-'){
			result = (num-num2);
		}else if(ch=='*'){
			result = (num*num2);
		}else if(ch=='/'){
			result = (num/(float)num2);
		}
		
		System.out.println((ch == '/')?
				"" + num + ch + num2 + "=" + result :
				"" + num + ch + num2 + "=" + (int)result);
	}

}

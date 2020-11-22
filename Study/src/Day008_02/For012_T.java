package Day008_02;

import java.util.Scanner;

public class For012_T {

	public static void main(String[] args) {

		int num1=0,num2=0,sum=0,sum2=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수 사이의 합을 구하시오 \r\n");
		System.out.print("숫자 1 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자 2 입력 : ");
		num2 = scanner.nextInt();
		System.out.println("===================");
		
		//작은수에서 큰 수로 for문 이용해서 합
		for(int i=num1;i<=num2;i++) {
			System.out.print(i);
			sum += i;
			if(i<num2){				
				System.out.print("+");	
			}else {
				System.out.print("=");
			}
		}	
		System.out.println(sum);
		
		//큰수에서 작은수로 for문 이용해서 합
		for(int i=num2;i>=num1;i--) {
			System.out.print(i);
			sum2 += i;
			if(i>num1){				
				System.out.print("+");	
			}else {
				System.out.print("=");
			}
		}	
		System.out.println(sum2);
		scanner.close();
	}

}

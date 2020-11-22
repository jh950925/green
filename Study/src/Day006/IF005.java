package Day006;

import java.util.Scanner;

public class IF005 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개를 입력해주세요 : ");
		num = scanner.nextInt();
		
		if(num>0) {
			System.out.println("절대값 : " + num);
		}else if(num<0) {
			num = -num;
			System.out.println("절대값 : " + num);
		}else {
			System.out.println("");
		}

	}

}

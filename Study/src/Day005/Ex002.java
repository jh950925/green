package Day005;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		int num = 0 ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 한개 입력 > ");
		num = scanner.nextInt();
		
		System.out.println("입력한 값 : " + num);
		
		int num01 = (num>0)? num: - num;
		
		System.out.println("절대 값 : " + num01);
	}

}

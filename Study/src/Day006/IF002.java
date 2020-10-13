package Day006;

import java.util.Scanner;

public class IF002 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("평균을 입력하시오");		
		num = scanner.nextInt();
		if (num > 60){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		

	}

}

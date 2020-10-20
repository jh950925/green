package Day015;

import java.util.Scanner;

public class Day015_1 {

	public static void main(String[] args) {
		int num  = 0 ; String result = " ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1,2,3중에 입력받기 : ");
		num = scanner.nextInt();
		
		if(num==1) {
			result="1이다.";
		}else if(num==2) {
			result="2이다.";
		}else if(num==3) {
			result="3이다.";
		}else {
			result = "1,2,3만 입력 가능합니다.";
		}
		
		System.out.println(result);
		scanner.close();
	}

}

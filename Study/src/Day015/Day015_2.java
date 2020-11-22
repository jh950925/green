package Day015;

import java.util.Scanner;

public class Day015_2 {

	public static void main(String[] args) {

		int num  = 0 ; String result = " ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1,2,3중에 입력받기 : ");
		num = scanner.nextInt();
		switch(num) {
		case 1:
			result ="1이다."; break;
		case 2:
			result ="2이다."; break;
		case 3:
			result ="3이다."; break;
		default : 
			result ="1,2,3중에 입력해주세요"; break;
		}
		System.out.println(result);
		scanner.close();
	}

}

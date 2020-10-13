package Day007;

import java.util.Scanner;

public class Switch007 {

	public static void main(String[] args) {

		int avg = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("평균을 입력하시오 : " );
		avg = scanner.nextInt();
		
		switch(avg/10) {
		case 10: case  9  :result = "수"; break;
		case 8 : 		   result = "우"; break;
		case 7 : 		   result = "미"; break;
		case 6 : 		   result = "양"; break;
		default : 		   result = "가";
		}
		System.out.println("ㅁ 평균은   : "+avg + " -> " + result);
	}

}

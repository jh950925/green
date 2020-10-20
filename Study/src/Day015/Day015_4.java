package Day015;

import java.util.Scanner;

public class Day015_4 {

	public static void main(String[] args) {
		int i=0, num=0;
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			System.out.println("1을 입력하시오 : ");
			num = scanner.nextInt();
			if(num ==1) {
				break;
			}
			i++;
		}
		scanner.close();
	}

}

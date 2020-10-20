package Bank;

import java.util.Scanner;

public class Bank006 {

	public static void main(String[] args) {
		String [][] users = {
							{"","",""},
							{"","",""},
							{"","",""}
							};
		int num=0;
		
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("\n=====Bank=====");
			System.out.println("1.추가\n"
					+ "2.조회\n"
					+ "3.입금\n"
					+ "4.출금\n"
					+ "5.삭제\n"
					+ "9.종료");
			System.out.print("입력 >>");
			num = scanner.nextInt();
			
			
			
			scanner.close();
			}//무한루프
	}//end for(;;)
}



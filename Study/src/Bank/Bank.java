package Bank;


import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int num;
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("========BANK========");
		System.out.println("1.추가");
		System.out.println("2.조회");
		System.out.println("3.입금");
		System.out.println("4.출력");
		System.out.println("5.삭제");
		System.out.println("9.종료");
		System.out.println("입력>>>");
		
		num  = scanner.nextInt();
		
		String result = (num==1) ? "1.추가 기능입니다."  : 			// 1번
			    (result = (num==2)? "2.조회 기능입니다." : 			// 2번
				(result = (num==3)? "3.입금 기능입니다." :			// 3번
				(result = (num==4)? "4.출력 기능입니다." :			// 4번
				(result = (num==5)? "5.삭제 기능입니다." :			// 5번
				(result = (num==9)? "9.종료 기능입니다." : "기능에 있는 번호를 입력해주세요" //종료
				)			
				)			
				)			
				)			
				);
							
							
		System.out.println(result);
		
		
		

	}

}

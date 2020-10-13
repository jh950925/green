package Bank;

import java.util.Scanner;

public class Bank002 {

	public static void main(String[] args) {

		//변수
		int num = 0;
		int id = 0,pass = 0;
		double money = 10000;
		double money_plus = 0, money_minus;
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("================="); 
		System.out.println("Bank");
		System.out.println("================="); 
		System.out.println(" 1.추가\n 2.조회\n 3.입금\n 4.출금\n 5.삭제\n 9.종료\n 입력>>");
		num = scanner.nextInt();
		
		//처리문
		switch(num) {
		case 1 : 
			System.out.println("ㅁ 아이디 : ");
			id = scanner.nextInt();
			if(id==1){ 
				System.out.println("ㅁ 비밀번호 : ");
				pass = scanner.nextInt();
				if(id == 1 && pass ==1) {
					System.out.println("ㅁ 잔   액 " + money + "\n설정되어 있습니다.");
				}else {
					System.out.println("id, password를 다시 확인해주세요");
				}
			}else {
				System.out.println("id, password를 다시 확인해주세요");
			}break;
		
		case 2 :
			System.out.println("ㅁ 조회기능입니다.");
			System.out.println("본인확인ID : ");
			id = scanner.nextInt();
			if(id == 1){
				System.out.println("본인확인 pass : ");
				pass = scanner.nextInt();
				if(pass == 1) {
					System.out.println("==반갑습니다 고객님 \n ID : "+ id + "\n pass : " + pass + "\n balance : " + money);
				}else{
					System.out.println("다시 확인해 주세요");
				}
			}else{
				System.out.println("다시 확인해 주세요");
			}break;
		
		case 3 :
			System.out.println("\"ㅁ 입금기능입니다.\"");
			System.out.println("본인확인ID : ");
			id = scanner.nextInt();
			if(id==1) {
				System.out.println("본인확인pass : ");
				pass = scanner.nextInt();
				if(pass == 1) {
					System.out.println("입금할 금액을 입금해주세요 : ");
					money_plus = scanner.nextDouble();
					if(money_plus>0) {
						money += money_plus;
						System.out.println("== 잔액확인 \n ID : "+ id + "\n pass : " + pass + "\n balance : " + money);
					}else {
						System.out.println("금액이 모자랍니다\n종료합니다.");
					}
				}else {}
			}else{}break;
			
		case 4 :
			System.out.println("ㅁ 출금기능입니다.");
			System.out.println("본인확인ID : ");
			id = scanner.nextInt();
			if(id==1) {
				System.out.println("본인확인pass : ");
				pass = scanner.nextInt();
				if(pass == 1) {
					System.out.println("출금할 금액을 입금해주세요 : ");
					money_minus = scanner.nextDouble();
					if(money>=money_minus) {
						money -= money_minus;
						System.out.println("== 잔액확인 \n ID : "+ id + "\n pass : " + pass + "\n balance : " + money);
					}else {
						System.out.println("금액이 모자랍니다\n종료합니다.");
					}
				}
			}break;
		case 5 :
			System.out.println("ㅁ 삭제기능입니다.");
			System.out.println("== 잔액확인");
			id = 0; pass = 0; money = 0;
			System.out.println("id : " + id + "\npass : " + pass + "\nbalance : " + money);
			
		case 9 :
			result = "종료기능입니다.";break;
		}
		scanner.close();
	}
}


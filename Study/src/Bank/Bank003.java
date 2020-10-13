package Bank;

import java.util.Scanner;

public class Bank003 {

	public static void main(String[] args) {

		int num =0;
		String id="", pass="";
		double money = 10000.0;
		double money_plus = 0.0, money_minus=0.0; 
		
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
		
		if(num==1||num==2||num==3||num==4||num==5||num==9) {
		
		if(num==1) {
			System.out.println("ㅁ 추가 기능입니다.");
			System.out.print("아이디 : ");
			id = scanner.next();
			if(id.equals("aaa")){
				System.out.print("비밀번호 : ");
				pass = scanner.next();
				if(pass.equals("111")) {
					System.out.println("=========== 설정되었습니다.");
					System.out.println("잔액 : "+money);
					System.out.println("설정되어 있습니다.");
				}
			}
		}	
		if(num==2) {
			System.out.println("ㅁ 조회 기능입니다.");
			System.out.print("본인확인ID : ");
			id = scanner.next();
			if(id.equals("aaa")){
				System.out.print("본인확인pass : ");
				pass = scanner.next();
				if(pass.equals("111")) {
					System.out.println("==반갑습니다 고객님");
					System.out.println("ID : "+id
									   +"\nPass : "+ pass);
					System.out.println("balance : "+ money);
				}else {
					System.out.println("PassWord를 확인해 주세요");
				}
			}else {
				System.out.println("Id를 확인해주세요");
			}
		}	
		if(num==3) {
			System.out.println("ㅁ 입금 기능입니다.");
			System.out.print("본인확인ID : ");
			id = scanner.next();
			if(id.equals("aaa")) {
				System.out.print("본인확인pass : ");
				pass = scanner.next();
				if(pass.equals("111")) {
					System.out.print("입금할 금액을 입급해주세요 : ");
					money_plus = scanner.nextDouble();
					if(money_plus>=0) {
						money += money_plus;
						System.out.println("== 잔액확인");
						System.out.println("ID : " + id
										  +"\npass : " + pass
										  +"\nbalance : " + money);
					}else {
						System.out.println("입금할 금액을 확인해 주세요");
						System.out.println("종료합니다.");
					}
				}else {
					System.out.println("PassWord를 확인해 주세요");
				}
			}else {
				System.out.println("ID를 다시 확인해 주세요");
			}
		}	
		if(num==4) {
			System.out.println("ㅁ 출금 기능입니다.");
			System.out.print("본인확인 ID : ");
			id = scanner.next();
			if(id.equals("aaa")) {
				System.out.print("본인확인 Pass : ");
				pass = scanner.next();
				if(pass.equals("111")) {
					System.out.print("출금할 금액을 입금해주세요 : ");
					money_minus = scanner.nextDouble();
					if(money_minus<=money && money_minus >= 0) {
						money -= money_minus;
						System.out.println("== 잔액확인");
						System.out.println("ID : " + id
										  +"\npass : " + pass
										  +"\nmoney : " + money);
					}else if(money_minus<0){
						System.out.println("출금하실 금액을 확인해주세요");
						
					}else {
						System.out.println("통장에 있는 금액이 모자랍니다.");
						System.out.println("종료합니다.");
					}
				}else {
					System.out.println("PassWord를 확인해 주세요");
				}
			}else {
				System.out.println("Id를 확인해 주세요.");
			}
		}	
		if(num==5) {
			System.out.println("ㅁ 삭제 기능입니다.");
			System.out.println("== 잔액확인");
			id =""; pass=""; money = 0.0;
			System.out.println("ID : " + id
							  +"\npass : " + pass
							  +"\nbalance : " + money);
		}
		if(num==9) {
			System.out.println("ㅁ 종료기능입니다.");
			break;
		}
		}}
		scanner.close();
	}

}

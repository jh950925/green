package Bank;

import java.util.Scanner;

public class Bank004 {

	public static void main(String[] args) {

		// 추가를 제외한 스캐너 싹 다 findID or findPW로 바꿀 것 
		// equals 는 무조건 변수랑 비교할 것 (문자열 상수 X)
		
		int num =0,age=0;
		String id=" ", pass=" ";
		int money = 0;
		int money_plus = 0, money_minus=0; 
		String y = " ";
		String key="";
		
		String findID = "first";
		String findPW = "1111";
		
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
			System.out.print("*Id : ");
			id = scanner.next();
			if(findID.equals(id)){
				System.out.print("*Pass : ");
				pass = scanner.next();
				if(findPW.equals(pass)) {
					System.out.print("*Age : ");
					age = scanner.nextInt();
					if(age==age) {
						System.out.print("*Balance : ");
						money = scanner.nextInt();
					}
				}
			}
		}	
		if(num==2) {
			for(;;) {
			System.out.print("*ID : ");
			id = scanner.next();
			if(findID.equals(id)){
				System.out.print("*Pass : ");
				findPW = scanner.next();
				if(findPW.equals(pass)) {
					System.out.println("====조회 결과====");
					System.out.println();
					System.out.println("아이디 : "+id);
					System.out.println("나이 : "+age);
					System.out.println("잔액 : "+money);
					System.out.println("암호 : "+pass);
					System.out.println("조회가 성공했습니다.\n");
					System.out.println("아무키나 누르세요");
					key = scanner.next();
					if(key!="") {
						break;
					}
				}else {
					System.out.println("조회가 실패했습니다.");
					System.out.println("\n아무키나 누르세요");
					key = scanner.next();
					if(key!="") {
						break;
					}
				}
			}else {
				System.out.println("조회가 실패했습니다.");
				System.out.println("\n아무키나 누르세요");
				key = scanner.next();
				if(key!="") {
					break;
				}
			}
		}}
		if(num==3) {
			System.out.println("====입금 계좌정보 입력====");
			System.out.print("*ID : ");
			id = scanner.next();
			if(findID.equals(id)){
				System.out.print("*pass : ");
				pass = scanner.next();
				if(findPW.equals(pass)) {
					System.out.print("입금액 : ");
					money_plus = scanner.nextInt();
					if(money_plus>=0) {
						money += money_plus;
					}
				}else {
					System.out.println("계좌 정보가 없습니다.");
				}
			}else{
				System.out.println("계좌 정보가 없습니다.");
			}
		}	
		if(num==4) {
			System.out.println("====출금 계좌정보입력====");
			System.out.print("*ID : ");
			id = scanner.next();
			if(findID.equals(id)){
				System.out.print("*Pass : ");
				pass = scanner.next();
				if(findPW.equals(pass)) {
					System.out.print("출금액 : ");
					money_minus = scanner.nextInt();
					if(money_minus<=money && money_minus >= 0) {
						money -= money_minus;
				}
			}
		}	
		}
		if(num==5) {
			System.out.print("*ID : ");
			id = scanner.next();
			if(findID.equals(id)){
				System.out.print("*Pass : ");
				pass = scanner.next();
				if(findPW.equals(pass)) {
					System.out.print("삭제하시겠습니까? (Y/N) : ");
					y = scanner.next();
					switch(y) {
					case "y" : case "Y" :
						id=""; pass="";
						age=0; money=0;
					}
				}else {
					System.out.println("계좌 정보가 없습니다.");
				}
			}
			System.out.println(id+"\t"+pass);
		}
		if(num==9) {
			System.out.println("ㅁ 종료기능입니다.");
			break;
		}
		}}
	}
}

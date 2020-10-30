package Bank;

import java.util.Scanner;

public class Bank_Controller {

	private int cnt;
	private String id;
	private String pass;
	private String id_ck;
	private String pass_ck;
	private double balance;
	private int plus;
	private int minus;
	private char key;
	
	Bank_v2 v2 = new Bank_v2();
	
	public void menu() {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
			System.out.println("=====Bank=====");
			System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
			System.out.print("입력 >>");
			num = scanner.nextInt();
			v2.setNum(num);
			switch (v2.getNum()) {
			case 1:
			input(); continue;
			case 2:
			show(); break;
			case 3:
			deposit(); break;
			case 4:
			withdraw(); break;
			case 5:
			delete(); break;
			
			}
		}
	}

	// 추가
	public void input() {
		Scanner scanner = new Scanner(System.in);
		if (cnt == 0) {
			System.out.print("ID : ");
			id = scanner.next();
			v2.setId(id);
			System.out.print("PASS: ");
			pass = scanner.next();
			v2.setPass(pass);
			System.out.print("BALANCE : ");
			balance = scanner.nextDouble();
			v2.setBalance(balance);
			cnt +=1;
		}else {
			System.out.println("계정을 삭제해 주세요");
		}
	}
	// 조회
		public void show() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("====조회결과====");
			System.out.print("ID : ");
			id_ck = scanner.next();
			System.out.print("PASS: ");
			pass_ck = scanner.next();
			if(cnt != 0) {
				if (v2.getId().equals(id_ck) && v2.getPass().equals(pass_ck)) {
					System.out.println("아이디 : " + v2.getId() 
							+ "\n" + "암호 : " + v2.getPass() 
							+ "\n" + "잔액 : " + (int)v2.getBalance() 
							+ "\n" + "회사 : " + Bank_v2.getCompany()
							+ "\n" + "조회가 성공했습니다.");
				} else {
					System.out.println("계좌 정보가 없습니다.");
				}
			}else {
				System.out.println("계좌가 존재하지 않습니다.");
			}
			System.out.println("아무키나 누르세요.");
			scanner.next();
		}
		// 입금
		public void deposit() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("==== 입금 계좌정보 입력 ====");
			System.out.print("ID : ");
			id_ck = scanner.next();
			System.out.print("PASS: ");
			pass_ck = scanner.next();
			System.out.print("입금액 : ");
			plus = scanner.nextInt();
			if(cnt == 1) {
				if (v2.getId().equals(id_ck) && v2.getPass().equals(pass_ck)) {
					if (plus > 0) {
					balance += plus;
					v2.setBalance(balance);
					}
				} else {
					System.out.println("계좌 정보가 없습니다.");
				}
			}
		}

		// 출금
		public void withdraw() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("==== 출금 계좌정보 입력 ====");
			System.out.print("ID : ");
			this.id_ck = scanner.next();
			System.out.print("PASS: ");
			this.pass_ck = scanner.next();
			System.out.print("출금액 : ");
			this.minus = scanner.nextInt();
			if(cnt == 1) {
				if (v2.getId().equals(id_ck) && v2.getPass().equals(pass_ck)) {
					if (this.minus <= v2.getBalance()) {
						this.balance -= this.minus;
						v2.setBalance(balance);
					}
				} else {
					System.out.println("계좌 정보가 없습니다.");
				}
			}
		}

		// 삭제
		public void delete() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("ID : ");
			this.id_ck = scanner.next();
			System.out.print("PASS: ");
			this.pass_ck = scanner.next();
			System.out.print("삭제 하시겠습니까?(Y/N) : ");
			this.key = scanner.next().charAt(0);
			if (id.equals(id_ck) && this.pass.equals(pass_ck) && cnt ==1) {
				this.id = "";
				this.pass = "";
				this.balance = 0.0;
				cnt--;
			} else {
				System.out.println("계좌 정보가 없습니다.");
			}
		}
		public Bank_Controller() {
			super();
			cnt =0;
			id="";
			pass="";
			id_ck="";
			pass_ck="";
			balance=0.0;
			plus=0;
			minus=0;
			key=' ';
		}

}

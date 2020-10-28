package Bank;

import java.util.Scanner;

class Bank_v1 {
	// 멤버변수
	String id;
	String pass;
	String id_ck;
	String pass_ck;
	double balance;
	int plus;
	int minus;
	char key;
	static String Company = "(주)하랑";
	static int cnt;
	static {
		cnt = 0;
	}

	// 멤버함수
	// 메뉴
	public int menu() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====Bank=====");
		System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
		System.out.print("입력 >>");
		num = scanner.nextInt();
		return num;
	}

	// 추가
	public void input() {
		Scanner scanner = new Scanner(System.in);
		if (cnt == 0) {
			System.out.print("ID : ");
			this.id = scanner.next();
			System.out.print("PASS: ");
			this.pass = scanner.next();
			System.out.print("BALANCE : ");
			this.balance = scanner.nextDouble();
			cnt++;
		}else {
			System.out.println("계정을 삭제해 주세요");
		}
	}

	// 조회
	public void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====조회결과====");
		System.out.print("ID : ");
		this.id_ck = scanner.next();
		System.out.print("PASS: ");
		this.pass_ck = scanner.next();
		if(cnt != 0) {
			if (this.id.equals(this.id_ck) && this.pass.equals(this.pass_ck)) {
				System.out.println("아이디 : " + this.id 
						+ "\n" + "암호 : " + this.pass 
						+ "\n" + "잔액 : " + this.balance 
						+ "\n" + "회사 : " + Bank_v1.Company
						+ "\n" + "조회가 성공했습니다.");
			} else {
				System.out.println("계좌 정보가 없습니다.");
			}
		}
		System.out.println("아무키나 누르세요.");
		scanner.next();

	}

	// 입금
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== 입금 계좌정보 입력 ====");
		System.out.print("ID : ");
		this.id_ck = scanner.next();
		System.out.print("PASS: ");
		this.pass_ck = scanner.next();
		System.out.print("입금액 : ");
		this.plus = scanner.nextInt();
		if(cnt == 1) {
			if (this.id.equals(this.id_ck) && this.pass.equals(this.pass_ck)) {
				if (this.plus > 0) {
					this.balance += this.plus;
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
			if (this.id.equals(this.id_ck) && this.pass.equals(this.pass_ck)) {
				if (this.minus <= this.balance) {
					this.balance -= this.minus;
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
		if (this.id.equals(this.id_ck) && this.pass.equals(this.pass_ck) && cnt ==1) {
			this.id = "";
			this.pass = "";
			this.balance = 0.0;
			cnt--;
		} else {
			System.out.println("계좌 정보가 없습니다.");
		}

	}

	// 생성자
	Bank_v1() {
		this.id = "";
		this.pass = "";
		this.balance = 0.0;
		this.plus = 0;
		this.minus = 0;
		this.key = ' ';
		this.id_ck =" ";
		this.pass_ck =" ";
	}
}

public class Bank008 {
	public static void main(String[] args) {
		int num = 0;
		Bank_v1 user1 = new Bank_v1();
		do {
			switch (user1.menu()) {
			case 1:
				user1.input();
				break;
			case 2:
				user1.show();
				break;
			case 3:
				user1.deposit();
				break;
			case 4:
				user1.withdraw();
				break;
			case 5:
				user1.delete();
				break;
			}
		} while (num != 9);

	}
}

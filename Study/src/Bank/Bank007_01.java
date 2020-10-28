package Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Bank007_01 {

	public static void main(String[] args) {
		String[][] users = { { "", "", "" }, // 00 01 02
				{ "", "", "" }, // 10 11 12
				{ "", "", "" } // 20 21 22
		};
		int num=0;
		do {
			System.out.println(Arrays.deepToString(users));
			num = menu();
			switch (num) {
			case 1:
				input(users);
				break;
			case 2:
				show(users);
				break;
			case 3:
				deposit(users);
				break;
			case 4:
				withdraw(users);
				break;
			case 5:
				delete(users);
				break;
			}
		} while (num != 9);
	}

	//메뉴
	public static int menu() {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====Bank=====");
		System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
		System.out.print("입력 >>");
		num = scanner.nextInt();
		return num;
	}

	//cnt_ck
	public static int cnt_ck(String[][] users) {
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals("")) {
				return i;
			}
		}
		return -1;
	}
	
	//count_ck
	public static int count_ck(String[][] users){
		Scanner scanner = new Scanner(System.in);
		String id_ck = "";
		String pass_ck = "";
		
		
		System.out.println("*Id : ");
		id_ck = scanner.next();
		System.out.println("*Pass : ");
		pass_ck = scanner.next();
		
		for (int i = 0; i < users.length; i++) {
			if (id_ck.equals(users[i][0]) && pass_ck.equals(users[i][1])) {
				return i;
			}
		}
		return -1;
	}
	
	//유저 추가
	public static void input(String[][] users) {
		int cnt = -1;
		Scanner scanner = new Scanner(System.in);
		
		cnt = cnt_ck(users);
		
		if (cnt != -1) {
			System.out.print("ID : ");
			users[cnt][0] = scanner.next();
			System.out.print("PASS: ");
			users[cnt][1] = scanner.next();
			System.out.print("BALANCE : ");
			users[cnt][2] = scanner.next();
		} else {
			System.out.println("더 이상 신규가입이 불가능합니다.");
		}
	}

	//유저 조회
	public static void show(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int cnt =-1;
		
		cnt=count_ck(users);
		
		if (cnt != -1) {
			System.out.println("====조회결과====");
			System.out.println("아이디 : " + users[cnt][0] + "\n" + "암호 : " + users[cnt][1] + "\n" + "잔액 : "
					+ users[cnt][2] + "\n" + "조회가 성공했습니다.");
			System.out.println("아무키나 누르세요.");
			scanner.next();
		} else {
			System.out.println("조회가 실패했습니다." + "\n아무키나 누르세요");
			scanner.next();
		}
	}

	//입금
	public static void deposit(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int cnt =-1;
		int plus =0;
		
		System.out.println("입금 계좌정보 입력");
		cnt=count_ck(users);
		
		if (cnt !=-1) {
			System.out.println("입금액 : ");
			plus = scanner.nextInt();
			if(plus>=0) {
				users[cnt][2] = Integer.toString(Integer.parseInt(users[cnt][2]) + (plus));
			}
		} else {
			System.out.println("계좌정보가 없습니다.");
		}

	}
	
	//출금
	public static void withdraw(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int cnt =-1;
		int minus =0;
		
		System.out.println("출금 계좌정보 입력");
		cnt =count_ck(users);
		
		if (cnt != -1) {
			System.out.println("출금액 : ");
			minus = scanner.nextInt();
			if(minus<=Integer.parseInt(users[cnt][2]))  {
				users[cnt][2] = Integer.toString(Integer.parseInt(users[cnt][2]) - minus);
			}else {
				System.out.println("잔액을 확인하세요");
			}
		} else {
			System.out.println("계좌정보가 없습니다.");
		}

	}

	//유저 삭제
	static void delete(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int cnt =-1;
		char key = ' ';
		
		cnt =count_ck(users);
		
			if (cnt != -1) {
				System.out.println("삭제 하시겠습니까?(Y/N) : ");
				key = scanner.next().charAt(0);
				if (key == 'y' || key == 'Y') {
					for (int j = 0; j < users.length; j++) {
						users[cnt][0] = "";
						users[cnt][1] = "";
						users[cnt][2] = "";
					}
				} else if (key == 'n' || key == 'N') {
				}
			} else {
				System.out.println("계좌 정보가 없습니다.");
			}

	}

}
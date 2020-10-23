package Bank;

import java.util.Scanner;

public class Bank007 {
	private static int num = 0;
	private static int cnt = 0;
	private static String id_ck = " ";
	private static String pass_ck = " ";
	private static boolean chk = false;
	private static int count = 0;
	private static String back = "";
	private static int plus = 0;
	private static int minus = 0;
	private static char key = ' ';
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[][] users = { { "", "", "" }, // 00 01 02
				{ "", "", "" }, // 10 11 12
				{ "", "", "" } // 20 21 22
		};
		do {
			menu();
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

	public static void menu() {
		
		System.out.println("=====Bank=====");
		System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
		System.out.print("입력 >>");
		num = scanner.nextInt();
	}

	public static void input(String[][] users) {
		cnt = -1;
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals("")) {
				cnt = i;
				break;
			}
		}
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

	public static void show(String[][] users) {
		System.out.println("*Id : ");
		id_ck = scanner.next();
		System.out.println("*Pass : ");
		pass_ck = scanner.next();
		for (int i = 0; i < users.length; i++) {
			if (id_ck.equals(users[i][0]) && pass_ck.equals(users[i][1])) {
				chk = true;
				count = i;
			}
		}
		if (chk) {
			System.out.println("====조회결과====");
			System.out.println("아이디 : " + users[count][0] + "\n" + "암호 : " + users[count][1] + "\n" + "잔액 : "
					+ users[count][2] + "\n" + "조회가 성공했습니다.");
			System.out.println("아무키나 누르세요.");
			back = scanner.next();
			chk = false;
		} else {
			System.out.println("조회가 실패했습니다." + "\n아무키나 누르세요");
			back = scanner.next();
		}

	}

	public static void deposit(String[][] users) {
		System.out.println("입금 계좌정보 입력");
		System.out.println("*ID : ");
		id_ck = scanner.next();
		System.out.println("*Pass : ");
		pass_ck = scanner.next();
		for (int i = 0; i < users.length; i++) {
			if (id_ck.equals(users[i][0]) && pass_ck.equals(users[i][1])) {
				chk = true;
				count = i;
			}
		}
		if (chk) {
			System.out.println("입금액 : ");
			plus = scanner.nextInt();
			if(plus>=0) {
				users[count][2] = Integer.toString(Integer.parseInt(users[count][2]) + (plus));
			}
		} else {
			System.out.println("계좌정보가 없습니다.");
		}

	}

	public static void withdraw(String[][] users) {
		System.out.println("출금 계좌정보 입력");
		System.out.println("*ID : ");
		id_ck = scanner.next();
		System.out.println("*Pass : ");
		pass_ck = scanner.next();
		for (int i = 0; i < users.length; i++) {
			if (id_ck.equals(users[i][0]) && pass_ck.equals(users[i][1])) {
				chk = true;
				count = i;
			}
		}
		if (chk) {
			System.out.println("출금액 : ");
			minus = scanner.nextInt();
			if(minus<=Integer.parseInt(users[count][2]))  {
				users[count][2] = Integer.toString(Integer.parseInt(users[count][2]) - minus);
			}else {
				System.out.println("잔액을 확인하세요");
			}
		} else {
			System.out.println("계좌정보가 없습니다.");
		}

	}

	static void delete(String[][] users) {
			System.out.println("*ID : ");
			id_ck = scanner.next();
			System.out.println("*Pass : ");
			pass_ck = scanner.next();
			for (int j = 0; j < users.length; j++) {
				if (id_ck.equals(users[j][0]) && pass_ck.equals(users[j][1])) {
					chk = true;
					count = j;
				}
			}
			if (chk) {
				System.out.println("삭제 하시겠습니까?(Y/N) : ");
				key = scanner.next().charAt(0);
				if (key == 'y' || key == 'Y') {
					for (int j = 0; j < users.length; j++) {
						users[count][0] = "";
						users[count][1] = "";
						users[count][2] = "";
						chk = false;
					}
				} else if (key == 'n' || key == 'N') {
				}
			} else {
				System.out.println("계좌 정보가 없습니다.");
			}

	}

}
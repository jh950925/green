package Bank;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Bank7_02 {
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
			System.out.println(Arrays.deepToString(users));
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
		Calendar today = Calendar.getInstance();
		myCalendar(2020,10,25);
		System.out.println();
		System.out.println();
		System.out.println("=====Bank=====");
		System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
		System.out.print("입력 >>");
		num = scanner.nextInt();
	}

	//cnt : 추가하는 숫자 
	//i값이 users.length보다 작아야 하므로 3명까지만 추가 가능
	public static void input(String[][] users) {
		cnt = -1;
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals("")) {
				cnt = i;
				break;
			}
		}
		if (cnt != -1 && cnt <4) {
			//아이디 @ 확인
			//id_ck : 아이디 @ 형식 체크
			for(;;) {
				String id_02 = "";
				System.out.print("ID : ");
				id_02 = scanner.next();
				if(id_02.indexOf("@") != -1) {
					users[cnt][0] = id_02;
					break;
				}else {
					System.out.println("이메일 형식으로 입력하셔야 합니다");
					System.out.println("========================================");
					continue;
				}
			}
			System.out.print("PASS: ");
			users[cnt][1] = scanner.next();
			
			//비밀번호 검사
			//pass_02 : 비밀번호 재확인
			for(;;) {
				String pass_02 = "";
				System.out.print("PASS를 다시 입력해 주세요 : ");
				pass_02 = scanner.next();
				if(users[cnt][1].equals(pass_02)) {
					break;
				}else {
					System.out.println();
					System.out.println("설정하신 비밀번호와 동일한지 확인해 주세요");
					System.out.println("========================================");
				}
			}
			//잔액 양수확인
			//balance_02 : 잔액 확이
			for(;;) {
				String balance_02 = "";
				System.out.print("BALANCE : ");
				balance_02 = scanner.next();
				if(Integer.parseInt(balance_02) > 0) {
					users[cnt][2] = balance_02;
					break;
				}else {
					System.out.println();
					System.out.println("잔액은 0이상 입력해 주세요");
					System.out.println("========================================");
				}
			}
		} else {
			System.out.println("더 이상 신규가입이 불가능합니다.");
		}

	}//추가

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

	}//조회

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

	}//입금

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

	}//출금

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

	}//삭제
	
	//요일
		public static String week(int D) {
			String result = "";
			String [] day = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
			for(int i=0;i<day.length;i++) {
				if(D%7==i) {
					result = day[i];
				}
			}
			return result;
		}

		//Method
		
		// 윤년
		public static boolean leap(int num) {
			if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		//2019년2월 27일 총 날수와 요일구하기
		public static void myCalendar(int year, int month, int day) {
			int box = 0;
			int [] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
			for(int i=1; i<year;i++) {
				box +=leap(i)? 366: 365;
			}
			mon[2] = leap(year)? 29 : 28;
			for(int i=1; i<month;i++) {
				box +=mon[i];
			}
			box +=day;
			show(box, month, mon[month], day);
			
		}
		
		//달력 출력
		public static void show(int hap, int month, int end, int date) {
			String[] days = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
			System.out.println("["+month+"]월");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<days.length;i++) {
				System.out.print(days[i]+"\t");
			}
			System.out.println("\n-----------------------------------------------------");
			for(int i=0; i<(hap-date+1)%7;i++) {
				System.out.print("*\t");
			}
			for(int i=1; i<=end;i++) {
				if((hap-date+i)%7==0) {
					System.out.println();
				}
				System.out.print(i+"\t");
			}
			
		}
}//end class
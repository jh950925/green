package Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Bank005 {

	public static void main(String[] args) {
		int num = 0;
		int age[] = { 0, 0, 0 };
		int balance[] = { 0, 0, 0 };
		String[] id = new String[3];
		String[] pass = new String[3];
		int cnt = 0; 
		int size = id.length;
		char key = ' ';
		String id_ck = " ";
		String pass_ck = " ";
		String back = "";
		int [] plus = new int[3];
		int [] minus = new int[3];
		boolean chk = false;
		int count=0;

		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println("\n=====Bank=====");
			System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
			System.out.print("입력 >>");
			num = scanner.nextInt();
			System.out.println();
			if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9) {

				// 1.추가
				if (num == 1) {
					if (cnt == 3) {
						System.out.println("User가 3명이 넘어갑니다.");
						continue;
					} else {
						System.out.println("*Id : ");
						id[cnt] = scanner.next();
						System.out.println("*Pass : ");
						pass[cnt] = scanner.next();
						System.out.println("*Age : ");
						age[cnt] = scanner.nextInt();
						System.out.println("*Balance : ");
						balance[cnt] = scanner.nextInt();
						cnt++;
					}
				} // 조회

				// 2.조회
				if (num == 2) {
					System.out.println("*Id : ");
					id_ck = scanner.next();
					System.out.println("*Pass : ");
					pass_ck = scanner.next();
					for (int i = 0; i < id.length; i++) {
						if (id_ck.equals(id[i]) && pass_ck.equals(pass[i])) {
							chk = true;  count=i;
					}
						}
						if(chk) {
							chk=false;
							System.out.println("====조회결과====");
							System.out.println("아이디 : " + id[count] 
											+ "\n" + "나이 : " + age[count] 
											+ "\n" + "잔액 : " + balance[count]
											+ "\n" + "암호 : " + pass[count] 
											+ "\n" + "조회가 성공했습니다.");
							System.out.println("아무키나 누르세요.");
							back = scanner.next();
							continue;
						}else {
							System.out.println("조회가 실패했습니다." + "\n아무키나 누르세요");
							back = scanner.next();
							continue;
						}
				}

				// 3.입금
				if (num == 3) {
					System.out.println("입금 계좌정보 입력");
					System.out.println("*ID : ");
					id_ck = scanner.next();
					System.out.println("*Pass : ");
					pass_ck = scanner.next();
					for (int i = 0; i < size; i++) {
						if(id_ck.equals(id[i]) && pass_ck.equals(pass[i])) {
							chk = true; count = i;
						}
					}
						if (chk) {
							System.out.println("입금액 : ");
							minus[count] = scanner.nextInt();
							balance[count] += plus[count];
							continue;
						} else{
							System.out.println("계좌정보가 없습니다.");
							continue;
						}
				} // 입금

				// 4.출금
				if (num == 4) {
					System.out.println("출금 계좌정보 입력");
					System.out.println("*ID : ");
					id_ck = scanner.next();
					System.out.println("*Pass : ");
					pass_ck = scanner.next();
					for (int i = 0; i < size; i++) {
						if(id_ck.equals(id[i]) && pass_ck.equals(pass[i])) {
							chk = true; count = i;
						}
					}
						if (chk) {
							System.out.println("출금액 : ");
							minus[count] = scanner.nextInt();
							if(minus[count]>balance[count]) {
								System.out.println("통장 잔고보다 출금액이 더 큽니다.");
								continue;
							}else {
								balance[count] -= minus[count];
							}
							continue;
						} else{
							System.out.println("계좌정보가 없습니다.");
							continue;
						}
				} // 출금

				// 5.삭제
				if (num == 5) {
					for (int i = 0; i < cnt; i++) {
						System.out.println("*ID : ");
						id_ck = scanner.next();
						System.out.println("*Pass : ");
						pass_ck = scanner.next();
						for (i = 0; i < size; i++) {
							if(id_ck.equals(id[i]) && pass_ck.equals(pass[i])) {
								chk = true; count = i;
							}
						}
						if (chk) {
							System.out.println("삭제 하시겠습니까?(Y/N) : ");
							key = scanner.next().charAt(0);
							switch (key) {
							case 'y':	case 'Y':
								id[count] = " ";
								pass[count] = " ";
								age[count] = 0;
								balance[count] = 0;
								break;
							case 'n':	case 'N':
								break; 
							}
							chk=false;
						}else{
							System.out.println("계좌 정보가 없습니다.");
							continue;
						}
						cnt--;
					}
				} // 삭제

				if (num == 9) {
					System.out.println("종료합니다.");
					break;
				}
			}
		} // 무한루프
	}// end for(;;)
}

/*
 * System.out.println("*ID : "); id[i] = scanner.next();
 * System.out.println("*Pass : "); pass[i] = scanner.next();
 * System.out.println("*Age : "); age[i] = scanner.nextInt();
 * System.out.println("*Balance : "); balance[i] = scanner.nextInt();
 */
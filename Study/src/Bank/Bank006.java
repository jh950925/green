package Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Bank006 {

	public static void main(String[] args) {
		String[][] users = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
		int num = 0;
		int cnt = 0;
		String id = " ";
		String pass = " ";
		String balance = " ";
		String id_ck = " ";
		String pass_ck = " ";
		boolean chk = false;
		int count = 0;
		String back = "";
		String plus = "";
		String minus = "";
		char key = ' ';
		

		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println(Arrays.deepToString(users));
			System.out.println(cnt);
			System.out.println("\n=====Bank=====");
			System.out.println("1.추가\n" + "2.조회\n" + "3.입금\n" + "4.출금\n" + "5.삭제\n" + "9.종료");
			System.out.print("입력 >>");
			num = scanner.nextInt();
			if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9) {
				// 추가
				if (num == 1) {
					cnt = -1;
                    for (int i = 0; i < users.length; i++) {
                        if (users[i][0].equals("")) {
                            cnt = i;
                            break;
                        }
                    }
                    if (cnt != -1){
                            System.out.print("ID : ");
                            users[cnt][0] = scanner.next();
                            System.out.print("PASS: ");
                            users[cnt][1] = scanner.next();
                            System.out.print("BALANCE : ");
                            users[cnt][2] = scanner.next();
                    }else {
                        System.out.println("더 이상 신규가입이 불가능합니다.");
                    }
				}
				// 조회
				if (num == 2) {
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
						System.out.println("아이디 : " + users[count][0] + "\n" 
											+ "암호 : " + users[count][1] + "\n"
											+ "잔액 : " + users[count][2] + "\n" 
											+ "조회가 성공했습니다.");
						System.out.println("아무키나 누르세요.");
						back = scanner.next();
						chk = false;
						continue;
					} else {
						System.out.println("조회가 실패했습니다." + "\n아무키나 누르세요");
						back = scanner.next();
						continue;
					}
					
				}

				// 입금
				if (num == 3) {
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
							plus = scanner.next();
							users[count][2] = Integer.toString(Integer.parseInt(users[count][2])+Integer.parseInt(plus));
							continue;
						} else{
							System.out.println("계좌정보가 없습니다.");
							continue;
						}
				}

				// 출금
				if (num == 4) {

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
							plus = scanner.next();
							users[count][2] = Integer.toString(Integer.parseInt(users[count][2])-Integer.parseInt(plus));
							continue;
						} else{
							System.out.println("계좌정보가 없습니다.");
							continue;
						}
				
				}

				// 삭제
				if (num == 5) {
					for (int i = 0; i < cnt; i++) {
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
							if(key=='y' ||key=='Y') {
								for(int j=0;j<users.length;j++) {
									users[count][0] = "";
									users[count][1] = "";
									users[count][2] = "";
									chk=false;
								}
								break;
							}else if(key=='n' ||key=='N') {
								break;
							}
						}else{
							System.out.println("계좌 정보가 없습니다.");
							continue;
						}
					}
				}

				// 종료
				if (num == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				

			} // end if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9)

		} // 무한루프
	}// end for(;;)
}// end class
	

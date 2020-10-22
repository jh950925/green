package Bank;


import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num = 0;
        int cnt = 0;
        String[][] user = {{"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}}; // USER 3명 : id, pass, age, balance

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println(Arrays.deepToString(user));
            for (; ; ) {
                System.out.println("======BANK=====");
                System.out.println("1. 추가\n2. 조회\n3. 입금\n4. 출금\n5. 삭제\n9. 종료");
                System.out.print("입력 >> ");
                num = scanner.nextInt();
                if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9) {
                    break;
                }
            }
            switch (num) {
                // 추가
                case 1:
                    //추가가능한지 확인
                    int index = -1;
                    for (int i = 0; i < user.length; i++) {
                        if (user[i][0].equals("")) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1){
                            System.out.println("■ 추가기능입니다.");
                            System.out.print("ID : ");
                            user[index][0] = scanner.next();
                            System.out.print("PASS: ");
                            user[index][1] = scanner.next();
                            System.out.print("AGE : ");
                            user[index][2] = String.valueOf(scanner.nextInt());
                            System.out.print("BALANCE : ");
                            user[index][3] = String.valueOf(scanner.nextInt());
                            System.out.println("등록된 정보 : " + user[index][0] + ", " + user[index][1] + ", " + user[index][2] + ", " + user[index][3]);
                    }else {
                        System.out.println("더 이상 신규가입이 불가능합니다.");
                    }
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    String tmp_id = "", tmp_pass = "";
                    int tmp_balacne = 0;
                    index = -1; //아이디, 비밀번호 입력받을 변수, 배열번호가 0부터 시작하므로 음수로 초기화

                    //정보입력받기
                    System.out.print("ID : ");
                    tmp_id = scanner.next();
                    System.out.print("PASS: ");
                    tmp_pass = scanner.next();

                    //유저확인
                    for (int i = 0; i < user.length; i++) {
                        if (tmp_id.equals(user[i][0]) && tmp_pass.equals(user[i][1])) {
                            index = i;
                            break;
                        }
                    }

                    //조회
                    if (num == 2) {
                        if (index != -1) {
                            System.out.println("=====[ 조회결과 ]=====");
                            System.out.println("ID : " + user[index][0] + " PASS : " + user[index][1] + " BALANCE : " + user[index][3]);
                        } else {
                            System.out.println("아이디와 비밀번호를 확인해주세요");
                        }
                    }

                    //입금
                    else if (num == 3) {
                        if (index != -1) {
                            System.out.print("입금할 금액 > ");
                            tmp_balacne = scanner.nextInt();
                            if (tmp_balacne >= 0) {
                                user[index][3] += Integer.parseInt(user[index][3]) + tmp_balacne;
                            } else {
                                System.out.println("입금할 금액을 확인해주세요.");
                            }
                        }
                        System.out.println("아이디와 비밀번호를 확인해주세요");
                    }

                    //출금
                    else if (num == 4) {
                        System.out.print("출금할 금액 > ");
                        tmp_balacne = scanner.nextInt();
                        if (tmp_balacne <= Integer.parseInt(user[index][3])) {
                            user[index][3] += Integer.parseInt(user[index][3]) + tmp_balacne;
                        } else {
                            System.out.println("입금할 금액을 확인해주세요.");
                        }
                    }

                    //삭제
                    else if (num ==5){
                        if (index!= -1){
                            user[index][0] = ""; user[index][1] = ""; user[index][2] = ""; user[index][3] ="";
                        }else {
                            System.out.println("아이디와 비밀번호를 확인해주세요");
                        }
                    }
                    break;
                // 종료2
                case 9:
                    break;
            }
        }// main for문
    }
}

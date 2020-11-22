package Day008;

import java.util.Scanner;

public class For013_basic {

	public static void main(String[] args) {

//		1. 예상되는 결과는?	1	2	3	4
		for(int i=1; i<11; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+"\t");//if 조건에 i가 5일때 break라는 내용이 있어서 그 전인 4까지만 출력
		}
		System.out.println();
//		2. 예상되는 결과는?
//		1	2	3	4	(5)	6	7	8	9	10
//		continue(skip)
		for(int j=1; j<11; j++) {
			if(j==5) {
				continue;
			}
			System.out.print(j+"\t"); //j가 5를빼고 나머지는 상관없이 계속 끝까지 가라라는 의미
		}
//		3. 1을 입력할때까지 무한반복
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int num=0;
		for(;;) { //초기갑; 조건문; 증감문 - 제약조건이 아무것도 없음. (1.무한반복)
			System.out.print("1을 입력해 주세요");
			num = scanner.nextInt();
			if(num ==1) {
				break;	// 2.빠져나올 조건
			}
		}
		System.out.println("입력받은 숫자는 " + num + "입니다.");
		scanner.close();
	}

}

/*
break vs continue
*/
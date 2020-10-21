package Day019;

import java.util.Scanner;

public class Method027 {

	public static void main(String[] args) {
		String userinput = "";
		String[] input = { "", "" };
		// 입력
		userinput = user_input();
		// 출력
		user_show(userinput, input);

	}// end main

	// 입력
	public static String user_input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		return scanner.next();
	}

	// 출력
	public static void user_show(String B, String[] A) {

		int i = 0;
		for (i = 0; i < B.length(); i++) {
			if (B.charAt(i) == ',') {
				break;
			}
			A[0] += B.charAt(i);
		}
		for (i = (i + 1); i < B.length(); i++) {
			if (B.charAt(i) == ',') {
				break;
			}
			A[1] += B.charAt(i);
		}

		System.out.println(A[0] + "\n" + A[1]);

		// A.[0]에다가 첫번재 문자 누적 / 만약 첫번째 문자가, 라면 빠져나오기(빠져나온 번호 필요)
		// A.[0]에다가 두번재 문자 누적 / 만약 두번째 문자가, 라면 빠져나오기(빠져나온 번호 필요)

//		int tmp = 0;
//		for(int i=1; i<B.length();i++) {
//			if(B.charAt(i)==',') {
//				tmp = i;
//				break;
//			}
//		}
//		System.out.print("첫번째 문자열 : ");
//		for(int i=0; i<tmp;i++) {
//			System.out.print(B.charAt(i));
//		}
//		System.out.print("\n두번째 문자열 : ");
//		for(int i=tmp+1; i<B.length();i++) {
//			System.out.print(B.charAt(i));
//		}
	}
}// end class

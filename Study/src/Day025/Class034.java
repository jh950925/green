package Day025;

import java.util.Scanner;

import Day025_02.Score_ver1;

public class Class034 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Score_ver1 iron = new Score_ver1();
		iron.setName("아이언맨");
		iron.setKor(100);
		iron.setEng(100);
		iron.setMath(100);
		Score_ver1 hulk = new Score_ver1();
		hulk.setName("헐크");
		hulk.setKor(20);
		hulk.setEng(50);
		hulk.setMath(30);
		
		System.out.println("===========================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("===========================================================================");
		iron.show();
		hulk.show();
	
		scanner.close();
	}
}

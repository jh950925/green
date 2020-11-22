package Day003;

import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
		
		int kor, eng, mat, sci, sum = 0;
		String name, hak;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요 : ");
		name = scanner.next();
		System.out.println("학번을 입력해 주세요 : ");
		hak = scanner.next();
		System.out.println("국어 점수를 입력해 주세요 : ");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력해 주세요 : ");
		mat = scanner.nextInt();
		System.out.println("과학 점수를 입력해 주세요 : ");
		sci = scanner.nextInt();
		
		sum = kor + eng + mat + sci;
		
		double avg = sum / 4.0;
		
		System.out.println("==============================================================");
		System.out.println("\t\tGreen It Score");
		System.out.println("==============================================================");
		System.out.println("이름\t학번\t국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println(name +"\t"+hak +"\t"+ kor +"\t" + eng +"\t"+ mat +"\t"+ sci +"\t"+ sum +"\t"+ String.format("%.2f", avg));
		System.out.println("==============================================================");
	}

}

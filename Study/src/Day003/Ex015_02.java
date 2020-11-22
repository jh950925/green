package Day003;

import java.util.Scanner;

public class Ex015_02 {

	public static void main(String[] args) {
		
		int kor, eng, mat, sum;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = scanner.nextInt();
		System.out.println("수학점수 입력 : ");
		mat = scanner.nextInt();
		
		sum = kor + eng + mat;
		
		double avg = sum / 3.0;
		
	
			
		System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
		System.out.println("-------------------------------------");
		System.out.println(kor+"\t" + eng+"\t" + mat+"\t" + sum + "\t" + String.format("%.2f", avg));
		
				

	}

}

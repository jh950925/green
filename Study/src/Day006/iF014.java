package Day006;

import java.util.Scanner;

public class iF014 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		float avg;
		String name = " ";
		
		System.out.println("이름 입력 : ");
		name = scanner.next();
		
		System.out.println("국어 입력 : ");
		kor = scanner.nextInt();
		
		System.out.println("영어 입력 : ");
		eng = scanner.nextInt();
		
		System.out.println("수학 입력 : ");
		mat = scanner.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0f;
		
		System.out.println("=============================================================================");
		System.out.println(":\t\t\tGREEN IR SCORE\t\t\t\t\t    :");
		System.out.println("=============================================================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 합격여부\t 레벨\t 장학생\t");
		System.out.println("=============================================================================");
		
		System.out.print(name+"\t"
				+kor+"\t"
				+eng+"\t"
				+mat+"\t"
				+tot+"\t"
				+String.format("%.2f", avg)+"\t");
		
		//평균에 따른 합격, 불합격 구별
		if(avg<70) {
			System.out.print(" 불합격");
		}else if(kor<40 || eng<40 || mat<40){
				System.out.print(" 재시험");
		}else{ 
			System.out.print(" 합격");
		}
		System.out.print("\t");
		
		//국어점수 마다 레벨 표시
		if(kor>=90) {
			System.out.print(" 수");
		}else if(kor>=80){
			System.out.print(" 우");
		}else if(kor>=70){
			System.out.print(" 미");
		}else if(kor>=60){
			System.out.print(" 양");
		}else { 
			System.out.print(" 가");
		}
		System.out.print("\t");
		//장학생 구별 평균이 95이상
		if(avg>=95) {
			System.out.print(" 장학생 입니다.");
		}else {	
			System.out.println(" 장학생이 아닙니다.");
		}
	
	}

}

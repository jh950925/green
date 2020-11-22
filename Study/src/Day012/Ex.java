package Day012;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

		int kor=0,eng=0,math=0,sum=0;
		double avg = 0.0;
		String id = " ";
		String result = " ";
		String jang = " ";
		String level= " ";
		String result_kor="",result_eng="",result_math="";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("ID 입력 : ");
		id = scanner.next();
		
		for(;;) {
		System.out.println("국어점수 입력 (0~100사이) : ");
		kor = scanner.nextInt();
			if(kor>=0 && kor <=100) {
			break;
			}
		}
		for(;;) {
		System.out.println("영어점수 입력 (0~100사이) : ");
		eng = scanner.nextInt();
		if(kor>=0 && kor <=100) {
			break;
			}
		}
		for(;;) {
		System.out.println("수학점수 입력 (0~100사이) : ");
		math = scanner.nextInt();
		if(kor>=0 && kor <=100) {
			break;
			}
		}
		//계산
		sum = kor + eng + math;
		avg = sum/3.0; 
		
		//조건문
		//합격여부
		if(avg>=60) {
			result = "합격";
			if(kor<40 || eng<40 || math<40) {
				result = "합격유보";
			}
		}else {
			result = "불합격";
		}
		
		//장학생
		if(avg>=95) {
			jang = "장학생";
		}
		
		//랭킹 처리
		for(int i=1; i<=((int)avg/10);i++) {
			level+="*";
		}
		
		//재시험
		if(kor<40) {
			result_kor = "O";
		}else {
			result_kor = "X";
		}
		if(eng<40) {
			result_eng = "O";
		}else {
			result_eng = "X";
		}
		if(math<40) {
			result_math = "O";
		}else {
			result_math = "X";
		}
		
		//출력
		System.out.println("====================================================================");
		System.out.println("ID\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("====================================================================");
		System.out.println(""+id+"\t"+kor+"\t"+eng+"\t"+math+"\t"+String.format("%.2f", avg)+"\t"+result+"\t"+jang+"\t"+level);
		System.out.println("====================================================================");
		System.out.print("재시험\t"+result_kor+"\t"+result_eng+"\t"+result_math);
		
		scanner.close();
	}
}

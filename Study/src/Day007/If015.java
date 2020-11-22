package Day007;

import java.util.Scanner;

public class If015 {

	public static void main(String[] args) {
		//변수
		String hak ="";
		int kor=0, eng=0, math=0,total=0; float avg=0;
		String jang = "-", pass ="", level="";
		String level_kor="",level_eng="",level_math="", re="재시험\n";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("학번입력 : ");
		hak =scanner.next();
		System.out.println("국아입력 : ");
		kor =scanner.nextInt();
		System.out.println("영어입력 : ");
		eng =scanner.nextInt();
		System.out.println("수학입력 : ");
		math =scanner.nextInt();
		
		//처리
		total = kor+eng+math;
		avg = total/3.0f;
		//장학생
		if(avg >=95) {
			jang = "장학생";
		}
		//레벨
		if(kor>=90) {
			level_kor=kor+"(수)";
		}else if(kor >=80) {
			level_kor=kor+"(우)";
		}else if(kor >=80) {
			level_kor=kor+"(미)";
		}else if(kor >=80) {
			level_kor=kor+"(양)";
		}else {
			level_kor=kor+"(가)";
		}
		//대처방안1: for / 대처방안2 : method / 대처방안3 : 삼항연산자
		
		level_eng = (eng >=90)? eng+"(수)":
								(eng >=80)?eng+"(우)":
									(eng >=70)?eng+"(미)":
										(eng >=60)?eng+"(양)": eng+"(가)";
		
		level_math = (math >=90)? math+"(수)":
								(math >=80)?math+"(우)":
									(math >=70)?math+"(미)":
										(math >=60)?math+"(양)": math+"(가)";
		
		//합격
		if(avg >=70) {
			pass="합격";
		}else {
			pass = "불합격";
		}
		//레벨
		level = "Lv"+((int)avg/10);
		//재시험
		// + 의 두가지의미 : 1)숫자+숫자 더하기 2) 문자열 + 문자열 출력
		if(kor<40) {
			re +="O\t";
		}else {
			re +="-\t";
		}
		re += (eng < 40)? "O\t" : "-\t";
		re += (math < 40)? "O\t" : "-\t";
		
		//출력
		
		System.out.println("=======================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("=======================================================================");
		System.out.println(hak + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("$.2f", avg) + "\t"
							+ pass + "\t" + jang + "\t" + level_kor);
		
		if(kor <40 || eng<40 || math<40) {
			System.out.println("==========================================================================");
			System.out.println(re);
		}
		
	}

}

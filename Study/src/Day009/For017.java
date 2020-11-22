package Day009;

import java.util.Scanner;

public class For017 {

	public static void main(String[] args) {
		//변수
		String name ="";
		int kor=0, eng=0, math=0,tot=0; float avg=0.0f;
		int level=0;
		String level2="", level3="";
		String jang = "-", pass ="";
		String yn ="";
		String level_kor="",level_eng="",level_math="", re="";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for(;;) {
		System.out.println("학번입력 : ");
		name =scanner.next();
		for(;;) {
		System.out.println("국아입력 : ");
		kor =scanner.nextInt();
			if(kor>=0 && kor<=100) {
				break;
			}
		}
		for(;;) {
		System.out.println("영어입력 : ");
		eng =scanner.nextInt();
		if(eng>=0 && eng<=100) {
			break;
		}
		}
		for(;;) {
		System.out.println("수학입력 : ");
		math =scanner.nextInt();
		if(math>=0 && math<=100) {
			break;
		}
		}
		
		//처리
		tot = kor+eng+math;
		//국어 표현
		if(kor >=90) {
			level_kor="수";
		}else if(kor >=80) {
			level_kor="우";
		}else if(kor >=70) {
			level_kor="미";
		}else if(kor >=60) {
			level_kor="영";
		}else{
			level_kor="가";
		}
		
		//영어 표현
		if(eng >=90) {
			level_eng="수";
		}else if(eng >=80) {
			level_eng="우";
		}else if(eng >=70) {
			level_eng="미";
		}else if(eng >=60) {
			level_eng="영";
		}else{
			level_eng="가";
		}
		//수학 표현
		if(math >=90) {
			level_math="수";
		}else if(math >=80) {
			level_math="우";
		}else if(math >=70) {
			level_math="미";
		}else if(math >=60) {
			level_math="영";
		}else{
			level_math="가";
		}		
		avg = tot/3.0f;
		//장학생
		if(avg >=95) {
			jang = "장학생";
		}else {
			jang="장학생이 아닙니다.";
		}
		
		//합격
		if(avg >=70) {
			pass = "합격";
			if(kor<40) {
				pass=("(국어)재시험");
			}else if(eng<40) {
				pass=("(영어)재시험");
			}else if(math<40) {
				pass=("(수학)재시험");
			}
		}else {
			pass = "불합격";
		}
			
		//레벨
		level = ((int)avg/10);

		for(level=0;level<=((int)avg/10);level++) {
			level2+="*";
			
		}
	
		//출력
		System.out.println("=======================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("=======================================================================");
		System.out.println(name + "\t" + 
							kor +  "("+ level_kor + ")" + "\t" + 
							eng + "(" + level_eng + ")" + "\t" + 
							math + "(" + level_math + ")" + "\t" + 
							tot + "\t" + 
							(String.format("%.2f", avg)) + "\t" + 
							pass + "\t" + 
							jang + "\t" + 
							level2
							);
		
		System.out.println("");
		//재입력
		for(;;) {
			System.out.println("다시 시작하시겠습니까? (no ->종료, yes"
					+ "->다시)");
			yn = scanner.next();
			if(yn.equalsIgnoreCase("yes")) {
				break;
			}else if(yn.equalsIgnoreCase("no")){
				break;
			}else {
				continue;
			}
		}
		if(yn.equals("yes")){
			continue;
		}else{
			break;
		}
		}			
	}

}

package Day007;

import java.util.Scanner;

public class If014 {

	public static void main(String[] args) {
		//변수
		String hak ="";
		int kor=0, eng=0, math=0,total=0; float avg=0;
		String jang = "-", pass ="", level_kor="";
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
		
		if(avg >=95) {
			jang = "장학생";
		}
		
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
		
		if(avg >=70) {
			pass="합격";
			if(kor < 40 || eng < 40 || math < 40) {
				pass="재시험";
			}else {
				pass="불합격";
			}
		}
		
		//출력
		
		System.out.println("===================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("===================================================================");
		System.out.println(hak + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("$.2f", avg) + "\t"
						+ pass + "\t" + jang + "\t" + level_kor);
		
		
	}
	
}

package Day018;

import java.util.Scanner;

public class Method020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int kor, eng, math, total;
		float avg = 0.0f;
		String pass = "", jang = "", star = "";
		String level_kor = "", level_eng = "", level_math = "";
		String re = "";
 
//		(2) 입력 : 이름,국어,영어,수학점수를 입력받으시오.
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next(); 
		System.out.println("국어 점수를 입력하세요");  
		kor = scanner.nextInt(); 
		System.out.println("영어 점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scanner.nextInt();

//		(3) 처리 :
		total = process_total(kor, eng, math);
		avg = process_avg(total);
//		합격 평균이 60이상이고, 각각 국어, 영어, 수학 40이상 / 불합격 / 재시험 - 각각 40미만인게 있다면
		pass = process_pass(avg, kor, eng, math, pass);
//		평균이 95점 이상이면 장학생
		jang = process_scholar(avg);
//		평균점수대로 발표 붙이기, 예)70이상이면 별 7개, 80점대이면 별 8개, 90점대이면 별9개, 100이면 별 10개
		star = process_star(avg);

		level_kor = process_level(kor); // 90점대 이상이면 수, 80점대 이상이면 우, 70점대이상이면 미, 60점대이면 양, 나머지 가
		level_eng = process_level(eng);
		level_math = process_level(math);
		re = process_re(kor, eng, math); // 재시험 볼 과목이 있는지 확인해주는 메서드
 
//		(4) 출력 :
		line1();
		process_show(name, kor, eng, math, total, avg, pass, jang, star);
		line2();
		process_show2(level_kor, level_eng, level_math);
		line2();
		process_show3(re);
		line2();
	}

	public static int process_total(int kor, int eng, int math) {
		int total = 0;
		total = kor + eng + math;
		return total;
	}

	public static float process_avg(int total) {
		float avg = 0.0f;
		avg = total / 3.0f;
		return avg;
	}

	public static String process_pass(float avg, int kor, int eng, int math, String pass) {
		String result = "";
		if (avg >= 60) {
			result = "합격";
			if (kor < 40 || eng < 40 || math < 40) {
				result = "재시험";
			}
		} else {
			result = "불합격";
		}
		return result;
	}

	public static String process_scholar(float avg) {
		String scholar = "";
		if (avg >= 95) {
			scholar = "장학생";
		}else {
			scholar="X";
		}
		return scholar;
	}

	public static String process_star(float avg) {
		String star = "";
		for (int i = 1; i <= (avg / 10); i++) {
			star += "*";
		}
		return star;
	}

	public static String process_level(int num) {
		String result = "";
		if (num >= 90) {
			result = "수";
		} else if (num >= 80) {
			result = "우";
		} else if (num >= 80) {
			result = "미";
		} else if (num >= 80) {
			result = "양";
		} else {
			result = "가";
		}
		return result;
	}

	public static String process_re(int a, int b, int c) {
		String result = "";
		if (a < 40 ) {
			result += "O\t";
		} else {
			result += "-\t";
		}
		if (b < 40 ) {
			result += "O\t";
		} else {
			result += "-\t";
		}
		if (c < 40 ) {
			result += "O\t";
		} else {
			result += "-\t";
		}
		return result;
	}

	public static void line1() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public static void line2() {
		System.out.println("===========================================================================");
	}

	public static void process_show(String name, int kor, int eng, int math, int total, float avg, String pass,
			String jang, String star) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("===========================================================================");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + String.format("%.2f", avg) + "\t" + pass + "\t"
				+ jang + "\t" + star);
	}

	public static void process_show2(String level_kor, String level_eng, String level_math) {
		System.out.println("\t" + level_kor + "\t" + level_eng + "\t" + level_math + "\t");
	}

	public static void process_show3(String re) {
		System.out.println("재시험\t" + re);
	}
}

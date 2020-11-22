package Silgi;

public class Silgi_2020_10_26 {
	public static void main(String[] args) {

		String name[] = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		int size = name.length;
		int[] kor = { 100, 20, 90, 70, 35 };
		int[] eng = { 100, 50, 95, 80, 100 };
		int[] mat = { 100, 30, 90, 60, 100 };
		float avg[] = new float[5];
		int rank[] = { 1, 1, 1, 1, 1 };
		String pass[] = new String[5];
		String jang[] = { "", "", "", "", "" };
		String star[] = { "", "", "", "", "" };

		// 1) process_aver - 구하기
		for (int a = 0; a < size; a++) {
			avg[a] = process_avg(kor[a], eng[a], mat[a]);
		}

		// 2) porcess_rank - 등수구하기
		process_rank(size, avg, rank);

		// 3) porcess_scholar - 장학생 95점 이상
		porcess_scholar(avg, jang);

		// 4) porcess_pass - 합격
		process_pass(avg, kor, eng, mat, pass);

		// 5) porcess_star - 별
		process_star(avg, star);

		// 6) process_show - 출력
		process_show(name, kor, eng, mat, avg, rank, pass, jang, star);

	}// end main

	// 평균
	public static float process_avg(int kor, int eng, int mat) {
		return (kor + eng + mat) / 3.0f;
	}

	// 장항생
	public static String[] porcess_scholar(float[] avg, String[] jang) {
		for (int i = 0; i < avg.length; i++) {
			if (avg[i] >= 95) {
				jang[i] = "장학생";
			}
		}
		return jang;
	}

	// 합격여부
	public static String[] process_pass(float avg[], int kor[], int eng[], int mat[], String pass[]) {
		for (int i = 0; i < avg.length; i++) {
			if (avg[i] >= 60) {
				pass[i] = "합격";
				if (kor[i] < 40 || eng[i] < 40 || mat[i] < 40) {
					pass[i] = "재시험";
				}
			} else {
				pass[i] = "불합격";
			}
		}
		return pass;
	}

	// 랭킹
	public static String[] process_star(float[] avg, String[] star) {
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < ((int) avg[i]) / 10; j++) {
				star[i] += "*";
			}

		}
		return star;
	}

	// 등수
	public static int[] process_rank(int size, float[] avg, int rank[]) {
		for (int j = 0; j < size; j++) {
			for (int i = 0; i < size; i++) {
				if (avg[j] > avg[i]) {
					rank[i]++;
				}
			}
		}
		return rank;
	}

	// 출력
	public static void process_show(String[] name, int[] kor, int[] eng, int[] mat, float[] avg, int[] rank,
			String[] pass, String[] jang, String[] star) {
		System.out.println("==================================================================================");
		System.out.println("\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println("==================================================================================");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i] + "\t\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + String.format("%.2f", avg[i])+ "\t"
					+ rank[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + star[i]);

		}
		System.out.println("==================================================================================");
	}

}// end class

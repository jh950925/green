package Silgi;

public class Ex002_02 {

	public static void main(String[] args) {
		// 선언
		String name[] = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		String hap[] = new String[5];
		String jang[] = { "", "", "", "", "" };
		String star[] = { "", "", "", "", "" };
		int kor[] = { 100, 20, 90, 70, 35 };
		int eng[] = { 100, 50, 95, 80, 100 };
		int mat[] = { 100, 30, 90, 60, 100 };
		int avg[] = new int[5];
		int rank[] = { 1, 1, 1, 1, 1 };
 
		// 처리 1 - 평균
		for (int i = 0; i < name.length; i++) {
			avg[i] = (kor[i] + eng[i] + mat[i]) / 3;
		}
		// 처리 2 - 합격여부 : 60점 이상 합격 / 불합격 - 합격에서도 40점 미만과목이 있으면 재시험
		for (int i = 0; i < name.length; i++) {
			if (avg[i] >= 60) {
				hap[i] = "합격";
				if (kor[i] < 40 || eng[i] < 40 || mat[i] < 40) {
					hap[i] = "재시험";
				}
			} else {
				hap[i] = "불합격";
			}
		}
		// 처리 3 - 장학생 여부 95점 이상 장학생
		for (int i = 0; i < name.length; i++) {
			jang[i] = (avg[i] >= 95) ? "장학생" : "-----";
		}
		// 처리 4 - 랭킹 ****
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < (avg[i]/10); j++) {
				star[i] += "*";
			}
		}
		// 처리 5 - 등수
		for(int j=0; j<name.length;j++) {
			for(int i = 0; i < name.length; i++) {
				if(avg[j] > avg[i]) {
					rank[i]++;
				}
			}
		}
		// 출력
		System.out.println(
				"===================================================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println(
				"===================================================================================================");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + avg[i] + "\t" + rank[i]
					+ "\t" + hap[i] + "\t" + jang[i] + "\t" + star[i]);
		}
		System.out.println(
				"===================================================================================================");
	}

}

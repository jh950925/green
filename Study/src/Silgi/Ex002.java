package Silgi;

public class Ex002 {

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

		// 조건 + 처리
		for (int i = 0; i < name.length; i++) {

			// 평균
			avg[i] = (kor[i] + eng[i] + mat[i]) / 3;

			// 장학생
			for (int j = 0; j < name.length; j++) {
				if(avg[i]>=95) {
					jang[i] = "장학생";
				}
			}

			// 합격여부
			for (int j = 0; j < name.length; j++) {
				if (avg[i] >= 60) {
					hap[i] = "합격";
					if (kor[i] < 40 || eng[i] < 40 || mat[i] < 40) {
						hap[i] = "재시험";
					}
				} else {
					hap[i] = "불합격";
				}
			}

			// 랭킹
			for (int j = 1; j <= (avg[i] / 10); j++) {
				star[i] += "*";
			}

		} 
		
		// 등수
		for(int i=0; i<name.length;i++) {
			for (int j = 0; j < name.length; j++) {
				if (avg[i] > avg[j]) {
					if (avg[i] == avg[j]) {
						rank[j]++;
//						System.out.println("rank[j] : ("+rank[j]+")");
					}
				} else if (avg[i] < avg[j]) {
					rank[i]++;
//					System.out.println("rank[i] : ("+rank[i]+")");
				}
			}
		}

		// 출력
		System.out.println("===================================================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println("===================================================================================================");
		for (int i = 0; i < name.length; i++) {
							System.out.println(name[i] + "\t" 
									+ kor[i]  + "\t" 
									+ eng[i]  + "\t" 
									+ mat[i]  + "\t" 
									+ avg[i]  + "\t" 
									+ rank[i] + "\t" 
									+ hap[i]  + "\t" 
									+ jang[i] + "\t" 
									+ star[i]);
		}
		System.out.println("===================================================================================================");
	}// end main

}// end class

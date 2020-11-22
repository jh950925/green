package Day013;

public class Ex011 {

	public static void main(String[] args) {
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0, yun = 0, today = 0, total_day = 0;
		String[] day = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String day02 = " ";

		for (int i = 1; i <= 2020; i++) {
			for (int j = 0; j < mon.length; j++) {
				sum += mon[j];
				if (i == 2020 && j == 9) {
					today += 13;
					break;
				}
			}
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				yun++;
			}
		}

		total_day = sum + yun + today;

		// 요일구하기
		for (int k = 0; k < day.length; k++) {
			if (total_day % 7 == k) {
				day02 = day[k];
			}
		}

		System.out.println("서기1년~ 오늘 총 날수 : " + total_day);
		System.out.println("2020년 10월 13일 : " + day02);
		System.out.println("=====================10월====================");
		for (int c = 0; c < day.length; c++) {
			System.out.print(day[c] + "\t");
		}
		System.out.println();
		for (int i = 0; i < (sum + yun + 1) % 7; i++) {
			System.out.print("*\t");
		}

		for (int i = 1; i <= mon[10]; i++) {
			if ((sum + yun + i) % 7 == 0) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
	}
}

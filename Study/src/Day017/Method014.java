package Day017;

public class Method014 {

	public static void main(String[] args) {
		mycal001(2020, 10, 19);
		if (leap(2020)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}

	// 서기1년1월1일~오늘
	public static void mycal001(int year, int month, int day) {
		int month02 = 0;
		int year02 = 0;
		int sum02 = 0;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 2019년까지 총 날 수
		for (int i = 1; i < year; i++) {
			if (leap(i)) {
				year02 += 366;
			} else {
				year02 += 365;
			}
		}
		
		// 2020년1월부터 9(month)월까지 날 수
		for (int i = 0; i <10; i++) {
			month02 += mon[i];
			if (leap(year)) {
				mon[2] = 29;
			}
		}
		
		//총 합
		sum02 = year02+month02+day;

		System.out.println("001. YEAR : " + year);
		System.out.println("002. MONTH : " + month02);
		System.out.println("003. DAY : " + day);
		System.out.println("서기1년1월1일~2020년 10월 19일 : " + sum02);
	}

	// 윤년
	public static boolean leap(int num) {
		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

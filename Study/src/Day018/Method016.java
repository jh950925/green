package Day018;

public class Method016 {

	public static void main(String[] args) {
		myCalendar(1995, 9, 25);

	}

	// 윤년
	public static boolean leap(int num) {
		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 2019년2월 27일 총 날수와 요일구하기
	public static void myCalendar(int year, int month, int day) {
		int year02 = 0, month02 = 0;
		;
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum02 = 0;

		for (int i = year; i < 2020; i++) {
			if (leap(i)) {
				year02 += 366;
			} else {
				year02 += 365;
			}
//			System.out.println(year02+"("+i+")");
		}//1995~2019년까지 다 더하기
		
		// 2020년1월부터 (month)전월까지 날 수
		for (int i = month; i < 10; i++) {
			month02 += mon[i];
			if (leap(year)) {
				mon[2] = 29;
			}
		}// 1995년과 2020년이 평년이라고 치면 95년 1월~ 9월 까지의 합을 2020년에다가 넘겨받고 month02에서 10월 한달을 25일까지로 month로 받아서 계산한다.
		 // 그럼 95년보다 21 22 23 24 4일이 더 많은데 95년은 평년이고 20년은 윤년이라서 하루가 더 많으니 -4를 해주는게 아니라 -3을 해준다.
		
		sum02 = year02 + month02-3;
		System.out.println("" + year + "년 " + month + "월 " + day + "일 " + " ~ " + "오늘까지" + "\n" + sum02);
	}

}

package Day017;

public class Method015 {

	public static void main(String[] args) {
		myCalendar(2019,2,27);
		
	}

	//Method
	
	// 윤년
	public static boolean leap(int num) {
		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
			return true;
		} else {
			return false;
		}
	} 
	
	//2019년2월 27일 총 날수와 요일구하기
	public static void myCalendar(int year, int month, int day) {
		int month02 = 0;
		int year02 = 0;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum02 = 0;
		String week02 = " ";
		
		// 2018년까지 총 날 수
		for (int i = 1; i < year; i++) {
			if (leap(i)) {
				year02 += 366;
			} else {
				year02 += 365;
			}
		}
		
		// 2020년1월부터 (month)전월까지 날 수
		for (int i = 0; i <month; i++) {
			month02 += mon[i];
			if (leap(year)) {
				mon[2] = 29;
			}
		}
		//총 합
		sum02 = year02+month02+day;
		week02 = week(sum02);
		System.out.println("서기1년1월1일~"+year+"년"+month+"월"+ day+"일 : " + sum02);
		System.out.println(""+year+"년 "+month+"월 "+day+"일 "+ week02);
		show(sum02, month, month, day);
	}
	
	//요일
		public static String week(int key) {
			String result = "";
			String [] day = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
			for(int i=0;i<day.length;i++) {
				if(key%7==i) {
					result = day[i];
				}
			}
			return result;
		}
		
	
	//달력 출력
	public static void show(int hap, int month, int end, int date) {
		String[] day = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		System.out.println("========================="+month+"월========================");
		for (int i = 0; i < day.length; i++) {
			System.out.print(day[i] + "\t");
		}
		
		System.out.println();
		for(int i=0; i<=(hap+1)%7; i++) {
			System.out.print("*\t");
		}
		for(int i=1;i<=date+1;i++) {
			if ((hap+i+1)%7 == 0) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
	}
}

package Day018;

public class Method015_T {

	public static void main(String[] args) {
		myCalendar(2019,2,27);
		
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
		int box = 0;
		int [] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1; i<year;i++) {
			box +=leap(i)? 366: 365;
		}
		mon[2] = leap(year)? 29 : 28;
		for(int i=1; i<month;i++) {
			box +=mon[i];
		}
		box +=day;
		System.out.println("서기1년1월1일~"+year+"년"+month+"월"+day+"일"+week(box)+"요일"+" : "+ box);
		show(box, month, mon[month], day);
		
	}
	
		
	
	//달력 출력
	public static void show(int hap, int month, int end, int date) {
		System.out.println(hap+"\t"+month+"\t"+end+"\t"+date);
		String[] days = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		System.out.println("\n\n("+month+")월");
		System.out.println("\n--------------------------------------------");
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i]+"\t");
		}
		System.out.println("\n--------------------------------------------");
		for(int i=0; i<(hap-date+1)%7;i++) {
			System.out.print("*\t");
		}
		for(int i=1; i<=end;i++) {
			if((hap-date+i)%7==0) {
				System.out.println();
			}
			System.out.print(i+"\t");
		}
		
	}
}

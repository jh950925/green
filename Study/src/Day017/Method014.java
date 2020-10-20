package Day017;

public class Method014 {

	public static void main(String[] args) {

		
		mycal001(2020,10,19);
		if(leap(2020)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}
	
	//서기1년1월1일~오늘
	public static void mycal001(int year, int month, int day) {
		int result = 0;
		int sum=0;
		int yuun = 0;
		int month02=0;
		int year02=0;
		int sum02=0;
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		
		for(int i=1; i<=year;i++) {
			if(leap(i)==true){
				year02 += 366;
			}else if(leap(i)==false) {
				year02 += 365;
			}
		}
		if(leap(year)==true){
			mon[2] = 29;
		}else if(leap(year)==false) {
			mon[2] = 28;
		}
		for(int i = 0; i<month;i++) {
			month02 += mon[i];
		}
		sum02 = year02+month02+day;
		System.out.println("001. YEAR : "+year);
		System.out.println("002. MONTH : "+month);
		System.out.println("003. DAY : "+day);
		System.out.println("서기1년1월1일~2020년 10월 19일 : "+sum02);
	}
	//윤년
	public static boolean leap(int num) {
		if(num%4==0 && num%100!=0 || num%400==0) {
			return true;
		}else {
			return false;
		}
	}
}

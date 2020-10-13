package Day013;

public class Ex010 {

	public static void main(String[] args) {
		int [] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum =0, yun=0,today=0;
		String [] day = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		String day02 = " ";
		
		
		for(int i=1; i<=2020;i++) {
			for(int j=0;j<mon.length;j++) {
				sum += mon[j];
				if(i==2020 && j==9) {
					today -= 18;
					break;
				}
			}
			if(i%4==0 && i%100 !=0 || i%400==0) {
				yun++;
			}
		}
		
		sum += yun + today;
		
		for(int k=0;k<day.length;k++) {
			if(sum%7==k) {
				day02 = day[k];
			}
		}
		
		System.out.println("서기1년~ 오늘 총 날수 : "+sum);
		System.out.println("2020년 10월 13일 : "+day02);
		
	
	}

}

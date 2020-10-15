package Day013_2;

public class Ex011_2 {

	public static void main(String[] args) {
		int [] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
		int yun = 0,today=0,sum=0;
		char [] day = {'일','월','화','수','목','금','토'};
		char day02 = ' ';
				
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
		
		System.out.println("=====================10월====================");
//		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//일~월
		for(int c=0;c<day.length;c++) {
			System.out.print(day[c]+"\t");
		}
		System.out.println();
		//별모양
		for(int b=1;b<5;b++) {
			System.out.print("*\t");
		}
		//날짜
		for(int a=1;a<=31;a++) {
			if(a%7==4) {
				System.out.println();
			}
			System.out.print(a+"\t");
		}
		
		
		
	}

}

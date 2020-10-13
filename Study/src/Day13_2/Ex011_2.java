package Day13_2;

public class Ex011_2 {

	public static void main(String[] args) {
		int [] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
		int yun = 0,today=0,sum=0, total=0;
		char [] day = {'일','월','화','수','목','금','토'};
		char day02 = ' ';
				
		for(int i=1; i<=2020;i++) {
			for(int j=0;j<mon.length;j++) {
				sum += mon[j];
				if(i==2020 && j==8) {
					today += 13;
					break;
				}
			}
			if(i%4==0 && i%100 !=0 || i%400==0) {
				yun++;
			}
		}
		total = sum + yun + today;
		int total2 = sum + yun+1;	//2020-10월까지
		for(int k=0;k<day.length;k++) {
			if(total%7==k) {
				day02 = day[k];
			}
		}
		
		System.out.println("서기1년~ 오늘 총 날수 : "+total);
		System.out.println("2020년 10월 13일 : "+day02);
//		System.out.println(sum+yun); //2020-9월까지
		System.out.println("=====================10월====================");
		
		for(int c=0;c<day.length;c++) {
			System.out.print(day[c]+"\t");
		}
		System.out.println();
		
		int A = total2 %7; //
		
		for(int a =0; a<A;a++) {
			System.out.print("*\t");
		}
		for(int b=1; b<=mon[9];b++) {
			System.out.print(b+"\t");
			A++;
			if(A%7==0) {
				System.out.println();
			}
		}
		
		
	}

}

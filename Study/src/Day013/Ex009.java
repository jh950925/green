package Day013;

public class Ex009 {

	public static void main(String[] args) {
		int [] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum =0, yun=0,today=0;;
		
		
		for(int i=1; i<=2020;i++) {
			for(int j=0;j<mon.length;j++) {
				sum += mon[j];
//				System.out.println(sum);
				if(i==2020 && j==9) {
					today -= 18;
					break;
				}
			}
			if(i%4==0 && i%100 !=0 || i%400==0) {
				yun++;
//				System.out.println(yun);
			}
		}
//		System.out.println(today);
//		System.out.println(sum);
//		System.out.println(yun);
		System.out.println("서기1년~ 오늘 총 날수 : "+(sum+yun+today));
	}

}


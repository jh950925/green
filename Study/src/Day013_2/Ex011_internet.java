package Day013_2;

import java.util.Scanner;

public class Ex011_internet {

	public static void main(String[] args) {
		int [] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] day = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int sum=0,year=0,yun=0,total_day=0,today=0;

		//년
		for(int i=1; i<=2020; i++) {
			for(int j=0;j<mon.length;j++) {
				if(i==2020 && j==9) {
					today += 13;
					break;
				}
				sum += mon[j];
			}
			if(i%4==0 && i%100 != 0 || i %400==0) {
				yun++;
			}
		}
		//2019년도 까지의 일 수 
		total_day = sum + yun;
		
		System.out.println("윤년이랑 2020년도까지 : "+sum);
		System.out.println("윤년 개수 : "+yun);
		System.out.println("윤년+2020월 9월까지 : "+(total_day));
		System.out.println("윤년+2020월 오늘까지 : "+(total_day+today));
	}
}

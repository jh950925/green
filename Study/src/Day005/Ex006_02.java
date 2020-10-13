package Day005;

public class Ex006_02 {

	public static void main(String[] args) {
//	[번외]1	서기 1년 1일부터 금일까지의 날수
		
		int today = 269;				//2020년 1월 1일부터 오늘까지의 날수
		int allDay = 2019 * 365;		//2019년까지의 모든 날짜
		boolean yun = ((allDay%4==0 && allDay%100 !=0) || allDay%400==0);
		

	}

}

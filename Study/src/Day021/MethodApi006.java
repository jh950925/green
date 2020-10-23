package Day021;

import java.util.Calendar;

public class MethodApi006 {

	public static void main(String[] args) {

		// 1. 서기 1년 1월 1일 ~ 금일
		// 2. ※ Calendar 클래스 사용하지 말기
		Calendar today = Calendar.getInstance();
		System.out.print   (	today.get(1) + "년\t");
		System.out.print   (	today.get(2) + "월\t"); //1월 0
		System.out.println (	today.get(5) + "일\t");
		
		System.out.print   (	today.get(Calendar.YEAR) + "년\t");
		System.out.print   (	today.get(Calendar.MONTH)+1 + "월\t"); //1월 0
		System.out.print   (	today.get(Calendar.DATE) + "일\t");

		System.out.print   (	today.get(Calendar.HOUR) + "시\t");
		System.out.print   (	today.get(Calendar.MINUTE) + "분\t");
		System.out.print   (	today.get(Calendar.SECOND) + "초\t");

	}// end main
}// end class

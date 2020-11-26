package Day043;

import java.util.Calendar;

class Day_timer1 extends Thread{
	@Override
	public void run() {
		super.run();
		while(true) {
			Calendar timer = Calendar.getInstance(); //Calendar 객체를 계속 생성해야함
			System.out.println(timer.get(Calendar.HOUR_OF_DAY) + ":" 
					+ timer.get(Calendar.MINUTE) + ":"
					+ timer.get(Calendar.SECOND));
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

//class MyTimer2 extends Thread{
//	@Override
//	public void run() {
//		long Milliseconds = System.currentTimeMillis();
//		System.out.println(Milliseconds);
//		//1초 : 1000
//		//1분 : 1000*60
//		//1시 : 1000*60*60
//	}
//}

public class Day043_1 {
	public static void main(String[] args) {
		Day_timer1 todo1 = new Day_timer1(); todo1.start();
//		new MyTimer2().start();
	}
}

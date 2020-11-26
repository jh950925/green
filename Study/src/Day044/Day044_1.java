package Day044;

import java.text.SimpleDateFormat;

class Day044_1_Thread extends Thread{
	SimpleDateFormat aa;
	Day044_1_Thread(){
		aa = new SimpleDateFormat("HH:mm:ss");
	}
	@Override
	public void run() {
		while(true) {
			long time = System.currentTimeMillis();
			System.out.println(aa.format(time));
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

public class Day044_1 {
	public static void main(String[] args) {
		new Day044_1_Thread().start();
	}
}

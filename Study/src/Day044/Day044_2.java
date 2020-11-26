package Day044;


class Day044_2_Thread implements Runnable {
	@Override
	public void run() {
		while(true) {
			long Milliseconds = System.currentTimeMillis();
			//1시 : 1000*60*60
			int hour = (int)((Milliseconds/(1000*60*60)%24)+9);
			//1분 : 1000*60
			int min = (int)((Milliseconds/(1000*60))%60);		
			//1초 : 1000
			int sec = (int)((Milliseconds/(1000))%60);
			System.out.println(hour+":"+min+":"+sec);
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

public class Day044_2 {
	public static void main(String[] args) {
		Day044_2_Thread todo = new Day044_2_Thread();
		Thread thread = new Thread(todo);
		thread.start();
	}
}

package Day042;

class Redcnt2 extends Thread {
	@Override
	public void run() {
		System.out.println("Run Start@@");
		while(true) {
			System.out.println("*");
			boolean test = Thread.interrupted(); //방해상태여부
			System.out.println(test);
			if(test) {System.out.println("방해받았으니까 나갈래!!"); break; }
		}
		
		System.out.println("Run End@@");
	}
}
//////////////////////////////////////////////////////////////////////
public class Thread025_2 {
	public static void main(String[] args) {
		System.out.println("main Start");
		Redcnt2 thread = new Redcnt2();
		Thread test = new Thread(thread);
		test.start();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("방해중!");
		test.interrupt();
		System.out.println("Main:"+test.isInterrupted()); //정적
		System.out.println("방해중!");
		System.out.println("main End");
	}
}

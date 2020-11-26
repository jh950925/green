package Day041;
/////////////////////////////////////////////////////
class JoinA extends Thread{
	String str;
	public JoinA() { super(); }
	public JoinA(String str) { super(); this.str = str; }
	/////////////////////////////////////////////////
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("A");
		}
	}
}
/////////////////////////////////////////////////////
class JoinB extends Thread{
	String str;
	public JoinB() { super(); }
	public JoinB(String str) { super(); this.str = str; }
	/////////////////////////////////////////////////
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("\tB");
		}
	}
}
/////////////////////////////////////////////////////
public class thread002 {
	static long start=0 ,end =0;
	public static void main(String[] args) {
		System.out.println("main - start");
		
		////////
		start = System.currentTimeMillis();
		JoinA todo1 = new JoinA(); todo1.start();
		JoinB todo2 = new JoinB(); todo2.start();
		
		//(1) 대략 시간 잡기
//		try { Thread.sleep(3000); }
//		catch(Exception e) { e.printStackTrace(); }
		
		//(2) join : 작업이 끝날떄까지 기다리기
		try { todo1.join(); todo2.join(); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		
		end = System.currentTimeMillis();
		////////
		System.out.println("소요시간 : " + (end-start));
		System.out.println("main - end");
	}
}

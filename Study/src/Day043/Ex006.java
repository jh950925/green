package Day043;

class Thread4 extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				break;
			}
		}
	}
}

public class Ex006 {
	public static void main(String[] args) throws Exception{
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		try { Thread.sleep(5*1000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		throw new Exception("STOP!!!");
	}
}

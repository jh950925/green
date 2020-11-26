package Day042;

class Thread1 implements Runnable{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("*");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx001 {
	public static void main(String[] args) {
		new Thread(new Thread1()).start();
	}
}

package Day043;

class Thread3 extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}//end run
}

public class Ex005 {
	public static void main(String[] args) throws Exception {
		Thread3 th1 = new Thread3();
		th1.start();
		try { Thread.sleep(5*1000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		throw new Exception("STOP!!!");
	}
}
//ㅁ 실행화면
//0
//1
//2
//3
//4
//Exception in thread "main" java.lang.Exception: STOP!!!
//	at Day043.Ex005.main(Ex005.java:21)
//5
//6
//7
//8
//9

package Day042;

import javax.swing.JOptionPane;

class HelloCnt10_2 extends Thread {
	@Override
	public void run() {
		System.out.println("Run Start - " + isInterrupted()); // 방해했어?
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println("InterruptedException발생함");
				System.out.println("##Run Ing() - " + isInterrupted()); // 방해했어??
				break;
			} finally { // 동작하나요??
				System.out.println("#Run Ing() - " + isInterrupted()); // 방해했어??
			}
			// (2) 멈추라고???? - 근데 안멈춰요! -> 빠져나오기 (break;)
		}
		System.out.println("#Run End() - " + isInterrupted());
	}
}

//일반 메서드에 스타트 불가
public class Thread024_2 {
	public static void main(String[] args) {
		HelloCnt10_2 hello = new HelloCnt10_2();
		Thread thread = new Thread(hello);
		thread.start();
		if (JOptionPane.showInputDialog("stop시 o 누르기").equals("o")) {
//			thread.stop(); //stop을 걸때는 thread 실행 클래스에서 해야한다.
			thread.interrupt();// (1) 잠깐 멈춰줄래??
			System.out.println("#Main : isInterrupted() - " + thread.isInterrupted()); // ##
		}
	}
}

package Day043;

import javax.swing.JOptionPane;

//class Day_timer2 implements Runnable {
//	@Override
//	public void run() {
//		for (int i = 10; i > 0; i--) {
//			System.out.println("TImer : " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("정답입니다.");
//				break;
//			}
//			if(i == 1) {
//				System.out.println("카운트를 종료합니다.");
//			}
//		}
//	}
//}

class MyCount implements Runnable{
	int cnt; 	
	public MyCount() { cnt = 10; }
	@Override
	public void run() {
		while(cnt != 0) {
			System.out.println("Timer : " + cnt--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}
}

public class Day043_2 {
	public static void main(String[] args) {
//		Day_timer2 todo2 = new Day_timer2();
//		Thread tr = new Thread(todo2);
//		tr.start();
//		while(true) {
//			if (JOptionPane.showInputDialog("빨강의 영단어를 입력하세요").equalsIgnoreCase("red")) {
//				tr.interrupt();
//				break;
//			}else {
//				System.out.println("정답이 아닙니다.");
//			}
//		}
		
		MyCount timer = new MyCount();
		Thread thread = new Thread(timer);
		thread.start();
		if (JOptionPane.showInputDialog("빨강의 영단어를 입력하세요").equalsIgnoreCase("red")) {
			thread.interrupt();
		}
	}
}

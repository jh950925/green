package Day042;

import javax.swing.JOptionPane;

class Redcnt extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}
}
//////////////////////////////////////////////////////////////////////
public class Thread025 {
	public static void main(String[] args) {
		Redcnt red = new Redcnt();
		red.start();
		for(;;) {
			if (JOptionPane.showInputDialog("빨강의 영단어를 입력하세요").equalsIgnoreCase("red")) {
				red.interrupt();
				System.out.println("isInterrupted() : " + red.isInterrupted());
				System.out.println("카운트가 종료되었습니다.");
				break;
			}else {
				System.out.println("isInterrupted() : " + red.isInterrupted());
				System.out.println("정답이 아닙니다.");
			}
		}
	}
}

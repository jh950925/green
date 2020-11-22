package Day040;

import javax.swing.JOptionPane;

class Thread_apple extends Thread {
	public void run() {
		System.out.println("#apple#");
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}catch(Exception e) { e.printStackTrace(); }
		}//end for
	}
}
///////////////////////////////////////////////////////////////////////
public class Thread005 {
	public static void main(String[] args) {
		Thread_apple apple = new Thread_apple(); apple.start();
		String input = JOptionPane.showInputDialog(null,"사과 알파벳은?");
		if(input.trim().toLowerCase().equals("apple")) {
			apple.stop();
			System.out.println("정답입니다.");
		}else {
			System.out.println("정답이 아닙니다.");
			
		}
	}
}

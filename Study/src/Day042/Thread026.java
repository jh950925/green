package Day042;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class user2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("::::::::::: InterruptedException");
				break;
			}
		}
	}
}

public class Thread026 {
	public static void main(String[] args) {
		ArrayList<String> user = new ArrayList<>();
		user.add("aaa"); user.add("bbb"); user.add("ccc"); user.add("ddd"); user.add("eee");
		user2 user2 = new user2();
		user2.start();
		
		while(true) {
			String username = JOptionPane.showInputDialog("유저의 아이디를 입력하시오");
			if(user.contains(username)) {
				System.out.println(username+"안녕");
				user2.interrupt();
				break;
			}else {
				System.out.println("유저를 확인해 주세요");
			}
		}//end while
	}
}

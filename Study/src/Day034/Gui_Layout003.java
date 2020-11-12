package Day034;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Layout3_1{
	JFrame frame;
	JButton[] btn;
	
	public Layout3_1() {
		frame = new JFrame();
		btn = new JButton[5];
		for(int i=0; i<btn.length;i++) {
			btn[i] = new JButton("Btn"+(i+1));
		}
	}
	public void show() {
		frame.setLayout(new GridLayout(5,1)); //(줄,칸)
		for(int i=0; i<btn.length;i++) {
			frame.add(btn[i]);
		}
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Layout3_2{
	JFrame frame;
	JButton[] btn;
	
	public Layout3_2() {
		frame = new JFrame();
		btn = new JButton[5];
		for(int i=0; i<btn.length;i++) {
			btn[i] = new JButton("Btn"+(i+1));
		}
	}
	public void show() {
		frame.setLayout(new GridLayout(2,3)); //(줄,칸)
		for(int i=0; i<btn.length;i++) {
			frame.add(btn[i]);
		}
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui_Layout003 {
	public static void main(String[] args) {
		new Layout3_1().show();
		new Layout3_2().show();
	}
}

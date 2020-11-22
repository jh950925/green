package Day032_GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui004{
	JFrame frame;
	JButton[] button;
	public Gui004() {
		frame = new JFrame("BOX02");
		button = new JButton[3];
//		button[] = new JButton{new JButton("one"),new JButton("one"),new JButton("one")};
		button[0] = new JButton("one");
		button[1] = new JButton("two");
		button[2] = new JButton("three");
	}
	public void create() {
		for(int i=0; i<button.length;i++) {
			frame.add(button[i]);   
		}
		frame.setLayout(new FlowLayout());
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}  

public class GUI004_arr {
	public static void main(String[] args) {
		new Gui004().create(); 
	}
}

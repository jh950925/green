package Day032_anoymous;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui003{
	JFrame frame;
	JButton button1,button2,button3;
	
	public Gui003(){
		frame = new JFrame("Box");	//Container 위에 Component들을 올릴때 자리 배치 방법
		frame.setLayout(new FlowLayout());
		button1 = new JButton("One");
		button2 = new JButton("two");
		button3 = new JButton("three");
	}
	public void create() {
		frame.add(button1); 
		frame.add(button2);
		frame.add(button3); 
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Anymous004_gui {
	public static void main(String[] args) {
		new Gui003().create();
	}
}

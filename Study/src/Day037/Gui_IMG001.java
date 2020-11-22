package Day037;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Gui022{
//// [영역 제목 + 내용 (Label / Button)]
	JFrame frame;
	JLabel label;
	
	public Gui022() {
		frame = new JFrame("IMG");
		label = new JLabel(new ImageIcon("Images/myimg.jpg"));
	}
	public void show() {
		label.setPreferredSize(new Dimension(300,400));
		frame.add(label);
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui_IMG001 {
	public static void main(String[] args) {
		new Gui022().show();
	}
}

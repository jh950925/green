package Day039;

import javax.swing.JButton;
import javax.swing.JFrame;

class AbsGui {
	JFrame frame;
	JButton[] btn;

	public AbsGui() {
		frame = new JFrame(":::: frame");
		btn = new JButton[] { new JButton("One"), new JButton("Two"), new JButton("Three") };
	}

	public void create() {
		// 원하는 위치에 [겹쳐서] 배치
		frame.setLayout(null); // 1. 레이아웃 안함.
		btn[0].setBounds(0, 0, 100, 100); // x축,y축,가로사이즈,세로사이즈
		btn[1].setBounds(50, 50, 100, 100); // x축,y축,가로사이즈,세로사이즈
		btn[2].setBounds(100, 100, 120, 50); // x축,y축,가로사이즈,세로사이즈
		
		for (int i = 0; i < btn.length; i++) { frame.add(btn[i]); }
		frame.setSize(350, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui031 {
	public static void main(String[] args) {
		new AbsGui().create();
	}
}

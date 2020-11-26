package Day041;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class timer_gui {
	JFrame frame;
	JTextField[] text;
	JButton[] btn;
	JPanel[] panel;
	JLabel label;
	TextArea area;
	String a;

	public timer_gui() {
		panel = new JPanel[] { new JPanel(), new JPanel(), new JPanel() };
		frame = new JFrame("JAVA TALK!");
		text = new JTextField[] { new JTextField(), new JTextField("", 20) };
		btn = new JButton[] { new JButton("전송"), new JButton("닫기") };
		label = new JLabel("" , JLabel.RIGHT);
		area = new TextArea();
	}

	public void show() {
		label.setForeground(Color.white);
		panel[0].add(label);
		panel[0].setPreferredSize(new Dimension(400, 30));
		panel[0].setBackground(Color.DARK_GRAY);

		panel[1].add(area);

		panel[2].setLayout(new FlowLayout());
		panel[2].add(text[1]);
		panel[2].add(btn[0]);
		panel[2].add(btn[1]);

		frame.setSize(450, 300);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(2, 1));
		frame.add(panel[0], BorderLayout.NORTH);
		frame.add(panel[1], BorderLayout.CENTER);
		frame.add(panel[2], BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class timer_info extends Thread {
	timer_gui gui;
	public timer_info() { gui = new timer_gui(); gui.show(); }
	
	@Override
	public void run() {
		while (true) {
			Calendar timer = Calendar.getInstance();
			gui.label.setText(timer.get(Calendar.HOUR_OF_DAY) + "시 " 
								+ timer.get(Calendar.MINUTE) + "분 "
								+ timer.get(Calendar.SECOND) + "초");
			gui.frame.repaint(); //###
			///repaint : update() 메서드를 호출해줌.
			// 화면이 자동갱신되기 때문에 화면에 남아있던 그래픽 요소는 다 사라지고, 갱신됨
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
public class timer {
	public static void main(String[] args) {
		new timer_info().start();
	}
}

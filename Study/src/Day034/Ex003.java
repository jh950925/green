package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Ex_Layout3 implements ActionListener{
	JFrame frame;
	JButton btn;
	JLabel label;
	JPanel[] panel;
	static int num = 1;
	
	public Ex_Layout3() {
		frame = new JFrame("숫자 바꾸기");
		btn = new JButton("바꾸기");
		label = new JLabel("PANEL"+num, JLabel.CENTER);
		panel = new JPanel[3];
		for(int i=0; i<panel.length;i++) {
			panel[i] = new JPanel();
		}
	}
	public void show() {
		btn.setPreferredSize(new Dimension(400,50));
		btn.setBackground(Color.black);
		btn.setForeground(Color.white);
		btn.addActionListener(this);
		for(int i=0; i<panel.length;i++) {
			panel[i].add(label);
		}
		for(int i=0; i<panel.length;i++) {
			frame.add(panel[i], BorderLayout.NORTH);
			frame.add(panel[i]);
		}
		
		frame.setLayout(new BorderLayout(2,1));
		frame.add(btn, BorderLayout.SOUTH);
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		this.label.setText("PANEL"+num);
		num++;
		if(num==4) {
			num=1;
		}
	}
}
public class Ex003 {
	public static void main(String[] args) {
		new Ex_Layout3().show();
	}
}

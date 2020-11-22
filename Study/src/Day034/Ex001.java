package Day034;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ex_layout /*implements ActionListener*/{
	JFrame frame;
	JButton btn;
	JTextField text;
	JLabel label;
	
	public Ex_layout() {
		label = new JLabel("아이디",JLabel.CENTER);
		frame = new JFrame("UserId");
		btn = new JButton("입력");
		text = new JTextField("",10);
	}
	public void show() {
		btn.setBackground(Color.black);
		btn.setForeground(Color.white);
		 
		frame.setLayout(new FlowLayout());
		frame.setSize(300,100);
		frame.add(label);
		frame.add(text);
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		new Ex_layout2().show();
//		this.btn.addActionListener(l);
//	}
}

public class Ex001 {
	public static void main(String[] args) {
		new Ex_layout().show();
	}
}

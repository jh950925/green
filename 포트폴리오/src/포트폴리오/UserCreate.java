package 포트폴리오;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserCreate {
	JFrame frame;
	JButton btn;
	JTextField[] text;
	JLabel[] label;
	
	public UserCreate() {
		frame = new JFrame("main");
		btn = new JButton("등록");
		label = new JLabel[] {
				new JLabel("이름")
				,new JLabel("id")
				,new JLabel("password")
				,new JLabel("password확인")
				,new JLabel("이메일")
				,new JLabel("전화번호")
				,new JLabel("생년월일")
				,new JLabel("사원번호")};
		text = new JTextField[] {
				new JTextField()
				,new JTextField()
				,new JTextField()
				,new JTextField()
				,new JTextField()
				,new JTextField()
				,new JTextField()
				,new JTextField()};
	}
	public void show() {
		frame.add(label[0]);
		frame.add(text[0]);
		frame.add(label[1]);
		frame.add(text[1]);
		frame.add(label[2]);
		frame.add(text[2]);
		frame.add(label[3]);
		frame.add(text[3]);
		frame.add(label[4]);
		frame.add(text[4]);
		frame.add(label[5]);
		frame.add(text[5]);
		frame.add(label[6]);
		frame.add(text[6]);
		frame.add(label[7]);
		frame.add(text[7]);
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		//frame 셋팅
		frame.setLayout(new GridLayout(9,2));
		frame.setVisible(true);
		frame.setSize(400, 600);
	}
}

package 포트폴리오;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UserUpdate {
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JTable table; 
	JLabel[] label;
	JTextField[] text;

	
	public UserUpdate() {
		frame = new JFrame();
		btn = new JButton[3];
		btn[0] = new JButton("수정");
		btn[1] = new JButton("계정삭제");
		btn[2] = new JButton("홈");
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
		panel = new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
		};
	}
	public void show() {
		//panel[0]
		panel[0].setLayout(new FlowLayout(0));
		panel[0].add(btn[0]);
		panel[0].add(btn[1]);
		//panel[1]
		panel[1].setLayout(new FlowLayout(0));
		panel[1].add(btn[2]);
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		//panel[2]
		panel[2].setLayout(new GridLayout(1,2));
		panel[2].add(panel[0]);
		panel[2].add(panel[1]);
		//panel[3]
		panel[3].setLayout(new GridLayout(8,2));
		panel[3].add(label[0]);
		panel[3].add(text[0]);
		panel[3].add(label[1]);
		panel[3].add(text[1]);
		panel[3].add(label[2]);
		panel[3].add(text[2]);
		panel[3].add(label[3]);
		panel[3].add(text[3]);
		panel[3].add(label[4]);
		panel[3].add(text[4]);
		panel[3].add(label[5]);
		panel[3].add(text[5]);
		panel[3].add(label[6]);
		panel[3].add(text[6]);
		panel[3].add(label[7]);
		panel[3].add(text[7]);
		//frame 셋팅
		frame.add(panel[2]);
		frame.add(panel[3]);
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(2,1));
	}
}

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class User_Update {
	/** 계정수정 **/
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JTable table; 
	JLabel[] label;
	JTextField[] text;

	
	public User_Update() {
		frame = new JFrame("계정수정");
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
				new JPanel()
		};
	}
	public void show() {
		//인터리어
		//frame 셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setResizable(false);
		frame.setLayout(null);
		
		panel[0].setLayout(null);
		panel[1].setLayout(null);
		//panel[0]
		panel[0].setBounds(0, 0, 400, 40);
		//panel[1]
		panel[1].setBounds(0, 40, 400, 250);
		
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 10, 100, 25);
		panel[0].add(btn[1]);
		btn[1].setBounds(130, 10, 100, 25);
		panel[0].add(btn[2]);
		btn[2].setBounds(320, 10, 50, 25);
		
		//panel[1]
		//label
		panel[1].add(label[0]);//이름
		label[0].setBounds(30, 10, 70, 20);
		panel[1].add(label[1]);//id
		label[1].setBounds(30, 35, 70, 20);
		panel[1].add(label[2]);//pass
		label[2].setBounds(30, 60, 70, 20);
		panel[1].add(label[3]);//pass확인
		label[3].setBounds(30, 85, 70, 20);
		panel[1].add(label[4]);//이메일
		label[4].setBounds(30, 110, 70, 20);
		panel[1].add(label[5]);//전화번호
		label[5].setBounds(30, 135, 70, 20);
		panel[1].add(label[6]);//생년월일
		label[6].setBounds(30, 160, 70, 20);
		panel[1].add(label[7]);//사원번호
		label[7].setBounds(30, 185, 70, 20);
		
		//textField
		panel[1].add(text[0]);
		text[0].setBounds(120, 10, 200, 20);
		panel[1].add(text[1]);
		text[1].setBounds(120, 35, 200, 20);
		panel[1].add(text[2]);
		text[2].setBounds(120, 60, 200, 20);
		panel[1].add(text[3]);
		text[3].setBounds(120, 85, 200, 20);
		panel[1].add(text[4]);
		text[4].setBounds(120, 110, 200, 20);
		panel[1].add(text[5]);
		text[5].setBounds(120, 135, 200, 20);
		panel[1].add(text[6]);
		text[6].setBounds(120, 160, 200, 20);
		panel[1].add(text[7]);
		text[7].setBounds(120, 185, 200, 20);
	}
}

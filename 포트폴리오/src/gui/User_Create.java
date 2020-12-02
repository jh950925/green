package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class User_Create {
	JFrame frame;
	JButton btn;
	JLabel[] label;
	JTextField[] text;
//	그때 알려주신거로 해보려고 했는데 회원가입 파트가요
	public User_Create() {
		
		frame = new JFrame("main");
		btn = new JButton("등록");
		label = new JLabel[] { new JLabel("이름"), new JLabel("id"), new JLabel("password"), new JLabel("password확인"),
				new JLabel("이메일"), new JLabel("전화번호"), new JLabel("생년월일"), new JLabel("사원번호") };
		text = new JTextField[] { new JTextField(), new JTextField(), new JTextField(), new JTextField(),
				new JTextField(), new JTextField(), new JTextField(), new JTextField() };
	}

	public void show() {
		frame.add(label[0]);//이름
		frame.add(text[0]);
		label[0].setBounds(10, 10, 90, 20);
		text[0].setBounds(120, 10, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[1]);//id
		frame.add(text[1]);
		label[1].setBounds(10, 50, 90, 20);
		text[1].setBounds(120, 50, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[2]);//비번
		frame.add(text[2]);
		label[2].setBounds(10, 90, 90, 20);
		text[2].setBounds(120, 90, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[3]);//비번확인
		frame.add(text[3]);
		label[3].setBounds(10, 130, 90, 20);
		text[3].setBounds(120, 130, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[4]);//이메일
		frame.add(text[4]);
		label[4].setBounds(10, 170, 90, 20);
		text[4].setBounds(120, 170, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[5]);//전화번호
		frame.add(text[5]);
		label[5].setBounds(10, 210, 90, 20);
		text[5].setBounds(120, 210, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[6]);//생년월일
		frame.add(text[6]);
		label[6].setBounds(10, 250, 90, 20);
		text[6].setBounds(120, 250, 150, 20);
		//////////////////////////////////////////////
		frame.add(label[7]);//사원번호
		frame.add(text[7]);
		label[7].setBounds(10, 290, 90, 20);
		text[7].setBounds(120, 290, 150, 20);
		//////////////////////////////////////////////
		btn.setBounds(80, 330, 120, 30);
		frame.add(btn);
		
		//frame 셋팅
		frame.setLocation(500, 100);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300, 420);
	}
}


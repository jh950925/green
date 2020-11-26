package 포트폴리오;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserCreate{
	JFrame frame;
	JButton btn;
	JLabel[] label;
	JTextField[] text;
	UserInfo userInfo = new UserInfo();//지금은 테스트하려고 한명만 보고있는데 아 아직 리스트는 생각 안하고 있었어요 그냥 겍터 셋터만 해서 값 하나만 받아오는거 
	 
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
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				userInfo.setName(text[0].getText());
				userInfo.setId(text[1].getText());
				userInfo.setPass(text[2].getText());
				userInfo.setPass_chk(text[3].getText());
				userInfo.setMail(text[4].getText());
				userInfo.setPhno(text[5].getText());
				userInfo.setUserDate(text[6].getText());
				userInfo.setUserNo(text[7].getText());
				System.out.println(userInfo);
			}
		});
		//frame 셋팅
		frame.setLocation(500, 100);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(300, 420);
	}
}

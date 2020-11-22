package 포트폴리오;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserFind {
	JFrame frame;
	JTextField[] text;
	JLabel[] label;
	JButton[] btn;
	JPanel[] panel;
	
	public UserFind() {
		frame = new JFrame();
		label = new JLabel[7];
		btn = new JButton[4];
		text = new JTextField[11];
		//id
		label[0] = new JLabel("이름");
		label[1] = new JLabel("생년월일");
		label[2] = new JLabel("사원번호");
		btn[0] = new JButton("확인");
		btn[1] = new JButton("초기화");
		text[0] = new JTextField("이름");
		text[1] = new JTextField("생년월일");
		text[2] = new JTextField("사원번호");
		text[3] = new JTextField("ID확인");
		//비밀번호
		label[3] = new JLabel("Id");
		label[4] = new JLabel("이름");
		label[5] = new JLabel("생년월일");
		label[6] = new JLabel("사원번호");
		btn[2] = new JButton("확인");
		btn[3] = new JButton("등록");
		text[4] = new JTextField("ID");
		text[5] = new JTextField("이름");
		text[6] = new JTextField("생년월일");
		text[7] = new JTextField("사원번호");
		text[8] = new JTextField("id");
		text[9] = new JTextField("pass입력");
		text[10] = new JTextField("pass확인");
		panel = new JPanel[] {
							 new JPanel(),
							 new JPanel()};
	}
	public void show() {
		//panel셋팅
		panel[0].setLayout(new GridLayout(3,3));
		panel[0].add(label[0]);
		panel[0].add(text[0]);
		panel[0].add(text[3]);
		panel[0].add(label[1]);
		panel[0].add(text[1]);
		panel[0].add(btn[0]);
		panel[0].add(label[2]);
		panel[0].add(text[2]);
		panel[0].add(btn[1]);
		
		panel[1].setLayout(new GridLayout(5,3));
		panel[1].add(label[3]);	//id
		panel[1].add(text[4]);	//id
		panel[1].add(text[8]);	//id확인
		
		panel[1].add(label[4]);	//이름
		panel[1].add(text[5]);	//이름
		panel[1].add(text[9]);	//pass입력
		
		panel[1].add(label[5]);	//생년월일
		panel[1].add(text[6]);	//생년월일
		panel[1].add(text[10]);	//pass확인
		
		panel[1].add(label[6]);	//사원번호
		panel[1].add(text[7]);	//사원번호
		panel[1].add(btn[2]);   //확인
		panel[1].add(btn[3]);   //등록
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		//frame 셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(2,1));
		frame.setSize(500, 400);
	}
}	

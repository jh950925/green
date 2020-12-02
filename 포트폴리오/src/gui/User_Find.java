package gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class User_Find {
	JFrame frame;
	JTextField[] text;
	JLabel[] label;
	JButton[] btn;
	JPanel[] panel;
	
	public User_Find() {
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
							 new JPanel()
							 };
	}
	public void show() {
		//panel셋팅
		//panel[0]
		panel[0].setLayout(null);
		panel[0].setBounds(0, 0, 480, 150);
		
		//label
		panel[0].add(label[0]); //이름
		label[0].setBounds(10, 10, 50, 25);
		panel[0].add(label[1]); //생년월일
		label[1].setBounds(10, 50, 50, 25);
		panel[0].add(label[2]); //사원번호
		label[2].setBounds(10, 90, 50, 25);
		
		//textfield
		panel[0].add(text[0]);  //이름
		text[0].setBounds(80, 10, 200, 25);
		panel[0].add(text[1]);	//생년월일
		text[1].setBounds(80, 50, 200, 25);
		panel[0].add(text[2]);	//사원번호
		text[2].setBounds(80, 90, 200, 25);
		panel[0].add(text[3]);	//아이디확인
		text[3].setBounds(300, 50, 160, 25);
		
		//btn
		panel[0].add(btn[0]);	//확인
		btn[0].setBounds(300, 10, 70, 25);
		panel[0].add(btn[1]);	//초기화
		btn[1].setBounds(390, 10, 70, 25);
		///////////////////////////////////////////////////////////////////////////
		//pane[1]
		panel[1].setLayout(null);
		panel[1].setBounds(0, 160, 500, 200);
		
		//label
		panel[1].add(label[3]);	//id
		label[3].setBounds(10, 10, 50, 25);
		panel[1].add(label[4]);	//이름
		label[4].setBounds(10, 50, 50, 25);
		panel[1].add(label[5]);	//생년월일
		label[5].setBounds(10, 90, 50, 25);
		panel[1].add(label[6]);	//사원번호
		label[6].setBounds(10, 130, 50, 25);
		
		//textfield
		panel[1].add(text[4]);	//id
		text[4].setBounds(80, 10, 200, 25);
		panel[1].add(text[5]);	//이름
		text[5].setBounds(80, 50, 200, 25);
		panel[1].add(text[6]);	//생년월일
		text[6].setBounds(80, 90, 200, 25);
		panel[1].add(text[7]);	//사원번호
		text[7].setBounds(80, 130, 200, 25);
		panel[1].add(text[8]);	//id확인
		text[8].setBounds(300, 10, 160, 25);
		panel[1].add(text[9]);	//pass입력
		text[9].setBounds(300, 50, 160, 25);
		panel[1].add(text[10]);	//pass확인
		text[10].setBounds(300, 90, 160, 25);
		
		//btn
		panel[1].add(btn[2]);   //확인
		btn[2].setBounds(300, 130, 70, 25);
		panel[1].add(btn[3]);   //등록
		btn[3].setBounds(390, 130, 70, 25);
		//frame 셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(500, 400);
//		frame.setResizable(false);
	}
}	
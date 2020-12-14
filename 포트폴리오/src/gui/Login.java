package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login {
	/** 메인화면 **/
	JFrame frame;
	JPanel[] panel;
	JButton[] btn;
	JLabel[] label;
	public Login() {
		frame = new JFrame("메인");
		panel = new JPanel[] {
				new JPanel(),
				new JPanel()
				};
		label = new JLabel[] {
				new JLabel("이름"),
				new JLabel(),
				new JLabel("id"),
				new JLabel(),
				new JLabel("사원번호"),
				new JLabel()
				};
		btn = new JButton[6];
		btn[0] = new JButton("수정");
		btn[1] = new JButton("상품등록");
		btn[2] = new JButton("재고확인");
		btn[3] = new JButton("상품출고");
		btn[4] = new JButton("출고확인");
		btn[5] = new JButton("로그아웃");
	}
	public void show() {
		//panel[0] 셋팅
		panel[0].setLayout(null);
		panel[0].setBounds(0, 0, 250, 400);
		
		//label(정보)
		panel[0].add(label[0]); //이름
		label[0].setBounds(30, 40, 100, 25);
		panel[0].add(label[1]);
		label[1].setBounds(160, 40, 100, 25);
		
		panel[0].add(label[2]); //id
		label[2].setBounds(30, 120, 100, 25);
		panel[0].add(label[3]);
		label[3].setBounds(160, 120, 100, 25);
		
		panel[0].add(label[4]); //사원번호
		label[4].setBounds(30, 200, 100, 25);
		panel[0].add(label[5]);
		label[5].setBounds(160, 200, 100, 25);
		
		//btn(수정)
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 320, 230, 30);
		
		///panel[1] 셋팅
		panel[1].setLayout(null);
		panel[1].setBounds(260, 0, 350, 400);
		
		//btn
		panel[1].add(btn[1]);//상품등록
		btn[1].setBounds(10, 40, 100, 50);
		panel[1].add(btn[2]);//출고확인
		btn[2].setBounds(150, 40, 100, 50);
		panel[1].add(btn[3]);//재고확인
		btn[3].setBounds(10, 140, 100, 50);
		panel[1].add(btn[4]);//재고출고
		btn[4].setBounds(150, 140, 100, 50);
		panel[1].add(btn[5]);//로그아웃
		btn[5].setBounds(10, 320, 250, 30);
		
		//frame셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(1,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
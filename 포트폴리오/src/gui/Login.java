package gui;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.UserInfo;

public class Login {

	JFrame frame;
	JPanel[] panel;
	JButton[] btn;
	JTextArea area;
	public Login() {
		frame = new JFrame();
		panel = new JPanel[] {
				new JPanel(),
				new JPanel()
				};
		btn = new JButton[6];
		btn[0] = new JButton("수정");
		btn[1] = new JButton("상품등록");
		btn[2] = new JButton("출고확인");
		btn[3] = new JButton("재고확인");
		btn[4] = new JButton("재고출고");
		btn[5] = new JButton("로그아웃");
		area = new JTextArea("회원정보");
	}
	public void show() {
		//panel[0] 셋팅
		panel[0].setLayout(null);
		panel[0].setBounds(0, 0, 250, 400);
		panel[0].add(area);
		area.setBounds(10, 10, 230, 300);
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 320, 230, 30);
		
		//panel[1] 셋팅
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
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(1,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
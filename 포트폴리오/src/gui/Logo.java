package gui;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.UserInfo;

class Logo{
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JLabel[] label;
	JTextField text;
	JPasswordField passtext;
	
	public Logo(){
		///////////////////
		frame = new JFrame();
		text = new JTextField();
		passtext = new JPasswordField();
		btn = new JButton[] {
							new JButton("회원가입"),
							new JButton("계정찾기"),
							new JButton("로그인"),
							new JButton("종료"),};
		panel = new JPanel[] {
							  new JPanel(),
							  new JPanel(),
							  new JPanel(),
							  new JPanel()};
		label = new JLabel[] {
							  new JLabel("(주)하랑"),
							  new JLabel(new ImageIcon("Img/cat.jpg")),
							  new JLabel("ID"),
							  new JLabel("PASS")};
	}

	public void show() {
		//panel 셋팅
		//0
		panel[0].add(label[0]); 
		panel[0].setBounds(10, 10, 460, 30); //(주)하랑 위치
		//1
		panel[1].setBounds(10, 60, 460, 290); //패널1 위치
		panel[1].add(panel[2]);				  
		panel[1].add(panel[3]);
		panel[1].setLayout(null);
		//이미지 라벨 
		panel[2].setBounds(10, 0, 180, 290);   //패널2 위치
		panel[2].add(label[1]);
		label[1].setPreferredSize(new Dimension(180,290));
		//이미지 크기 라벨에 맞게
		//3
		panel[3].setBounds(210, 0, 260, 270); //패널3 위치
		panel[3].setLayout(null);			  
		label[2].setBounds(10, 30, 50, 15);   //id   라벨 위치
		label[3].setBounds(10, 80, 50, 15);   //pass 라벨 위치
		text.setBounds(70, 30, 160, 20);   //id   텍스트 필드 위치
		passtext.setBounds(70, 80, 160, 20);   //pass 텍스트 필드 위치
		passtext.setEchoChar('*');
		//패널에 추가
		panel[3].add(label[2]);
		panel[3].add(text);
		panel[3].add(label[3]);
		panel[3].add(passtext);
		for(int i=0; i<btn.length;i++) {
			panel[3].add(btn[i]);
		}
		//버튼 디자인
		btn[0].setBounds(15, 140, 220, 25);
		btn[1].setBounds(15, 180, 100, 25);
		btn[2].setBounds(135, 180, 100, 25);
		btn[3].setBounds(15, 220, 220, 25);
		///////////////////////////////////////////////////
		//frame 셋팅
		frame.setLayout(null);
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}

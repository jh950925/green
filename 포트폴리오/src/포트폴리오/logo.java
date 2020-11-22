package 포트폴리오;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Gui_logo{
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JLabel[] label;
	JTextField[] text;
	
	public Gui_logo(){
		frame = new JFrame();
		text = new JTextField[] {
							new JTextField(),
							new JTextField()};
		btn = new JButton[] {
							new JButton("회원가입"),
							new JButton("id/password찾기"),
							new JButton("로그인"),
							new JButton("종료"),};
		panel = new JPanel[] {
							  new JPanel(),
							  new JPanel(),
							  new JPanel(),
							  new JPanel()};
		label = new JLabel[] {
							  new JLabel("(주)하랑"),
							  new JLabel("이미지가 들어갑니다."),
							  new JLabel("ID"),
							  new JLabel("PASSWORD")};
	}
	public void show() {

		//panel 셋팅
		//0
		panel[0].add(label[0]);
		panel[0].setSize(new Dimension(400,50));
		//1
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		panel[1].setLayout(new GridLayout(1,2));
		//이미지 라벨 
		panel[2].add(label[1]);
		//3
		panel[3].setLayout(new GridLayout(4,2));
		panel[3].add(label[2]);
		panel[3].add(text[0]);
		panel[3].add(label[3]);
		panel[3].add(text[1]);
		for(int i=0; i<btn.length;i++) {
			panel[3].add(btn[i]);
		}
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserCreate().show();
			}
		});
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserFind().show();
			}
		});
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main().show();
				frame.dispose();
			}
		});
		//frame 셋팅
		frame.setLayout(new GridLayout(2,1));
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}

public class logo {
	public static void main(String[] args) {
		new Gui_logo().show();
	}
}

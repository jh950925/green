package 포트폴리오;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {

	JFrame frame;
	JPanel[] panel;
	JButton[] btn;
	JTextArea area;
	
	public Main() {
		frame = new JFrame();
		panel = new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()};
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
		panel[0].setLayout(new GridLayout(2,1));
		panel[0].add(area);
		panel[0].add(btn[0]);
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserUpdate().show();
			}
		});
		//panel[1] 셋팅
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		panel[1].setLayout(new GridLayout(2,1));
		//panel[2] 셋팅
		panel[2].setLayout(new GridLayout(2,2));
		panel[2].add(btn[1]);
		panel[2].add(btn[2]);
		panel[2].add(btn[3]);
		panel[2].add(btn[4]);
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Pro_Create().show();
				frame.dispose();
			}
		});
		//panel[3] 셋팅
		panel[3].setLayout(new FlowLayout());
		panel[3].add(btn[5]);
		btn[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Gui_logo().show();
				frame.dispose();
			}
		});
		//panel 셋팅
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		//frame셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(1,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

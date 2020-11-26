package 포트폴리오;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Pro_Create {
	JFrame frame;
	JButton[] btn;
	JLabel[] label;
	JTextField[] text;
	Object [] columnNames;
	Object[][] rowData;
	JScrollPane scrollpane;
	JTable table;
	JPanel[] panel;
	
	public Pro_Create() {
		frame = new JFrame();
		columnNames = new String[] {"이름","수량","창고위치"};
		rowData = new Object[][] {};
		table = new JTable(rowData, columnNames);
		scrollpane = new JScrollPane(table);
		
		btn = new JButton[] {
				new JButton("상품등록"),
				new JButton("재고확인"),
				new JButton("재고출고"),
				new JButton("출고확인"),
				new JButton("홈"),
				new JButton("임시저장"),
				new JButton("초기화"),
				new JButton("등록")};
		label = new JLabel[] {new JLabel("이름"),new JLabel("수량"),new JLabel("창고위치")};
		text = new JTextField[] {new JTextField(),new JTextField(),new JTextField()};
		panel = new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()};
	}//end 선언
	public void show() {
		//panel[0]
		panel[0].setLayout(new FlowLayout());
		panel[0].add(btn[0]);
		panel[0].add(btn[1]);
		panel[0].add(btn[2]);
		panel[0].add(btn[3]);
		panel[0].add(btn[4]);
		btn[0].setEnabled(false);
		btn[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Main().show();
				frame.dispose();
			}
		});
		//panel[1]
		panel[1].setLayout(new GridLayout(1,2));
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		//panel[2]
		panel[2].setLayout(new GridLayout(5,2));
		panel[2].add(label[0]);
		panel[2].add(text[0]);
		panel[2].add(label[1]);
		panel[2].add(text[1]);
		panel[2].add(label[2]);
		panel[2].add(text[2]);
		panel[2].add(btn[5]);
		panel[2].add(btn[6]);
		panel[2].add(btn[7]);
		//panel[3]
		scrollpane.setPreferredSize(new Dimension(300,200));
		panel[3].add(scrollpane);
		//frame 셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(2,1));
		frame.setSize(600, 400);
	}
	
}

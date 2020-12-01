package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
	DefaultTableModel defaultTableModel;
	
	public Pro_Create() {
		frame = new JFrame();
		columnNames = new String[] {"이름","수량","창고위치"};
		rowData = new Object[][] {};
		defaultTableModel = new DefaultTableModel(rowData, columnNames);
		table = new JTable(defaultTableModel);
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
		panel[0].setLayout(null);
		panel[0].setBounds(0, 0, 1000, 50);
		
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 10, 150, 30); //상품등록 
		btn[0].setEnabled(false);
		panel[0].add(btn[1]);
		btn[1].setBounds(180, 10, 150, 30); //재고확인  
		panel[0].add(btn[2]);
		btn[2].setBounds(350, 10, 150, 30); //재고출고 
		panel[0].add(btn[3]);
		btn[3].setBounds(520, 10, 150, 30); //출고확인
		panel[0].add(btn[4]);
		btn[4].setBounds(920, 10, 50, 30); //홈
		//panel[1]
		panel[1].setLayout(null);
		panel[1].setBounds(0, 60, 1000, 520);
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		
		//panel[2]
		panel[2].setLayout(null);
		panel[2].setBounds(0, 0, 400, 500);
		
		//label
		panel[2].add(label[0]);
		label[0].setBounds(10, 10, 70, 25);
		panel[2].add(label[1]);
		label[1].setBounds(10, 50, 70, 25);
		panel[2].add(label[2]);
		label[2].setBounds(10, 90, 70, 25);
		//textField
		panel[2].add(text[0]);
		text[0].setBounds(90, 10, 250, 25);
		panel[2].add(text[1]);
		text[1].setBounds(90, 50, 250, 25);
		panel[2].add(text[2]);
		text[2].setBounds(90, 90, 250, 25);
		//btn
		panel[2].add(btn[5]);
		btn[5].setBounds(10, 130, 155, 30);
		panel[2].add(btn[6]);
		btn[6].setBounds(185, 130, 155, 30);
		panel[2].add(btn[7]);
		btn[7].setBounds(10, 180, 330, 30);
		
		//panel[3]
		panel[3].setLayout(new GridLayout(1,1));
		panel[3].setBounds(400, 0, 560, 500);
		panel[3].add(scrollpane);
		
		//frame 셋팅
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(1000, 600);
	}
	
}

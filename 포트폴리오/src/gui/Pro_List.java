package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Pro_List {
	/** 재고확인화면 **/
	JFrame frame;
	JTextField text;
	JButton [] btn;
	JPanel [] panel;
	Object [] colunm;
	Object [][] rowDate;
	DefaultTableModel defaultTableModel;
	JTable table;
	JScrollPane scollpane;
	
	public Pro_List() {
		frame = new JFrame("재고확인");
		text = new JTextField();
		btn = new JButton [] {
							  new JButton("상품등록"),new JButton("재고확인"),new JButton("상품출고"),new JButton("출고확인"),
							  new JButton("홈"),new JButton("조회"),new JButton("수정"),new JButton("삭제"),
							  };
		panel = new JPanel[] {new JPanel(),new JPanel()};
		colunm = new String[] {"창품명","창고","입고일","수량"};
		rowDate = new Object[][] {};
		defaultTableModel = new DefaultTableModel(rowDate,colunm);
		table = new JTable(defaultTableModel);
		scollpane = new JScrollPane(table);
	}
	
	public void show() {
		//panel[0]
		panel[0].setBounds(0, 0, 1000, 50);
		panel[0].setLayout(null);
		
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 10, 150, 30); //상품등록 
		panel[0].add(btn[1]);
		btn[1].setBounds(180, 10, 150, 30); //재고확인  
		btn[1].setEnabled(false);
		panel[0].add(btn[2]);
		btn[2].setBounds(350, 10, 150, 30); //재고출고 
		panel[0].add(btn[3]);
		btn[3].setBounds(520, 10, 150, 30); //출고확인
		panel[0].add(btn[4]);
		btn[4].setBounds(920, 10, 50, 30); //홈
		
		//panel[1]
		panel[1].setBounds(0, 80, 1000, 500);
		panel[1].setLayout(null);
		
		panel[1].add(text);
		text.setBounds(10, 10, 500, 30); //검색창
		panel[1].add(btn[5]);
		btn[5].setBounds(520, 10, 100, 30); //조회버튼
		panel[1].add(btn[6]);
		btn[6].setBounds(740, 10, 100, 30);
		panel[1].add(btn[7]);
		btn[7].setBounds(870, 10, 100, 30); 
		panel[1].add(scollpane);
		scollpane.setBounds(10, 50, 960, 400); //테이블
		
		//frame
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//	public static void main(String[] args) {
//		new Pro_List().show();
//	}
}

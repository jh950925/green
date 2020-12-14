package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Pro_Delete {
	/** 상품 출고 **/
	JFrame frame;
	JButton btn [];
	JPanel panel[];
	JTextField text[];
	DefaultTableModel[] defaultTableModel;
	JTable[] table;
	Object []column;
	Object [][] rowData;
	JScrollPane[] scrollpane;
	JLabel[] label;
	
	public Pro_Delete() {
		frame = new JFrame("상품출고");
		label = new JLabel[] {new JLabel("이름"),new JLabel("창고위치"),new JLabel("출고일")};
		panel = new JPanel[] {new JPanel(),new JPanel(),new JPanel(),new JPanel()};
		btn = new JButton [] {new JButton("상품등록"),new JButton("재고확인"),new JButton("상품출고"),new JButton("출고확인")
							 ,new JButton("홈"),new JButton("선택"),new JButton("초기화"),new JButton("출고")};
		text = new JTextField[] {new JTextField(),new JTextField(),new JTextField()};
		column = new Object[] {"창품명","창고","입고일","수량"};
		rowData = new Object[][] {};
//		defaultTableModel = new DefaultTableModel(rowData,column);
		defaultTableModel = new DefaultTableModel[] {new DefaultTableModel(rowData,column),new DefaultTableModel(rowData,column)};
//		table = new JTable(defaultTableModel);
		table = new JTable[] {new JTable(defaultTableModel[0]),new JTable(defaultTableModel[1])};
//		scrollpane = new JScrollPane(table);
		scrollpane = new JScrollPane[] {new JScrollPane(table[0]),new JScrollPane(table[1])};
	}
	
	public void show() {
		//panel[0]
		panel[0].setBounds(0, 0, 1000, 50);
		panel[0].setLayout(null);
		
		panel[0].add(btn[0]);
		btn[0].setBounds(10, 10, 150, 30); //상품등록 
		panel[0].add(btn[1]);
		btn[1].setBounds(180, 10, 150, 30); //재고확인  
		panel[0].add(btn[2]);
		btn[2].setBounds(350, 10, 150, 30); //재고출고 
		btn[2].setEnabled(false);
		panel[0].add(btn[3]);
		btn[3].setBounds(520, 10, 150, 30); //출고확인
		panel[0].add(btn[4]);
		btn[4].setBounds(920, 10, 50, 30); //홈
		
		//panel[1]
		panel[1].setBounds(0, 70, 1000, 500);
		panel[1].setLayout(new GridLayout(2,1));
		panel[1].add(panel[2]);
		panel[1].add(panel[3]);
		
		//panel[2]
		panel[2].setLayout(null);
		panel[2].add(scrollpane[0]);
		
		//label
		panel[2].add(label[0]); //이름
		label[0].setBounds(720, 10, 50, 30);
		panel[2].add(label[1]); //창고위치
		label[1].setBounds(720, 70, 50, 30);
		panel[2].add(label[2]); //출고일
		label[2].setBounds(720, 130, 50, 30);
		
		//text
		scrollpane[0].setBounds(10, 10, 700, 200);
		panel[2].add(text[0]); //이름
		text[0].setBounds(790, 10, 180, 30);
		panel[2].add(text[1]); //창고위치
		text[1].setBounds(790, 70, 180, 30);
		panel[2].add(text[2]); //출고일
		text[2].setBounds(790, 130, 180, 30);
		panel[2].add(btn[5]); //선택
		btn[5].setBounds(720, 180, 250, 30);
		
		//panel[3]
		panel[3].add(scrollpane[1]); //table 2개 생성해야하는데 어떻게???
		panel[3].setLayout(null);
		scrollpane[1].setBounds(10, 10, 700, 200);
		panel[3].add(btn[6]); //초기화
		btn[6].setBounds(720, 130, 250, 30);
		panel[3].add(btn[7]); //출고
		btn[7].setBounds(720, 180, 250, 30);
		
		
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
//		new Pro_Delete().show();
//	}
}

package 포트폴리오;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UserUpdate {
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JTable table; 
	Object[] columnNames; 
	Object[][] rowData; 
	JScrollPane scpane;
	
	public UserUpdate() {
		frame = new JFrame();
		btn = new JButton[3];
		btn[0] = new JButton("수정");
		btn[1] = new JButton("계정삭제");
		btn[2] = new JButton("홈");
		panel = new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
		};
		columnNames = new String[] { "No", "NAME" ,"Price"};
		rowData = new Object[][] {{1,"김준형1",100},{2,"김준형2",200},{3,"김준형3",300} };
		table = new JTable(rowData, columnNames);
		scpane = new JScrollPane(table);
	}
	public void show() {
		//panel[0]
		panel[0].setLayout(new FlowLayout(0));
		panel[0].add(btn[0]);
		panel[0].add(btn[1]);
		//panel[1]
		panel[1].setLayout(new FlowLayout(0));
		panel[1].add(btn[2]);
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		//panel[2]
		panel[2].setLayout(new GridLayout(1,2));
		panel[2].add(panel[0]);
		panel[2].add(panel[1]);
		//panel[3]
		panel[3].add(scpane);
		//frame 셋팅
		frame.add(panel[2]);
		frame.add(panel[3]);
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(2,1));
	}
}

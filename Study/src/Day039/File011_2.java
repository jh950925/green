package Day039;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Gui{
	JFrame frame;
	JPanel[] panel;
	JLabel[] label;
	JButton[] btn;
	JTextField[] text;
	
	public Gui() {
		frame = new JFrame("::::File");
		label = new JLabel[6];
		label[0] = new JLabel("JAVA SCORE");
		label[1] = new JLabel("ID");
		label[2] = new JLabel("JAVA");
		label[3] = new JLabel("JSP");
		label[4] = new JLabel("SPRING");
		label[5] = new JLabel("PROJECT");
		btn = new JButton[3];
		btn[0] = new JButton("1)성적입력");
		btn[1] = new JButton("2)성적확인");
		btn[2] = new JButton("전체 성적확인");
		text = new JTextField[5];
		for(int i=0; i<5; i++) {
			text[i] = new JTextField();
		}
		panel = new JPanel[3];
		for(int i=0; i<3; i++) {
			panel[i] = new JPanel();
		}
	}//end GUi
	
	public void show() {
		//panel[0]
		panel[0].setPreferredSize(new Dimension(400,100));
		panel[0].add(label[0]);
		label[0].setBorder(BorderFactory.createEmptyBorder(60 , 10 , 60 , 10));
		/////////////////////////////////////////////////
		//panel[1]
		panel[1].setLayout(null);
		panel[1].setPreferredSize(new Dimension(400,300));
		//1
		panel[1].add(label[1]); 
		panel[1].add(text[0]);
		label[1].setBounds(20, 0, 50, 30);
		text[0].setBounds(150, 0, 150, 30);
		//2
		panel[1].add(label[2]);
		panel[1].add(text[1]);
		label[2].setBounds(20, 35, 50, 30);
		text[1].setBounds(150, 35, 150, 30);
		//3
		panel[1].add(label[3]); 
		panel[1].add(text[2]);
		label[3].setBounds(20, 70, 50, 30);
		text[2].setBounds(150, 70, 150, 30);
		//4
		panel[1].add(label[4]);
		panel[1].add(text[3]);
		label[4].setBounds(20, 105, 50, 30);
		text[3].setBounds(150, 105, 150, 30);
		//5
		panel[1].add(label[5]);
		panel[1].add(text[4]);
		label[5].setBounds(20, 140, 50, 30);
		text[4].setBounds(150, 140, 150, 30);
		/////////////////////////////////////////////////
		//panel[2]
		panel[2].setLayout(new GridLayout(1,3));
		panel[2].setPreferredSize(new Dimension(400,200));
		for(int i=0; i<btn.length;i++) {
			panel[2].add(btn[i]);
		}
		for(int i=0; i<btn.length;i++) {
			btn[i].setBackground(Color.DARK_GRAY);
			btn[i].setForeground(Color.white);
		}
		/////////////////////////////////////////////////
		//panel frame 부착
		for(int i=0; i<3; i++) {
			frame.add(panel[i]);
		}
		frame.setLayout(new GridLayout(3,1));
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}//end class

public class File011_2 {
	public static void main(String[] args) {
		new Gui().show();
	}
}

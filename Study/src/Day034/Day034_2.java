package Day034;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class gui034_2 implements ActionListener{
	JFrame frame;
	JButton[] btn;
	String[] str = {"one","two","three","four","five"};
	
	public gui034_2() {
		frame = new JFrame("BOX");
		btn = new JButton[5];
		for(int i=0; i<btn.length; i++) { 
			btn[i] = new JButton(str[i]);
//			btn[0] = new JButton("one");
//			btn[1] = new JButton("two");
//			btn[2] = new JButton("three");
//			btn[3] = new JButton("four");
//			btn[4] = new JButton("five");
		}
	}
	public void show() {
		btn[0].setBackground(Color.blue);
		btn[1].setBackground(Color.CYAN);
		btn[2].setBackground(Color.LIGHT_GRAY);
		btn[3].setBackground(Color.pink);
		btn[4].setBackground(Color.red);
		
		for(int i=0; i<btn.length;i++) {
			btn[i].setFont(new Font(Font.SERIF, Font.BOLD, 25));
			btn[i].setPreferredSize(new Dimension(120,120)); 
			btn[i].setForeground(Color.black);
			btn[i].addActionListener(this);
		}
		
		for(int i=0; i<btn.length; i++) {
			frame.add(btn[i]);
		}
		frame.setLayout(new FlowLayout());
		frame.setSize(700,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btn.length; i++) {
			if(e.getSource().equals(this.btn[i])) {
				JOptionPane.showMessageDialog(null, this.btn[i].getText());
			}
		}
	}
}

public class Day034_2 {
	public static void main(String[] args) {
		new gui034_2().show();
	}
}

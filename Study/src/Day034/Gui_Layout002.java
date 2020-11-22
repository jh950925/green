package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Layout2 implements ActionListener{
	JFrame frame;
	JButton[] btn;
	String[] str = {"one","two","three","four","five"};
	
	public Layout2() {
		frame = new JFrame("BOX");
		btn = new JButton[5];
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(str[i]);
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
			btn[i].setForeground(Color.black);
			btn[i].addActionListener(this);
		}
		
		frame.setLayout(new BorderLayout());
		frame.add(btn[0], BorderLayout.NORTH);
		frame.add(btn[1], BorderLayout.EAST);
		frame.add(btn[2], BorderLayout.WEST);
		frame.add(btn[3], BorderLayout.SOUTH);
		frame.add(btn[4], BorderLayout.CENTER);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

public class Gui_Layout002 {
	public static void main(String[] args) {
		new Layout2().show();
	}
}

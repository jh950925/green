package Day033;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Event implements ActionListener{
	JFrame frame;
	JButton[] btn;
	String []name = {"하나","둘","셋","넷","다섯"};
	
	public Event() {
		frame = new JFrame("BOX");
		btn = new JButton[5];
		btn[0] = new JButton("ONE");
		btn[1] = new JButton("TWO");
		btn[2] = new JButton("THREE");
		btn[3] = new JButton("FOUR");
		btn[4] = new JButton("FIVE"); 
	}
	public void show() { 
		//btn색상
		btn[0].setBackground(new Color(245,100,114));
		btn[1].setBackground(new Color(100,100,245));
		btn[2].setBackground(new Color(209,245,100));
		btn[3].setBackground(new Color(245,125,100));
		btn[4].setBackground(new Color(189,100,245));
		
		for(int i=0; i<btn.length;i++) {
			btn[i].setFont(new Font(Font.SERIF, Font.BOLD, 25));
			btn[i].setPreferredSize(new Dimension(120,120));
			btn[i].addActionListener(this);
			btn[i].setForeground(Color.GREEN);
		}
		frame.setLayout(new FlowLayout());
		for(int i=0; i<btn.length;i++) {
			frame.add(btn[i]);
		}
		frame.setSize(700,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}//end show()
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		for(int i=0; i<btn.length;i++) {
			if(e.getSource().equals(this.btn[i])) {
				JOptionPane.showMessageDialog(null, this.btn[i].getText());
				this.btn[i].setText(name[i]);
			}
		}
	}//end actionPerformed
}//end Event
////////////////////////////////////////////////////////////////////////////
public class Event001 {
	public static void main(String[] args) {
		new Event().show();
	} 
}

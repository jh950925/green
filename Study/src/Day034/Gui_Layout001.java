package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Layout1 implements ActionListener{
	JFrame frame;
	JButton[] btn;
	String[] str = {"one","two","three","four","five","six"};
	JPanel panel;
	
	public Layout1() {
		frame = new JFrame("BOX");
		btn = new JButton[6];
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(str[i]); 
		}
		panel = new JPanel();
	} 
	public void show() {
		panel.setLayout(new FlowLayout());
		panel.add(btn[4]);
		panel.add(btn[5]);
		
		btn[0].setBackground(Color.blue);
		btn[1].setBackground(Color.CYAN);
		btn[2].setBackground(Color.LIGHT_GRAY);
		btn[3].setBackground(Color.pink);
		btn[4].setBackground(Color.red);
		btn[5].setBackground(Color.YELLOW);
		
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
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(700,200);
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

public class Gui_Layout001 {
	public static void main(String[] args) {
		new Layout1().show();
	}
}

package Day048;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Db_Frame {
	JFrame frame;
	JTextField text;
	JButton btn;
	JLabel label;
	JPanel panel;
	
	public Db_Frame() {
		panel = new JPanel();
		frame = new JFrame("JDBC_GUI");
		text = new JTextField();
		btn = new JButton("::::[1] Jdbc_Gui-Create Table");
		label = new JLabel("[1] Jdbc_Gui-Create Table",JLabel.CENTER);
	}
	
	public void show() {
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setForeground(Color.white);
		panel.add(label);
		frame.setLayout(new GridLayout(3,1));
		frame.add(panel);
		frame.add(text);
		frame.add(btn);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

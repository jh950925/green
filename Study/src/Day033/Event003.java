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

class Event3 implements ActionListener{
	JFrame frame;
	JButton btn;
	
	public Event3() {
		frame = new JFrame("BOX");
		btn = new JButton("홍길동"); 
	}
	public void show() {
		btn.setBackground(new Color(245,100,114));
		btn.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		btn.setPreferredSize(new Dimension(150,50));
		btn.addActionListener(this);
		 
		frame.add(btn);
		frame.setLayout(new FlowLayout());
		frame.setSize(400,200); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Hello!"+this.btn.getText());
		if(e.getSource().equals(this.btn)) {
			this.btn.setText("Hellow!"+this.btn.getText());
			this.btn.setPreferredSize(new Dimension(300,50));
		}
	}
}

public class Event003 {
	public static void main(String[] args) {
		new Event3().show();
	}
}

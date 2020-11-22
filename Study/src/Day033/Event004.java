package Day033;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Event4 implements ActionListener{
	JFrame frame; 
	JButton btn;
	JLabel label;
	JTextField text;
	static boolean first=true;
	public Event4() {
		frame = new JFrame("Components");
		btn = new JButton("CLICK");
		label = new JLabel("주문할 우유이름을 적으시오.",JLabel.CENTER);
		text = new JTextField("");
	}
	public void show() {
		label.setPreferredSize(new Dimension(170,100));
		text.setPreferredSize(new Dimension(250,100));
		text.setFont(new Font(Font.SERIF, Font.BOLD, 25)); 
		btn.setSize(new Dimension(200,100)); 
		btn.setBackground(Color.green);
		btn.addActionListener(this);
		btn.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		
		frame.setLayout(new GridLayout());
		frame.add(label);
		frame.add(text);
		frame.add(btn);
		frame.setSize(600,160);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String temp = "MILK~!";
		if(this.text.getText() != null && first == true) {
			this.text.setText(this.text.getText()+temp);
			first=false;
		}
	}
}

public class Event004 {
	public static void main(String[] args) {
		new Event4().show();
	}
}

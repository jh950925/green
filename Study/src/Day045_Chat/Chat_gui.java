package Day045_Chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat_gui {
	JFrame frame;
	TextArea textarea;
	JPanel panel; 
	JTextField text;
	JButton btn;
	public Chat_gui() {
		frame = new JFrame("Java Talk");
		textarea = new TextArea();
		panel = new JPanel();
		text = new JTextField(20);
		btn = new JButton("전송");
	}
	
	public void show(){
		frame.setLayout(new BorderLayout());
		frame.add(textarea,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout());
		panel.add(text);
		panel.add(btn);
		
		text.setMargin(new Insets(4,4,4,4));
		btn.setBackground(Color.DARK_GRAY);
		btn.setForeground(Color.LIGHT_GRAY);
		
		frame.setVisible(true);
		frame.setSize(400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

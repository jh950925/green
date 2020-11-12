package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Ex_layout2_2  implements ActionListener{
	JFrame frame;
	JButton btn;
	JTextField text;
	JTextArea area;
	JPanel panel;
	JScrollPane scpanel;
	
	public Ex_layout2_2(){
		area = new JTextArea("",25,5);
		frame = new JFrame("UserId");
		btn = new JButton("입력");
		text = new JTextField("",20); 
		panel = new JPanel();
		scpanel = new JScrollPane();
	}
	public void show() {
		btn.setBackground(Color.black);
		btn.setForeground(Color.white);
		btn.addActionListener(this);
		area.setSize(new Dimension(400,300));
		scpanel.setViewportView(area);
		scpanel.setEnabled(false);
		
		panel.add(text);
		panel.add(btn);
		
		frame.setLayout(new BorderLayout());
		frame.add(scpanel, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			String str = this.text.getText();
			this.area.append(str + "\n");
			this.text.setText("");
	}
}

public class Ex002_2 {
	public static void main(String[] args) {
		new Ex_layout2_2().show();
	}
}

package Day044_Chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NetFrame2{
	JFrame frame;
	JTextField[] text;
	JButton[] btn;
	JPanel[] panel;
	JLabel label;
	TextArea area;
	String a;

	public NetFrame2() {
		panel = new JPanel[] { new JPanel(), new JPanel(), new JPanel() };
		frame = new JFrame("client");
		text = new JTextField[] { new JTextField(), new JTextField("", 20) };
		btn = new JButton[] { new JButton("전송"), new JButton("닫기") };
		label = new JLabel("" , JLabel.RIGHT);
		area = new TextArea();
	}

	public void show() {
		label.setForeground(Color.white);
		panel[0].add(label);
		panel[0].setPreferredSize(new Dimension(400, 30));
		panel[0].setBackground(Color.DARK_GRAY);

		panel[1].add(area);

		panel[2].setLayout(new FlowLayout());
		panel[2].add(text[1]);
		panel[2].add(btn[0]);
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str = text[1].getText();
				area.append(str + "\n");
				text[1].setText("");
			}
		});
		panel[2].add(btn[1]);

		frame.setSize(450, 300);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(2, 1));
		frame.add(panel[0], BorderLayout.NORTH);
		frame.add(panel[1], BorderLayout.CENTER);
		frame.add(panel[2], BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class NetWork_Frame_Client2 {
	public static void main(String[] args) {
		
	}
}

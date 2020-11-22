package Day037;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Gui024 implements ActionListener{
	JFrame frame;
	JLabel label;
	JComboBox<String> combobox;
	String [] items;
	///////////////////////////////////////////////////////////////////////////
	public Gui024() {
		frame = new JFrame("COMBOBOX");
		label = new JLabel(new ImageIcon());
		items = new String[] {"네오","무지","제이지"};
		combobox = new JComboBox<String>(items);
	}
	///////////////////////////////////////////////////////////////////////////
	public void show() {
		combobox.addActionListener(this);
		frame.add(label);
		frame.add(combobox);
		frame.setLayout(new FlowLayout());
		frame.setSize(700, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<items.length;i++) {
			if (combobox.getSelectedItem().equals(items[i])) {
				label.setIcon(new ImageIcon("images/kakao001.png"));
			}
			else if (combobox.getSelectedItem().equals(items[i])) {
				label.setIcon(new ImageIcon("images/kakao002.png"));
			}
			else if (combobox.getSelectedItem().equals(items[i])) {
				label.setIcon(new ImageIcon("images/kakao003.png"));
			}
		}
	}
}
///////////////////////////////////////////////////////////////////////////
public class Gui_IMG003 {
	public static void main(String[] args) {
		new Gui024().show();
	}
}

package Day037;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Gui023 implements ActionListener{
	JFrame frame;
	JLabel label;
	JComboBox<String> combobox;
	String [] items;
	///////////////////////////////////////////////////////////////////////////
	public Gui023() {
		frame = new JFrame("COMBOBOX");
		label = new JLabel(new ImageIcon("항목선택"));
		items = new String[] {"====","one","two","three"};
		combobox = new JComboBox<String>(items);
	}
	///////////////////////////////////////////////////////////////////////////
	public void show() {
		combobox.addActionListener(this);
		frame.add(label);
		frame.add(combobox);
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 80);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		for(int i=0; i<items.length;i++) {
			if(items[i].equals(combobox.getSelectedItem())) {
				JOptionPane.showMessageDialog(null, items[i]);
			}
		}
	}
}
///////////////////////////////////////////////////////////////////////////
public class Gui_IMG002 {
	public static void main(String[] args) {
		new Gui023().show();
	}
}

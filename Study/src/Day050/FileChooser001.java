package Day050;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FileChooserBasic{
	JFrame frame;
	JLabel label;
	JFileChooser fileChooser;
	JButton btn;
	
	public FileChooserBasic() {
		frame = new JFrame("파일입출력");
		label = new JLabel();
		fileChooser = new JFileChooser();
		btn = new JButton("파일선택  ");
	}
	
	public void show() {
		frame.setLayout(new GridLayout(2,1));
		frame.add(label);
		frame.add(btn);
		btn.setBackground(Color.DARK_GRAY);
		btn.setForeground(Color.LIGHT_GRAY);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int result = fileChooser.showOpenDialog(frame);
				System.out.println(result);
				if(result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					label.setText(""+selectedFile);
				}
			}
		});
		frame.setSize(600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class FileChooser001 {
	public static void main(String[] args) {

		new FileChooserBasic().show();
		
	}
}

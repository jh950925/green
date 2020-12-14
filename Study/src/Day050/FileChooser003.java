package Day050;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FileChooserBasic3{
	JFrame frame;
	JLabel label;
	JFileChooser fileChooser;
	JButton btn;
	
	public FileChooserBasic3() {
		frame = new JFrame("파일입출력");
		label = new JLabel();
		fileChooser = new JFileChooser();
		btn = new JButton("파일선택  ");
	}
	
	public void show() {
		frame.setLayout(new BorderLayout());
		frame.add(label,BorderLayout.CENTER);
		frame.add(btn,BorderLayout.NORTH);
		btn.setBackground(Color.DARK_GRAY);
		btn.setForeground(Color.LIGHT_GRAY);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int result = fileChooser.showOpenDialog(frame);
				System.out.println(result);
				if(result == JFileChooser.APPROVE_OPTION) {
					try {
						File selectedFile = fileChooser.getSelectedFile();
						BufferedImage bi = ImageIO.read(selectedFile);
						System.out.println(selectedFile.toString());
						System.out.println("그림 위치 찾기"+selectedFile.toString().lastIndexOf("\\"));
						int start = selectedFile.toString().lastIndexOf("\\");
						String saved = selectedFile.toString().substring(start);
						File upload = new File("D:/" + saved);
						ImageIO.write(bi, "jpg", upload);
						label.setIcon(new ImageIcon("D:/" + saved));
					} catch (IOException e) { e.printStackTrace(); } //파일 읽기
				}
			}
		});
		frame.setSize(600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class FileChooser003 {
	public static void main(String[] args) {
		new FileChooserBasic3().show();
	}
}

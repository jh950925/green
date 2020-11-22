package Day032_GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui5{
	JFrame frame;
	JButton[] button;
	
	public Gui5(){
		frame = new JFrame("Property");
		button = new JButton[] {new JButton("Color"),
							new JButton("Font"), 
							new JButton("Cursor"),
							new JButton("Enabled"),
							new JButton("Btn-Size")};
	} 
	public void create() {
		///////////////////////////////////////////////////////////////////
		//1.배경색 + 글자 색상 => 
		button[0].setBackground(Color.DARK_GRAY);
		button[0].setForeground(Color.LIGHT_GRAY); 
		//2.Font
		button[0].setFont(new Font(Font.SERIF, Font.BOLD, 15));
		button[1].setFont(new Font(Font.DIALOG, Font.ITALIC, 40));
		//button[2] 폰트설정:seriF, 굵게, 20
		button[2].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		//3.cursor
		button[0].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		button[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		//4.비활성화
		//세번째 버튼 못누르게
		button[2].setEnabled(false);
		//5.버튼사이즈
		//100*120
		button[4].setPreferredSize(new Dimension(100,120));
		//6.프레임 사이즈 고정
		frame.setResizable(false);
		
		///////////////////////////////////////////////////////////////////
		frame.setLayout(new FlowLayout());
		for(int i=0; i<button.length;i++) { frame.add(button[i]); }
		frame.setSize(700,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class GUI005 {
	public static void main(String[] args) {
		new Gui5().create();
	}
}

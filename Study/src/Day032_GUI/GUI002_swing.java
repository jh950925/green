package Day032_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui002{
	//멤버변수
	JFrame frame;
	JButton button;
	
	//생성자
	public Gui002() {
		frame = new JFrame("BOX");
		button = new JButton("Button");
	}
	//멤머함수 
	public void create() {
		//1. frame.add(컴포넌트) - 다형성 [부모는 자식을 담을 수 있다]
		frame.add(button);
		//2. frame.setsize 사이즈 지정  
		frame.setSize(300, 300);
		//3. frame.setVisible
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
//////////////////////////////////////////////////////
public class GUI002_swing {
	public static void main(String[] args) {
		new Gui002().create();
	}
}

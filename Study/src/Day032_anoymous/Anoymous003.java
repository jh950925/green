package Day032_anoymous;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//////////////////////////////////////////////////
class AnoyEvent003{
	//멤버변수
	JFrame frame; 
	JButton button;
	//생성자
	public AnoyEvent003() {
		frame  = new JFrame("Test");
		button = new JButton("btn");
	} 
	//멤버함수 
 
	public void createGraphic() {
		button.setPreferredSize(new Dimension(250,100));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.pink);
		button.setFont(new Font(Font.SANS_SERIF, Font.BOLD,25));
		button.setText("Count");
		///////////////////////
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.setSize(300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//버튼에 이벤트 열기
		//이벤트대상.
		button.addActionListener(new ActionListener(){ //이벤트 핸들러
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "클릭");
			}
		});
		
	}
}
//////////////////////////////////////////////////
public class Anoymous003 {
	public static void main(String[] args) {

		System.out.println("위의 EventHandler를 익명 클래스로 변경하시오");
		new AnoyEvent003().createGraphic();
		
	}//end main
}//end class

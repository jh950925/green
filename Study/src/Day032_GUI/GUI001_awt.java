package Day032_GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Gui001{
	//멤버변수
	Frame frame;		
	Button button;
	//멤버함수
	public void create() {
		//1. frame.add(컴포넌트) - 다형성 [부모는 자식을 담을 수 있다]
		frame.add(button);
		//2. frame.setsize 사이즈 지정
		frame.setSize(300, 300); 
		//3. frame.setVisible
		frame.setVisible(true);
		//이벤트대상.이벤트(해결사 : 이벤트핸들러 ~ 이렇게 처리해줄께)
		frame.addWindowListener(new WindowListener () {
			@Override public void windowActivated(WindowEvent arg0) {  }
			@Override public void windowClosed(WindowEvent arg0) {  }
			@Override public void windowClosing(WindowEvent arg0) {System.exit(0);}
			@Override public void windowDeactivated(WindowEvent arg0) {  }
			@Override public void windowDeiconified(WindowEvent arg0) {  }
			@Override public void windowIconified(WindowEvent arg0) {  }
			@Override public void windowOpened(WindowEvent arg0) {  }
			
		});
		
	}
	//생성자
	public Gui001(){ 
		frame = new Frame("BOX");
		button = new Button("BTN1");
	}
	
}

public class GUI001_awt {
	public static void main(String[] args) {
		new Gui001().create();
	}
}

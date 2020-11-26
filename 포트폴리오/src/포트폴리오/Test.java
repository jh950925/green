package 포트폴리오;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ImgTest{
	JFrame frame;
	JLabel label;
	ImageIcon icon;
	public ImgTest() {
		frame = new JFrame();
		icon = new ImageIcon("img\\aa.jpg");
		Image orignImg = icon.getImage();
		Image changeImg = orignImg.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		icon = new ImageIcon(changeImg );
		label = new JLabel(  icon );
	}
	public void create() {
		frame.add(label);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
//있는데 저거는 제가 자른거라서 잠시만요 아 다른거 받아와야 하나봐요 저거 자른거라서..
//그러면 저는 패널에 넣으려고 했는데 패널 사이즈를 직접 설정을 해야하나요?
//아 그리고 제가 어제 하던게
public class Test {

	public static void main(String[] args) {
		new ImgTest().create();
	}

}

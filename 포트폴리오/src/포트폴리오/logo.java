package 포트폴리오;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Gui_logo{
	JFrame frame;
	JButton[] btn;
	JPanel[] panel;
	JLabel[] label;
	JTextField text;
	JPasswordField passtext;
	UserInfo userinfo;
	public Gui_logo(){
		userinfo = new UserInfo();
		///////////////////
		frame = new JFrame();
		text = new JTextField();
		passtext = new JPasswordField();
		btn = new JButton[] {
							new JButton("회원가입"),
							new JButton("계정찾기"),
							new JButton("로그인"),
							new JButton("종료"),};
		panel = new JPanel[] {
							  new JPanel(),
							  new JPanel(),
							  new JPanel(),
							  new JPanel()};
		label = new JLabel[] {
							  new JLabel("(주)하랑"),
							  new JLabel(new ImageIcon("Img/cat.jpg")),
							  new JLabel("ID"),
							  new JLabel("PASS")};
	}
//	btn[0]   - 회원가입   btn[1]   - 계정찾기
//	btn[2]   - 로그인		btn[3]   - 종료
//	label[0] - 회사명		label[0] - 이미지
//	label[0] - id		label[0] - pass
	public void show() {
		//panel 셋팅
		//0
		panel[0].add(label[0]); 
		panel[0].setBounds(10, 10, 460, 30); //(주)하랑 위치
		//1
		panel[1].setBounds(10, 60, 460, 290); //패널1 위치
		panel[1].add(panel[2]);				  
		panel[1].add(panel[3]);
		panel[1].setLayout(null);
		//이미지 라벨 
		panel[2].setBounds(10, 0, 180, 290);   //패널2 위치
		panel[2].add(label[1]);
		label[1].setPreferredSize(new Dimension(180,290));
		//이미지 크기 라벨에 맞게
		//3
		panel[3].setBounds(210, 0, 260, 270); //패널3 위치
		panel[3].setLayout(null);			  
		label[2].setBounds(10, 30, 50, 15);   //id   라벨 위치
		label[3].setBounds(10, 80, 50, 15);   //pass 라벨 위치
		text.setBounds(70, 30, 160, 20);   //id   텍스트 필드 위치
		passtext.setBounds(70, 80, 160, 20);   //pass 텍스트 필드 위치
		passtext.setEchoChar('*');
		//패널에 추가
		panel[3].add(label[2]);
		panel[3].add(text);
		panel[3].add(label[3]);
		panel[3].add(passtext);
		for(int i=0; i<btn.length;i++) {
			panel[3].add(btn[i]);
		}
		//버튼 디자인
		btn[0].setBounds(15, 140, 220, 25);
		btn[1].setBounds(15, 180, 100, 25);
		btn[2].setBounds(135, 180, 100, 25);
		btn[3].setBounds(15, 220, 220, 25);
		///////////////////////////////////////////////////
		//회원가입
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserCreate( ).show();
			}
		});
		//계정찾기
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserFind().show();
			}
		});
		//로그인
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1 : " + userinfo);
				System.out.println("2 : " + userinfo.getPass());
				System.out.println("3 : " + userinfo.getId());
				//왜 회원가입에서는 조회가 가능한데 로고에서 받아오는건 안될까???
//				if(text.getText().equals(userInfo.getId()) && passtext.getPassword().equals(userInfo.getPass())) {
					new Main().show();
					frame.dispose();
//				}else {
//					JOptionPane.showMessageDialog(null, "계정을 다시 확인해 주세요");
//				}
			}
		});
		//종료
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		///////////////////////////////////////////////////
		//frame 셋팅
		frame.setLayout(null);
		frame.add(panel[0]);
		frame.add(panel[1]);
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}

public class logo {
	public static void main(String[] args) {
		new Gui_logo().show();
	}
}

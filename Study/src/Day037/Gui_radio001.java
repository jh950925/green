package Day037;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Gui025{
	JPanel[] panel;
	JFrame frame;
	JLabel[] label;
	JCheckBox[] chkbox;
	JRadioButton[] radiobtn;
	ButtonGroup btngroup;
	public Gui025(){
		btngroup = new ButtonGroup();
		panel = new JPanel[] {new JPanel(new GridLayout(3,1)),new JPanel(new GridLayout(2,1))};
		frame = new JFrame("CHKBOX(다중선택)+RADIO(단일선택)");
		label = new JLabel[] {new JLabel("chkbox"),new JLabel("radio")};
		chkbox = new JCheckBox[] {new JCheckBox("JAVA",false),new JCheckBox("JSP",false),new JCheckBox("SPRING",false)};
		radiobtn = new JRadioButton[] {new JRadioButton("이메일 수신에 동의합니다.",true),new JRadioButton("이메일 수신에 동의하지 않습니다.",false)};
	}
	public void show() {
		/*
				1	2	[chkbox,chkbox]
				3	4	
		 */
		//1.체크박스에 클릭 이벤트 만들기
		for(int i=0; i<chkbox.length;i++) {
			chkbox[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0; i<chkbox.length;i++) {
						if(e.getSource().equals(chkbox[i])) {
							JOptionPane.showMessageDialog(null, chkbox[i].getText());
						}
					}
				}
			});
		}
		for(int i=0; i<radiobtn.length;i++) {
			btngroup.add(radiobtn[i]);
		}
		frame.setLayout(new GridLayout(2,2));
		panel[0].add(chkbox[0]); panel[0].add(chkbox[1]); panel[0].add(chkbox[2]);
		panel[1].add(radiobtn[0]); panel[1].add(radiobtn[1]); 
		
		frame.add(label[0]); frame.add(panel[0]);    
		frame.add(label[1]); frame.add(panel[1]); 
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui_radio001 {
	public static void main(String[] args) {
		new Gui025().show();
	}
}

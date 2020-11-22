package Day034_CollectionGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Collection_Using implements ActionListener {
	Vector<String> model;
	CollectionGui gui;

	public Collection_Using() {
		model = new Vector<String>();
		gui = new CollectionGui();
		gui.show();
		for (int i = 0; i < gui.btn.length; i++) {
			gui.btn[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(gui.btn[0])) {
			if (gui.textArea.getText() != null) {
				if (gui.textArea.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "빈칸입니다. 확인해 주세요");
				} else {
					model.add(gui.textArea.getText());
					JOptionPane.showMessageDialog(null, gui.textArea.getText() + "를 추가했습니다.");
				}
			}
			gui.textArea.setText("");
		} else if (e.getSource().equals(gui.btn[3])) {
			String result = "";
			for (int i = 0; i < model.size(); i++) {
				result += "[" + i + "] " + model.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, result);
		} else if (e.getSource().equals(gui.btn[1])) {
			if (gui.textArea.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "원하는 단어의 번호를 입력해주세요.");
			} else {
				JOptionPane.showMessageDialog(null, model.get(Integer.parseInt(gui.textArea.getText())));
				gui.textArea.setText("");
			}
		} else if (e.getSource().equals(gui.btn[2])) {
			if (gui.textArea.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "원하는 단어의 번호를 입력해주세요.");
			} else {
				model.remove(Integer.parseInt(gui.textArea.getText())); 
				JOptionPane.showMessageDialog(null, model);
				gui.textArea.setText("");
			}
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////
class CollectionGui {
	JFrame frame;
	JPanel[] panel;
	JButton[] btn;
	JTextArea textArea;
	JLabel label;

	////////////////////////////////////////////////////////
	public CollectionGui() {
		panel = new JPanel[3];
		frame = new JFrame("COLLECTION-VERTICAL");
		btn = new JButton[4];
		btn[0] = new JButton("ADD");
		btn[1] = new JButton("GET");
		btn[2] = new JButton("REMOVE");
		btn[3] = new JButton("SHOW-ALL");
		textArea = new JTextArea("", 10, 25);
		label = new JLabel("COLLECTION", JLabel.CENTER);
		panel = new JPanel[3];
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new JPanel();
		}
	}

	////////////////////////////////////////////////////////
	public void show() {
		// panel에 부작
		panel[0].add(label);
		panel[1].add(textArea);
		for (int i = 0; i < btn.length; i++) {
			panel[2].add(btn[i]);
		}
		// 버튼들 3번째 레이아웃 grid 설정
		panel[2].setLayout(new GridLayout(4, 1));

		// panel들 전체 frame에 부착
		frame.setLayout(new GridLayout(3, 1));
		for (int i = 0; i < panel.length; i++) {
			frame.add(panel[i]);
		}

		// 색상
		panel[0].setBackground(Color.black);
		panel[1].setBackground(Color.black);
		panel[2].setBackground(Color.black);
		for (int i = 0; i < btn.length; i++) {
			btn[i].setBackground(Color.black);
			btn[i].setForeground(new Color(255, 0, 255));
			btn[i].setFont(new Font(Font.SERIF, Font.BOLD, 15));
		}
		label.setForeground(Color.white);
		label.setFont(new Font(Font.SERIF, Font.BOLD, 15));

		// 여백
		panel[0].setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));
		panel[1].setBorder(BorderFactory.createEmptyBorder(10, 5, 0, 0));
		panel[2].setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

		frame.setSize(300, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Main_Gui {
	public static void main(String[] args) {
		Collection_Using a = new Collection_Using();
		a.gui.show();
	}
}

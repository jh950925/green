package Silgi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Guisilgi1{
	JFrame frame;
	JButton[] btn;
	
	public Guisilgi1() {
		frame = new JFrame();
		btn = new JButton[5];
		btn[0] = new JButton("ONE");
		btn[1] = new JButton("TWO");
		btn[2] = new JButton("THREE");
		btn[3] = new JButton("FOUR");
		btn[4] = new JButton("FIVE");
		
	}
	public void show() {
		for(int i=0; i<btn.length;i++) {
			btn[i].setBackground(Color.black);
			btn[i].setForeground(Color.white);
			btn[i].setPreferredSize(new Dimension(100,100));
		}
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "ONE");
				btn[0].setBackground(Color.black);
			}
		});
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "TWO");
				btn[1].setBackground(Color.red);
			}
		});
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "THREE");
				btn[2].setBackground(Color.green);
			}
		});
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "FOUR");
				btn[3].setBackground(Color.blue);
			}
		});
		btn[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "FIVE");
				btn[4].setBackground(Color.white);
				btn[4].setForeground(Color.black);
			}
		});
		
		for(int i=0; i<btn.length;i++) {
			frame.add(btn[i]);
		}
		frame.setLayout(new FlowLayout());
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class silgi_2020_11_12 {
	public static void main(String[] args) {
		new Guisilgi1().show();
	}
}

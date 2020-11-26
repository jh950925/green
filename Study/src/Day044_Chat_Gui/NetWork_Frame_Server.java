package Day044_Chat_Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NetFrame{
	JFrame frame;
	JTextField text;
	JButton[] btn;
	JPanel[] panel;
	JLabel label;
	TextArea area;

	public NetFrame() {
		panel = new JPanel[] { new JPanel(), new JPanel(), new JPanel() };
		frame = new JFrame("Chat");
		text = new JTextField("", 20);
		btn = new JButton[] { new JButton("전송"), new JButton("닫기") };
		label = new JLabel("" , JLabel.RIGHT);
		area = new TextArea();
	}

	public void show() {
		label.setForeground(Color.white);
		panel[0].add(label);
		panel[0].setPreferredSize(new Dimension(400, 30));
		panel[0].setBackground(Color.DARK_GRAY);

		panel[1].add(area);

		panel[2].setLayout(new FlowLayout());
		panel[2].add(text);
		panel[2].add(btn[0]);
		panel[2].add(btn[1]);
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		frame.setLocation(500, 100);
		frame.setSize(450, 300);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(2, 1));
		frame.add(panel[0], BorderLayout.NORTH);
		frame.add(panel[1], BorderLayout.CENTER);
		frame.add(panel[2], BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class NetWork_Frame_Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket info = null;;
		NetFrame gui = new NetFrame();
		gui.show();
		
		//1.문열기
		try {
			serverSocket = new ServerSocket(523);
			System.out.println("1. [Server] 서버준비완료\n");
			gui.area.append("1. [Server] 서버준비완료\n");
		} catch (IOException e) { e.printStackTrace(); }
		
		//2. 손님 기다리는중
		System.out.println("2. [Server] 연결요청기다리는중\n");
		gui.area.append("2. [Server] 연결요청기다리는중\n");
		
		try {
			info = serverSocket.accept();
			System.out.println("4.[Server] 연결 요청 들어옴\n");
			gui.area.append("4.[Server] 연결 요청 들어옴\n");
			
			//말하기	(DataOutputStream)
			NetworkGui_Sender sender = new NetworkGui_Sender(info, gui); sender.start();
			//듣기	(DataInputStream)
			NetworkGui_Receiver receiver = new NetworkGui_Receiver(info, gui); receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

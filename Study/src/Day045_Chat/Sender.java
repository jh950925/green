package Day045_Chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Sender extends Thread {
	DataOutputStream out;
	Socket socket;
	String who;
	SimpleDateFormat time;
	Scanner scanner;
	Chat_gui gui;
	
	public Sender() {
		scanner = new Scanner(System.in);
		out = null;
		socket = null;
		who ="";
		time = new SimpleDateFormat("HH:mm:ss");
	}
	public Sender(Socket socket) {
		this(); //#필수
		this.socket = socket;
		try { out = new DataOutputStream(socket.getOutputStream()); } 
		catch (IOException e) { e.printStackTrace(); }
		this.who = (this.socket.getPort() == 523)? "[Client" : "[Server";
	}
	public Sender(Socket socket, Chat_gui gui) { 
		this(socket);
		this.gui = gui;
	}
	

	@Override
	public void run() {
		this.gui.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				while (out != null) {
					try {
						String msg = who + time.format(System.currentTimeMillis()) + "]" + gui.text.getText() + "\n";
						out.writeUTF(msg);// 상대방에게 말하기
						gui.text.setText("");// textField비우고
						gui.textarea.append(msg);// 내화면에 띄우기
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "종료하시겠습니까?");
						break;
					}
					if (gui.text.getText().equals("")) { break; }
				}//end while
			}
		});//end action
	}//end run
}

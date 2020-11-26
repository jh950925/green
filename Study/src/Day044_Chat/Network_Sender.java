package Day044_Chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Network_Sender extends Thread {
	DataOutputStream out;
	Socket socket;
	String who;
	SimpleDateFormat timer;
	
	// 생성자
	public Network_Sender() {
		who = "";
		out = null;
		socket = null;
		timer = new SimpleDateFormat("HH:mm:ss");
	}

	public Network_Sender(Socket socket) {
		this();
		this.socket = socket;
		try {
			this.out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.who = (socket.getPort() == 523) ? "[Client" : "[Server";

	}

	// run
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (out != null) {
			try {
				out.writeUTF(this.who + timer.format(System.currentTimeMillis()) + "]" + scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end while
		scanner.close();
	}// end run
}// end class

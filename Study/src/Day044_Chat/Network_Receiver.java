package Day044_Chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class Network_Receiver extends Thread {
	DataInputStream in;
	Socket socket;

	// 생성자
	public Network_Receiver() {
		in = null;
		socket = null;
	}

	public Network_Receiver(Socket socket) {
		this.socket = socket;
		try {
			this.in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// run
	@Override
	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// end run
}// end class

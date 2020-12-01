package Day045_Chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

class Receiver extends Thread {
	DataInputStream in;
	Socket socket;
	Chat_gui gui;

	public Receiver() {
		in = null;
		socket = null;
	}

	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Receiver(Socket socket, Chat_gui gui) {
		this(socket);
		this.gui = gui;
	}

	@Override
	public void run() {
		super.run();
		while (in != null) {
			try {
				gui.textarea.append(in.readUTF());
			} catch (IOException e) { break; }
		} // end while
	}// end run
}// end class

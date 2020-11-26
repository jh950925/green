package Day044_Chat_Gui;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class NetworkGui_Receiver extends Thread {
	Socket info;
	NetFrame gui;
	DataInputStream in;
	
	public NetworkGui_Receiver() { info = null; gui=null; in=null; }
	public NetworkGui_Receiver(Socket info, NetFrame gui) {
		this();
		this.info=info;
		this.gui = gui;
		try { this.in = new DataInputStream(info.getInputStream()); } 
		catch (IOException e) { e.printStackTrace(); }
	}
	@Override
	public void run() {
		super.run();
		while(in!=null) {
			try {
				//gui.area.setText(in.readUTF());   reset
				gui.area.append(in.readUTF());   //add...
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//end run
}// end class

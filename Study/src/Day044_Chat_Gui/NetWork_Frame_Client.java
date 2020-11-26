package Day044_Chat_Gui;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetWork_Frame_Client {
	public static void main(String[] args) {
		Socket info = null;;
		NetFrame gui = new NetFrame(); gui.show();
		
		try {
			info = new Socket("127.0.0.1", 523);
			System.out.println("[Client] 3. as센터에 전화하기....");
			gui.area.append("[Client] 3. as센터에 전화하기....\n");
			
			//말하기	(DataOutputStream)
			NetworkGui_Sender sender = new NetworkGui_Sender(info, gui); sender.start();
			//듣기	(DataInputStream)
			NetworkGui_Receiver receiver = new NetworkGui_Receiver(info, gui); receiver.start();
			
		} catch (UnknownHostException e) { e.printStackTrace(); 
		} catch (IOException e) { e.printStackTrace(); }
		
	}//end main
}//end class

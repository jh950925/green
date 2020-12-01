package Day045_Chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Day045_Client {
	public static void main(String[] args) {
		Socket socket = null;
		Chat_gui gui = new Chat_gui(); gui.show();
		String ip = "127.0.0.1";
		int port = 523;
		
		try {
			socket = new Socket(ip,port);
			System.out.println("[3]. 클라이언트 serversocket과 연결함");
			
			System.out.println("연결이 되서 말하기 - 듣기 시작함.");
			gui.textarea.append("[Client] 입장압니다\n");
			
			//말하기 클래스
			Sender sender = new Sender(socket,gui);
			sender.start();
			
			//듣기 클래스
			Receiver receiver = new Receiver(socket,gui);
			receiver.start();
			
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
	}
}

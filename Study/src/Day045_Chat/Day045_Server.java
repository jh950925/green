package Day045_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Day045_Server {
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////////////////////
		//0.서버 프로그램이 먼저 실행 -
		ServerSocket serversocket = null;
		Socket socket = null;
		Chat_gui gui = new Chat_gui(); gui.show();
		/////////////////////////////////////////////////////////////////////////////////////////////
		//1.[서버소켓] : 서버 컴퓨터의 특정 포트에서
		try {
			serversocket = new ServerSocket(523);
			System.out.println("[1]서버 특정 포트에서 대기");
		} catch (IOException e) { e.printStackTrace(); }
		/////////////////////////////////////////////////////////////////////////////////////////////
		//2.클라이언트 프로그램의 연결 요청 기다리기
		System.out.println("[2].클라이언트 프로그램의 연결 요청 기다리기");
		/////////////////////////////////////////////////////////////////////////////////////////////
		//4.만약 클라이언트가 들어오면(연결이되면) 정보를 주고받을 수 있는 [소켓]으로 통신함.
		try {
			socket = serversocket.accept();
			System.out.println("[4].만약 클라이언트가 들어오면(연결이되면) 정보를 주고받을 수 있는 [소켓]으로 통신함.");
			System.out.println("[5]. 말하기 시작!!");
			gui.textarea.append("[Server] 상담을 시작합니다.");
			//말하기 클래스
			Sender sender = new Sender(socket,gui);
			sender.start();
			
			//듣기 클래스
			Receiver receiver = new Receiver(socket,gui);
			receiver.start();
		} catch (IOException e) { e.printStackTrace(); }
		/////////////////////////////////////////////////////////////////////////////////////////////
	}//end main
}//end class

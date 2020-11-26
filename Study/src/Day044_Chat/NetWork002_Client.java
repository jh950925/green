package Day044_Chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetWork002_Client {
	public static void main(String[] args) {
		Socket client = null;
		NetFrame2 client_frame = new NetFrame2();
		
		try {
			client_frame.show();
			client = new Socket("127.0.0.1" , 523);
			client_frame.area.setText("[Client] 2. As센터에 전화하기");
//			System.out.println("[Client] 2. As센터에 전화하기");
			
			//말하기 (DataOutputStream)
			Network_Sender sender = new Network_Sender(client); 
			sender.start();
			
			//듣기   (DataInputStream)
			Network_Receiver receiver = new Network_Receiver(client); 
			receiver.start();
		} 
		catch (UnknownHostException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); }
	}
}
/*
클라리언트와 서버간의 일대일통신
1.서버프로그램이 먼저 실행되어 [서버소켓]을 사용해서 서버 컴퓨터의 특정 포트에서 클라이언트 프로그램의 연결요청 기다리기
2.서버IP와 포트정보를 가지고 [소켓]을 생성해서 서버에 연결을 요청
3.서버소켓을 클라이언트의 연결 요청을 받으면 서버에 새로운 [소켓]을 생성해 클라이언트의 소켓과 연결
*/
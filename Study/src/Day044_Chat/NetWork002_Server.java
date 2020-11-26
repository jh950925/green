package Day044_Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetWork002_Server {
	public static void main(String[] args) {
		ServerSocket ascenter     = null;
		Socket       employee	  =	null;
		NetFrame server_frame = new NetFrame();
		
		//1. as센터		[서버소켓] 만들기 - 서버 컴퓨터의 특정 포트에서 클라이언트 프로그램의 연결요청 기다리기
		try {
			ascenter = new ServerSocket(523);
			server_frame.show();
			server_frame.area.setText("[Server] 1. 서버준비완료! - 고객님 기다리기\n");
//			System.out.println("[Server] 1. 서버준비완료! - 고객님 기다리기"); //기다리기만...
		} catch (IOException e) { e.printStackTrace(); }
		//2. 상담사-전화기	[소켓:말하기, 듣기]
		try {
			employee = ascenter.accept(); //서버 소켓이 들어오면
			
			server_frame.area.setText("[Server] 3. 고객님 들어와서 상담시작\n");
//			System.out.println("[Server] 3. 고객님 들어와서 상담시작");
			
//			System.out.println("연결요청확인["+employee.getInetAddress() + " : " + employee.getPort() + "]");
			server_frame.area.setText("연결요청확인["+employee.getInetAddress() + " : " + employee.getPort() + "]\n");
			
			//말하기 (DataOutputStream)
			Network_Sender sender = new Network_Sender(employee); 
			sender.start();
			//듣기   (DataInputStream)
			Network_Receiver receiver = new Network_Receiver(employee); 
			receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}//end server

/*
클라이언트와 서버간의 일대일 통신
*/
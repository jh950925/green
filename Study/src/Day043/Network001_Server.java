package Day043;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Scanner;

public class Network001_Server {
	public static void main(String[] args) {
		//KT A/S 	-> 서버소켓
		//1. 서버 프로그램이 먼저 실행되어 [서버소켓]을 사용해
		ServerSocket serversocket = null;
//		System.out.println("1. 서버소켓 만들기 [as센터 준비]");
		//2. 서버 컴퓨터의 [특정포트]에서 클라이언트의 연결요청 기다리기
		try { serversocket = new ServerSocket(523); } catch (IOException e) { e.printStackTrace(); }
//		System.out.println("2. 9시가 되면 포트번호 열어서 - 입장하길 기다리기");
		Scanner scanner = new Scanner(System.in);
		//상담사-전화기 -> 소켓
		try {
			Calendar timer = Calendar.getInstance();
			Socket socket = serversocket.accept();
//			System.out.println("서버 3. 고객연결요청 ~ 4. 요청성공시(accept) 5.상담사연결");
			System.out.println("[server] 1. 서버준비완료!");
			System.out.println("[server] 2.연결요청 ing...");
			System.out.println("[server] 4.연결요청 와서 연결함...");
			System.out.println("연결요청확인 " +socket);
			while(true) {
				DataOutputStream outmessage = new DataOutputStream(socket.getOutputStream());
//				DataInputStream inmessage = new DataInputStream(socket.getInputStream());
				String inputmessage = scanner.next();
				outmessage.writeUTF("[server : "
						+timer.get(Calendar.HOUR_OF_DAY) + ":" 
						+ timer.get(Calendar.MINUTE) + ":"
						+ timer.get(Calendar.SECOND) + "]"
						+inputmessage);
//				System.out.println(inmessage.readUTF());
				outmessage.close();
				socket.close();
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}

package Day043;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network001_Client {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		//고객-전화기 -> 소켓
		try { 
//			Calendar timer = Calendar.getInstance();
			Socket socket = new Socket("127.0.0.1" , 523); 
			System.out.println("Client] 서버연결시도" + socket);
			while(true) {
				DataOutputStream outmessage = new DataOutputStream(socket.getOutputStream());
			outmessage.close();	
//			inputmessage.close();
//			socket.close();
			}
		} 
		catch (UnknownHostException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); }
	}
}

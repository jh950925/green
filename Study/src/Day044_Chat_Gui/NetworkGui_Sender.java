package Day044_Chat_Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;

class NetworkGui_Sender extends Thread {
	Socket info;
	NetFrame gui;
	DataOutputStream out;
	String who;
	SimpleDateFormat time;

	public NetworkGui_Sender() {
		info = null;
		gui = new NetFrame();
		out = null;
		who = "";
		time = new SimpleDateFormat("HH:mm:ss");
	}

	public NetworkGui_Sender(Socket info, NetFrame gui) {
		this();			  //위에 선언한것들 초기화
		this.info = info; //사용자가 넘겨준 정보
		this.gui = gui;   //사용자가 넘겨준 화면정보
		try {
			this.out = new DataOutputStream(info.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.who = (info.getPort() == 523) ? "[Client" : "[Server";
	}

	@Override
	public void run() {
		gui.btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				while(out!=null) {
					try {
						String msg = who+time.format(System.currentTimeMillis())+"]" + gui.text.getText()+"\n";
						out.writeUTF(msg);//상대방에게 말하기
						gui.text.setText("");//textField비우고
						gui.area.append(msg);//내화면에 띄우기
					} catch (IOException e) {
						e.printStackTrace();
					}
//					if(gui.text.getText().equals("")) {
//						break;
//					}
//				}
			}
		});//end btn
	}// end run

}// end class

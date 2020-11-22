package Day021;

class TV001{
	String channel;
	int volume;
	
	public void show() {
		System.out.println("TV채널 : " + channel);
		System.out.println("TV볼륨 : " + volume);
	}
}

public class Class004 {
	public static void main(String[] args) {

		TV001 tv = new TV001();
		
		tv.channel="JTBC";
		tv.volume = 5;
		tv.show();
		
	}
}

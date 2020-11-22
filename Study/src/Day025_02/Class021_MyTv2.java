package Day025_02;

public class Class021_MyTv2 {
	//멤버변수
	int channel;
	int volume;
	//멤버함수
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "MyTv2 [channel=" + channel + ", volume=" + volume + "]";
	}
	

	//생성자
	public Class021_MyTv2() {
		super();
	}
}

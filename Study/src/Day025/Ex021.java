package Day025;

import Day025_02.Class021_MyTv2;

public class Ex021 {
	public static void main(String[] args) {
		
		Class021_MyTv2 t = new Class021_MyTv2();
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel()); // CH : 9
		t.setVolume(20);
		System.out.println("VOL : " + t.getChannel()); // CH : 20
	}
}

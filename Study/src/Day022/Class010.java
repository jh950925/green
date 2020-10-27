package Day022;

import java.util.Scanner;

class TV002 {
	//멤버변수
	String channel;
	int volume;
	//멤버함수
	public void show() {
		System.out.println("==== TV");
		System.out.println("TV채널 : " + this.channel);
		System.out.println("TV볼륨 : " + this.volume);
	}// end show

	//생성자 => 기본생성자가 단독으로 있으면 자동으로 호출
	TV002() {

	}// end 생성자

	TV002(String channel, int volume) { // 파라미터가 있는 생성자가 나올때 기본생성자는 수동으로 바뀜
		this.channel = channel;
		this.volume = volume;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println(":::::::MYTV");
		System.out.println(":: TV채널입력 > ");
		this.channel = scanner.next();
		System.out.println(":: TV볼륨입력 > ");
		this.volume = scanner.nextInt();
		scanner.close();
	}

}// end class TV

public class Class010 {

	public static void main(String[] args) {
		TV002 a1 = new TV002("MBC", 6);
		a1.show(); // 티비 파라미터로 받은 값

		TV002 a2 = new TV002();
		a2.input();
		a2.show();
	}// end main

}// class

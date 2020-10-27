package Day023;

import java.util.Scanner;

class TV002 {
	// 멤버변수
	String channel;
	int volume;

	// 멤버함수
	public void show() {
		System.out.println("====TV");
		System.out.println("TV채널 : " + channel);
		System.out.println("TV채널 : " + volume);

	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n====MYTV");
		System.out.println("TV채널입력 : ");
		this.channel = scanner.next();
		System.out.println("TV볼륨입력 : ");
		this.volume = scanner.nextInt();
		scanner.close();
	}

	TV002() {
	}
	TV002(String channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}
}// end TV002

public class Day023 {
	public static void main(String[] args) {
		// 1. TV002 라는 자료형으로 만들 수 있는 인스턴스 변수 : [channel | volume]
		// 2. new : TV002()를 사용하게 만들어주는 공간 할당을 하는 역할
		// 3. TV002("MBC", 6") => 인스턴스 변수에 [String : "MBC"|int : 6|show()] 셋팀됨
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : a1, a2
		TV002 a1 = new TV002("MBC", 6);
		a1.show();

		TV002 a2 = new TV002();
		a2.input();
		a2.show();

	}// end main
}// end Day023

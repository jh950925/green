package Day022;

class SutdaCard002 {
	// 멤버변수
	int num;
	boolean isKwang;

	// 멤버함수
	public String info() {
		String result = "";
		if (this.isKwang == true) {
			result = ("" + num + "K");
		}else {
			result = ""+num;
		}
		return result;
	}

	// 생성자
	SutdaCard002() {
		this.num = 1;
		this.isKwang = true;
	}

	SutdaCard002(int num, boolean isKwang) {
		this.num = 3;
		this.isKwang = false;
	}

}

public class Ex002 { 
	public static void main(String[] args) {

		SutdaCard002 card1 = new SutdaCard002(3, false);
		SutdaCard002 card2 = new SutdaCard002();

		System.out.println(card1.info()); // 3출력
		System.out.println(card2.info()); // 1K출력 (default 생성자 이용, 1셋팅 K문자)
	}
}

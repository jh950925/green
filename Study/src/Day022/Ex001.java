package Day022;

class SutdaCard{
	//멤버변수
	int num;
	boolean isKwang;
	
	//생성자
	SutdaCard() {
		this.num = 0;
		this.isKwang = false;
	}
}


public class Ex001 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		System.out.println("[num=" + card1.num + ", isKwang=" + card1.isKwang + "]");
	}
}

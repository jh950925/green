package Day027;

class SutdaCard extends Object{
	int num; 
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang= isKwang;
	}
	@Override
	public String toString() {
		return ""+num+(isKwang? "k" : "");
	}
	
}
////////////////////////////////////////////////////////////////
class SutdaDeck{
//	static final int CARD_NUM; 
	SutdaCard[] cards;
	
	public SutdaDeck() {
		super();
		cards = new SutdaCard[20];
	}
	public SutdaDeck(SutdaCard[] cards) {
		super();
	}
	
}

public class Ex005 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard();
		System.out.println(card1);
		SutdaCard car2 = new SutdaCard(3,false);
//		System.out.println(card2);
		System.out.println("-----------------------------");
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
	}

}

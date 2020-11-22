package Day026_Class;

public class ClassArr006_Moneyshow_ver2 {

	ClassArr006_MoneyCard_ver2 card = new ClassArr006_MoneyCard_ver2();
	
	public void show(ClassArr006_Money_ver2 users) {
		title();
		card.cardRankin(users);
		System.out.println("[USER] " + users.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : " + users.getUser_won()+"원");
		System.out.println("등급 : " + users.getRanking());
		System.out.println();
	}
	public void show(ClassArr006_Money_ver2[] users) {
		title();
		card.cardRankin(users);
		System.out.println("[USER] \tNAME\tBALANCE\tCARD");
		System.out.println("======================================");
		for(int i =0; i<users.length;i++) {
			System.out.println("[USER]\t" + users[i].getUser_name()+"\t" + users[i].getUser_won()+"원"+"\t"+users[i].getRanking());
			System.out.println("======================================");
		}
	}
	public void title() {
		System.out.println("======================================");
		System.out.println(":::::::::::::::: WELCOME! Green Bank");
		System.out.println("======================================");
	}
	public ClassArr006_Moneyshow_ver2() {
		
	}
}

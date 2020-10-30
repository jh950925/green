package Day026_Class;

public class ClassArr006_MoneyCard_ver2 {

	public void cardRankin(ClassArr006_Money_ver2[] users) {
		for(int i=0;i<users.length;i++) {
			if(users[i].getUser_won()>=25000) {
				users[i].setRanking("gold");
			}else if(users[i].getUser_won()>=15000 && users[i].getUser_won()<25000) {
				users[i].setRanking("silver");
			}else {
				users[i].setRanking("green");
			}
		}
	}
	public void cardRankin(ClassArr006_Money_ver2 users) {
		if(users.getUser_won()>=25000) {
			users.setRanking("gold");
		}else if(users.getUser_won()>=15000 && users.getUser_won()<25000) {
			users.setRanking("silver");
		}else {
			users.setRanking("green");
		}
	}
	
	public ClassArr006_MoneyCard_ver2() {
		
	}
}

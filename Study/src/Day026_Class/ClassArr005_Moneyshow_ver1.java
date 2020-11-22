package Day026_Class;

public class ClassArr005_Moneyshow_ver1 {

	
	public void show(ClassArr005_Money_ver1 users) {
		System.out.println("======================================");
		System.out.println(":::::::::::::::: WELCOME! Green Bank");
		System.out.println("======================================");
		System.out.println("[USER]" + users.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : " + users.getUser_won());
		System.out.println();
	}
	public void show(ClassArr005_Money_ver1[] users) {
		System.out.println("======================================");
		System.out.println(":::::::::::::::: WELCOME! Green Bank");
		System.out.println("======================================");
		System.out.println("[USER]\tNAME\tBALANCE");
		System.out.println("======================================");
		for(int i =0; i<users.length;i++) {
			System.out.println("[USER]\t" + users[i].getUser_name()+"\t" + users[i].getUser_won()+"원");
			System.out.println("======================================");
		}
	}
	public ClassArr005_Moneyshow_ver1() {
		
	}
}

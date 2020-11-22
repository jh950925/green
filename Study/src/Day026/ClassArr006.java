package Day026;


import Day026_Class.ClassArr006_Money_ver2;
import Day026_Class.ClassArr006_Moneyshow_ver2;

public class ClassArr006 {
	public static void main(String[] args) {

		ClassArr006_Money_ver2[] users= new ClassArr006_Money_ver2[]
				{new ClassArr006_Money_ver2("aaa",10000)
				,new ClassArr006_Money_ver2("bbb",20000)
				,new ClassArr006_Money_ver2("ccc",30000)
				};
		ClassArr006_Moneyshow_ver2 print = new ClassArr006_Moneyshow_ver2();
		print.show(users[0]);
		print.show(users);
//		System.out.println(Arrays.toString(users));
	}
}

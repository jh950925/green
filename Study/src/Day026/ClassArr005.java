package Day026;

import Day026_Class.ClassArr005_Money_ver1;
import Day026_Class.ClassArr005_Moneyshow_ver1;

public class ClassArr005 {
	public static void main(String[] args) {

		ClassArr005_Money_ver1[] users= new ClassArr005_Money_ver1[]
				{new ClassArr005_Money_ver1("aaa",10000)
				,new ClassArr005_Money_ver1("bbb",20000)
				,new ClassArr005_Money_ver1("ccc",30000)
				};
		ClassArr005_Moneyshow_ver1 print = new ClassArr005_Moneyshow_ver1();
		print.show(users[0]);
		print.show(users);
	}
}

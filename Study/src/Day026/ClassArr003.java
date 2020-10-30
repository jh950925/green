package Day026;

import Day026_Class.ClassArr002_Apple;
import Day026_Class.ClassArr003_Apple_print;

public class ClassArr003 {

	public static void main(String[] args) {

		ClassArr002_Apple[] user1 = new ClassArr002_Apple[3];
		user1[0] = new ClassArr002_Apple();
		user1[1] = new ClassArr002_Apple();
		user1[2] = new ClassArr002_Apple();
//		System.out.println(user1[0]);
//		System.out.println(user1[1]);
//		System.out.println(user1[2]);
		
		ClassArr003_Apple_print print = new ClassArr003_Apple_print();
		print.show(user1);
		System.out.println();
		print.show(user1[0]);
	}

}

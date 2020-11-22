package Day026;

import Day026_Class.ClassArr002_Apple;

public class ClassArr002 {
	public static void main(String[] args) {
		
		ClassArr002_Apple[] apple = new ClassArr002_Apple[3];
		
		apple[0] = new ClassArr002_Apple("Red","iron",2,1000); 
		apple[1] = new ClassArr002_Apple("green","hulk",1,1500); 
		apple[2] = new ClassArr002_Apple("Gold","captain",3,2000); 
//		System.out.println(Arrays.toString(apple));
		System.out.println(apple[0]);
		System.out.println(apple[1]);
		System.out.println(apple[2]);
		
	
	}
}
 
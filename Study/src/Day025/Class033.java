package Day025;

import Day025_02.Car4;

public class Class033 {

	public static void main(String[] args) {

		Car4 c3 = new Car4();
		////아래 오류 고치기
		c3.setColor("white");
		c3.setGearType("auto");
		c3.setDoor(4);
		
		Car4 c2 = new Car4("white", "auto", 4);
		
		System.out.println(c3);
		System.out.println(c2);
	}

}

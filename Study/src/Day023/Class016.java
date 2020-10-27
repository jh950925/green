package Day023;

class Car2 {
	//멤버변수
	String color;
	String gearType;
	int door;
	//생성자
	Car2() {

	}

	@Override
	public String toString() {
		return "Car2 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}

	Car2(String color) {
		this.color = color;
	}
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Class016 {
	public static void main(String[] args) {
		// Car2 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color | gearType | door]
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : c1,c2,c3
		Car2 c1 = new Car2();
		//@Override를 통하여 출력
		// Car2 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color=" " | gearType=" " | door=0]
		System.out.println(c1);
		
		// Car2 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="white" | gearType=" " | door=0]
		Car2 c2 = new Car2("white");
		//@Override를 통하여 출력
		System.out.println(c2);
		
		// Car2 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="red" | gearType="manual" | door=2]
		Car2 c3 = new Car2("red", ",manual", 2);
		//@Override를 통하여 출력
		System.out.println(c3);
		
		System.out.println("c1의 color =" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color =" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		System.out.println("c3의 color =" + c3.color + ", gearType=" + c3.gearType + ", door=" + c3.door);
	}
}

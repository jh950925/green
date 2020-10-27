package Day023;

class Car1{
	//멤버변수
	String color;
	String gearType;
	int door;
	//멤버함수
	
	//생성자
	Car1(){
		
	}
	@Override
	public String toString() {
		return "[Car1 [color=" + color + ", gearType=" + gearType + ", door=" + door+"]";
	}
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
}

public class Class015 {
	public static void main(String[] args) {
		// Car1 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color | gearType | door]
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : c1,c2
		Car1 c1 = new Car1();
		System.out.println(c1);
		c1.color = "red";
		c1.gearType="auto";
		c1.door=4;
		// [color="red"| gearType="auto" | door=4]
		System.out.println(c1);
		
		Car1 c2 = new Car1("white", "auto", 2);
		// [color="white"| gearType="auto" | door=2]
		System.out.println(c2);
	}
}

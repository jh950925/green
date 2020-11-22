package Day023;

class Car3{
	//멤버변수
	String color;
	String gearType;
	int door;
	//생성자
	Car3(){
		this.door = 4;
		this.gearType="auto";
	}
	//car라는 인스턴스 변수의 주소를 입력받아서 그 주소에 있는 각 멤버변수들을 this.멤버변수에 저장시킨다.
	Car3(Car3 car){
		this.color=car.color;
		this.gearType=car.gearType;
		this.door=car.door;
	}
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}

public class Class017 {
	public static void main(String[] args) {
		// Car3 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color | gearType | door]
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : c1,c2,c3,c4
		
		// Car3 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="red" | gearType="auto"(생성자 초기값이 auto) | door=4(생성자 초기값이4)]
		Car3 c1 = new Car3();	c1.color="red";		System.out.println(c1);
		
		// Car3에 오버로딩을 한다. c1는 주소
		// Car3 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="red" | gearType="auto"(생성자 초기값이 auto) | door=4(생성자 초기값이4)]
		Car3 c2 = new Car3(c1); System.out.println(c2);
		
		//생성자
		
		// Car3 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="green" | gearType="auto"(생성자 초기값이 auto) | door=4(생성자 초기값이4)]
		Car3 c3 = new Car3();	c3.color="green";	System.out.println(c3);
		// Car3에 오버로딩을 한다. c3는 주소
		// Car3 라는 자료형으로 만들 수 있는 인스턴스 변수 : [color="green" | gearType="auto"(생성자 초기값이 auto) | door=4(생성자 초기값이4)]
		Car3 c4 = new Car3(c3); System.out.println(c4);
		}

}

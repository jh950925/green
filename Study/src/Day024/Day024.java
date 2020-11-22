package Day024;

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
		return "Car1 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	Car1(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	} 
} 

public class Day024 {

	public static void main(String[] args) {
		//1.Car1 쓸 수 있는 인스턴스 변수 [color,gearType,door]
		//new : 메모리 할당 해주는 역할
		//Car1()셋팅내용  [color=null,gearType=null,door=0]
		//c1이 갖고 있는것 Car1()의 주소
		Car1 c1 = new Car1();
		System.out.println(c1);
		c1.color="red";
		c1.gearType="auto";
		c1.door=4;
		System.out.println(c1);
		Car1 c2 = new Car1("white", "auto",2);
		System.out.println(c2);
		
	}

}

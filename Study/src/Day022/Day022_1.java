package Day022;

class Day022{
	//멤버변수
	String name;
	int price;
	
	//멤버함수
	public void show() {
		System.out.println("=====커피");
		System.out.println("커피명 : " + name);
		System.out.println("커피가격 : " + price);
	}//end show()

	Day022(){
		System.out.println("= 기본생성자는 자동으로 호출되어 실질적으로 공간을 사용가능하게 초기화를 해준다.");
	}
}//end class(Day022)


public class Day022_1 {

	public static void main(String[] args) {
		//Day022 클래스를 참조변수인 test로 선언
		Day022 test = new Day022();
		// new : 공간을 빌려서 초기화
		// test는 공간을 빌려온 주소를 가지고 있음
		// .으로 접근해서 사용
		
		//참조변수의 속성에 값을 넣어줌 => 넘어올때 초기화 되어 name은 ""    price는 0이 된다.
		test.name = "아메리카노";
		test.price = 2000;
		
		//Day022 클래스 출력
		test.show();
	
	}//end main
}//end class(Day022_1)

//Q1) oop full term을 적으시오
//Object Oriented Program => 현실의 객체모델을 바탕으로 프로그램을 구조화 하고 개발하는 프로그래밍 기법

//Q2) 객체지향 프로그램에 대해서 정의를 내리시오
//객체를 생성하고 new를 통한 메모리할당과, 호출을 통하여 그 객체를 어느곳에서 사용할 수 있는 언어 

//Q3) class vs Object vs Instatnce의 차이점을 적으시오
//class는 설계를 도와주는것, Object는 실제화를 가능하게 만드는 틀, Intance는 메모리를 할당받아 실체화 한 것

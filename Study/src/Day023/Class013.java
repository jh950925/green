package Day023;

import java.util.Scanner;

class Coffee003{
	//멤버변수
	String name;
	int price;
	int num;
	//멤버변수
	public void show() {
		coffee_calc(); // 출력전에 price를 리턴값으로 올려준 coffee_calc메서드의 값을 먼저 가져옴
		System.out.println("=== COFFEE_SHOW");
		System.out.println("= 커 피 명 : " + name);
		System.out.println("= 커피 잔수 : " + num + "잔");
		System.out.println("= 커피 가격 : " + coffee_calc()+"원");
	}
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(":::::::COFFEE ORDER");
		System.out.println("아메리카노 : 1000\t카페라떼 : 1500\t카푸치노 : 2000");
		System.out.print("커피이름 입력 : ");
		this.name = scanner.next();
		System.out.println("\n잔수(갯수)입력 : ");
		this.num = scanner.nextInt();
		scanner.close();
	}
	public int coffee_calc() { // 만약 입력받은 name값이 equals을 사용 해서 " " 와 같다면 계산식을 가격에 리턴  
		if(name.equals("아메리카노")) {
			price = (1000 * num); 
		}else if(name.equals("카페라떼")){
			price = (1500*num);
		}else if(name.equals("카푸치노")){
			price = (2000*num);
		}
		return price;
	}
	//생성자
	Coffee003(){
		
	}
	Coffee003(String name, int num){
		this.name = name;
		this.num = num;
	}
}

public class Class013 {
	public static void main(String[] args) {
		// Mobile003 라는 자료형으로 만들 수 있는 인스턴스 변수 : [name | num | price]
		// 인스턴스 변수를 사용할 수 있게 주소를 갖고 있는 것 : a1, a2
		Coffee003 a1 = new Coffee003("아메리카노", 3);
		// Mobile003("아메리카노",3,null ) => 인스턴스 변수에 [company : "아메리카노"| price : 3 |product : null] 셋팅됨
		a1.show();

		Coffee003 a2 = new Coffee003();
		//생성자이 있는 값 => 초기값
		a2.input();
		// a2 => 인스턴스 변수에 [company : "입력값"| price : 입력값 |product : coffee_calc()] 셋팅됨
		a2.show();
	}
}

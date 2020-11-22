package Day024;

import java.util.Scanner;

class Coffee005 {
	// 멤버변수
	static String coffeeName[]; 
	static int coffeePrice[];
	static {
		String []coffeeName02 = {"아메리카노","카페라떼","카푸치노"};
		int []coffeeprice02 = {1000,1500,2000};
		coffeeName = coffeeName02; 
		coffeePrice = coffeeprice02;
	}
	String name;
	int num, price;
	// 멤버함수
	public void show() {
		coffee_calc();
		System.out.println("=== COFFEE_SHOW");
		System.out.println("= 커 피 명 : " + name);
		System.out.println("= 커피 잔수 : " + num + "잔");
		System.out.println("= 커피 가격 : " + coffee_calc() + "원");
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
	public int coffee_calc() {
		for (int i = 0; i < coffeeName.length; i++) {
			if (name.equals(coffeeName[i])) {
				price = num * coffeePrice[i];
			}
		}
		return price;
	}
	// 생성자
	Coffee005() {

	}

	Coffee005(String name, int num) {
		this.name=name;
		this.num=num;
	}


}

public class Class025 {
	public static void main(String[] args) {
		Coffee005 a1 = new Coffee005("아메리카노", 3);
		a1.show();
		
		Coffee005 a2 = new Coffee005();
		a2.input();
		a2.show();

	}
}

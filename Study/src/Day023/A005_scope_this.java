package Day023;

import java.util.Scanner;

class Coffee004 {
	// 멤버변수
	String[] coffeeName;
	int[] coffeeprice;
	 
	int price;
	int num; 
	String name;
	{
		String []coffeeName02 = {"아메리카노","카페라떼","카푸치노"};
		int []coffeeprice02 = {1000,1500,2000};
		coffeeName = coffeeName02; 
		coffeeprice = coffeeprice02;
	}
	// 멤버함수 
	// 입력
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

	// 출력
	public void show() {
		coffee_calc();
		System.out.println("=== COFFEE_SHOW");
		System.out.println("= 커 피 명 : " + name);
		System.out.println("= 커피 잔수 : " + num + "잔");
		System.out.println("= 커피 가격 : " + coffee_calc() + "원");
	}

	public int coffee_calc() {
		for (int i = 0; i < coffeeName.length; i++) {
			if (name.equals(coffeeName[i])) {
				price = num * coffeeprice[i];
			}
		}
		return price;
	}

	// 생성자
	Coffee004() {
		
	}

	// 생성자오버로딩
	Coffee004(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

public class A005_scope_this {
	public static void main(String[] args) {
		Coffee004 a1 = new Coffee004("아메리카노", 3);
		a1.show();
		 
		Coffee004 a2 = new Coffee004();
		a2.input();
		a2.show();
	}
}

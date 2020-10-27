package Day022;

import java.util.Scanner;

class Animal002 {
	String name;
	int age;

	// 추가
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 > ");
		this.name = scanner.next();
		System.out.println("나이 입력 > ");
		this.age = scanner.nextInt();
		scanner.close();
	}

	// 출력
	public void show() {
		System.out.println("================================");
		System.out.print("이름 : " + this.name + "\n");
		System.out.print("나이 : " + this.age + "\n");
		System.out.println();
	}

	// 생성자
	Animal002() {
		this.name = "USERNAME";
		this.age = 0;
	}
}

public class Class011 {

	@Override
	public String toString() {
		return "Class011 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {

		Animal002 a1 = new Animal002();
		a1.show();

		Animal002 a2 = new Animal002();
		a2.input();
		a2.show();
	}// end main

}// end class

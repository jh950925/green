package Day021;

import java.util.Scanner;

class Animal001{
	String name;
	int age;
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scanner.next();
		System.out.println();
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		scanner.close();
	}
	public void show() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

public class Class005 {
	public static void main(String[] args) {

		Animal001 a1 = new Animal001();
		a1.input();
		a1.show();
	}
}

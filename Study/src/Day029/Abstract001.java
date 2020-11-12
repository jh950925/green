package Day029;

abstract class Animal0 {
	String name;
	int age;

	public Animal0(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
 
	public Animal0() {
	}

	public abstract void eat(); // 추상(abstract)메서드가 들어가면 클래스도 추상(abstract)클래스로 생성해야한다.

	public abstract void sleep();

	public abstract void poo(); // 고양이,개,사람은 먹는 방식이 다르다. => 그래서 어떤 동물인지 추상적이라서 abstract 사용 => 일반화
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Cat0 extends Animal0 {
	@Override
	public void eat() {
		System.out.println(super.name+"ㅁCat 냠냠!");
	}

	@Override
	public void sleep() {
		System.out.println(super.name+"ㅁCat 코오!");
	}

	@Override
	public void poo() {
		System.out.println(super.name+"ㅁCat 시원해!");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Dog0 extends Animal0 {
	@Override
	public void eat() {
		System.out.println("ㅁDog 냠냠!");
	}

	@Override
	public void sleep() {
		System.out.println("ㅁDog 코오!");
	}

	@Override
	public void poo() {
		System.out.println("ㅁDog 시원해!");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Abstract001 {
	public static void main(String[] args) {

		// 실습1. abstract 키워드가 붙으면 new를 사용 못함.
//		Animal0 myani = new Animal0();
		
		//실습2. abstract 클래스는 상속받아서 자식클래스에서 구현해야한다.
		Cat0 mycat = new Cat0();
		mycat.name="Sally";
		mycat.age=10;
		mycat.eat();
		mycat.sleep();
		mycat.poo();
	}

}

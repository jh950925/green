package Day027;

class Fruit extends Object{
	public static void line() {
		System.out.println("============================================");
	}
	Fruit(){
		super();
		System.out.println(":::::::::::: Fruit 생성자");
	}
}//end Fruit
////////////////////////////////////////////////////////
class Apple extends Fruit{
	Apple(){
		super();
		System.out.println(":::::::::::: Apple 생성자");
	} 
}//end Apple 
////////////////////////////////////////////////////////
class AppleJam extends Apple{
	AppleJam(){
		super();
		System.out.println(":::::::::::: AppleJam 생성자");
	}
}//end AppleJam 
////////////////////////////////////////////////////////
public class Extends005 {
	public static void main(String[] args) {
		Fruit.line();
		Fruit fruit = new Fruit(); // Fruit 생성자
		
		Fruit.line();
		Apple apple = new Apple(); // Apple생성자 => Fruit 생성자
		
		Fruit.line();
		AppleJam appleJam = new AppleJam(); // AppleJam생성자 => Apple생성자 => Fruit 생성자
	}
}

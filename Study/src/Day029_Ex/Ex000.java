package Day029_Ex;

import java.util.Arrays;

class Animal2{
	String name;

	@Override
	public String toString() {
		return "Animal2 [name=" + name + "]";
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("멍멍");
	}
}
class Cat2 extends Animal2{
	void meow() {
		System.out.println("야옹!");
	}
} 
class Pig2 extends Animal2{
	void oink() {
		System.out.println("꿀꿀");
	}
}
public class Ex000 {
	public static void main(String[] args) {
		Animal2 [] myani = {
							new Animal2(),
							new Dog2(),
							new Cat2(),
							new Pig2()
						  };
		
		Animal2[] myani2 = new Animal2[4];
		myani2[0] = new Animal2();
		myani2[1] = new Dog2();
		myani2[2] = new Cat2();
		myani2[3] = new Pig2();
//		System.out.println(Arrays.toString(myani2));
		
		if(myani2[1] instanceof Dog2) { 
			((Dog2)myani2[1]).bark();
			
		}else if(myani2[2] instanceof Cat2){
			((Cat2)myani2[2]).meow();
			
		}else if(myani2[3] instanceof Pig2){
			((Pig2)myani2[3]).oink();
		}
	}
}

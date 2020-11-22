package Day032_anoymous;

interface Animal{
	public void eat();
	public void sleep();
	public void poo();
}
class Monekey implements Animal{

	@Override
	public void eat() {
		System.out.println("바나나 남냠!");
	}
	@Override
	public void sleep() {
		System.out.println("HOUSE에서 자요");
	}
	@Override
	public void poo() {
		System.out.println("시원해요");
	}
}
////////////////////////////////////////////////
public class Anoymous002 {
	public static void main(String[] args) {
		Animal animal = new Monekey();
		animal.eat();
		animal.sleep();
		animal.poo();
		
		Animal monkey = new Animal() {
			@Override
			public void eat() {
				System.out.println("바나나 남냠!");
			}

			@Override
			public void sleep() {
				System.out.println("HOUSE에서 자요");
			}

			@Override
			public void poo() {
				System.out.println("시원해요");
			}
		};
		animal.eat();
		animal.sleep();
		animal.poo();
	}//end main
}//end class

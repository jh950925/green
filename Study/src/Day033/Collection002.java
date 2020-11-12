package Day033;

import java.util.Vector;

public class Collection002 {
	public static void main(String[] args) {
		Vector color = new Vector();
		Vector milk = new Vector();
		Vector fruit = new Vector();
		
		//color
		color.add("Red");
		color.add("Green");  
		color.add("Blue");
		color.add("Black");
		for(int i=0; i<color.size(); i++) { 
			System.out.println(color.get(i));
		}
		///////////////////////////////////////
		System.out.println("=======================");
		//milk
		milk.add("White");
		milk.add("Choco");
		milk.add("Banana");
		for(int i=0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		///////////////////////////////////////
		System.out.println("=======================");
		//Fruit
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("coconut");
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		fruit.remove("banana");
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
	}
}

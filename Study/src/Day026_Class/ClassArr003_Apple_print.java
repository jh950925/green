package Day026_Class;

import java.util.Arrays;

public class ClassArr003_Apple_print {
	private String order; 
	private String name; 
	private int num;
	private int price;
	////////////////////////////////////////////////////////////
	//멤버함수
	public void show(ClassArr002_Apple user1) {
		System.out.println(": APPLE ORDER :");
		System.out.println("ORDER : " + user1.getOrder());
		System.out.println("NAME  : " + user1.getName());
		System.out.println("NUM   : " + user1.getNum());
		System.out.println("PRICE : " + user1.getPrice());
		
	}
	public void show(ClassArr002_Apple[] user1) {
//		System.out.println(Arrays.toString(user1));
		System.out.println(": APPLE ORDER :");
		for(int i =0; i<user1.length;i++){
			System.out.println("ORDER : " + user1[i].getOrder());
			System.out.println("NAME  : " + user1[i].getName());
			System.out.println("NUM   : " + user1[i].getNum());
			System.out.println("PRICE : " + user1[i].getPrice());
		}
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//////////////////////////////////////////////////////
	//생성자
	public ClassArr003_Apple_print() {
		super();
		this.order = "";
		this.name = "";
		this.num = 0;
		this.price = 0;
	}
	public ClassArr003_Apple_print(ClassArr002_Apple apple) {
		super();
		this.order = apple.getOrder();
		this.name = apple.getName();
		this.num = apple.getNum();
		this.price = apple.getPrice();
	}
	
}

package Day021;

class Coffee001{
	String name; 
	int price;
	
	public void show() {
		System.out.println("이름 : "+ name);
		System.out.println("가격 : "+ price);
	}
}

public class Class003 {
	public static void main(String[] args) {
		
		Coffee001 coffee = new Coffee001();
		
		coffee.name = "아메리카노";
		coffee.price = 2000;
		coffee.show();
		
	}
}

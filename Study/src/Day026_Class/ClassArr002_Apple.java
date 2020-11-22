package Day026_Class;

public class ClassArr002_Apple {
	private String name;//이름
	private String order;//주문자
	private int num;//개수
	private int price;//가격
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
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
	public void setPrice(int pirce) {
		this.price = pirce;
	}
	@Override
	public String toString() {
		return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
	}
	
	//생성자
	public ClassArr002_Apple() {
		super();
		this.name = "APPLE";
		this.order = "홍길동";
		this.num = 1;
		this.price = 1000;
	}
	public ClassArr002_Apple(String name, String order, int num, int price) {
		super();
		this.name = name;
		this.order = order;
		this.num = num;
		this.price = price;
	}
}

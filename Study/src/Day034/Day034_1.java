package Day034;

import java.util.Vector;

class ColorInfo{
	private int no;
	private String name;  
	private int price;
	public static int no_cnt=1;
	@Override
	public String toString() {
		return "ORDER"+no+" : "+name+"\t"+price;
	}
	public ColorInfo() {
		super();
		this.no=no_cnt++;
	}
	public ColorInfo(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		this.no=no_cnt++;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no_cnt++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Day034_1 {
	public static void main(String[] args) {

		Vector<ColorInfo> mycolor = new Vector<ColorInfo>();
		mycolor.add(new ColorInfo("Red",1000));
		mycolor.add(new ColorInfo("Yellow",1200));
		mycolor.add(new ColorInfo("Green",1500));
//		System.out.println(mycolor);
		line();
		System.out.println("\tNAME\tPRICE");
		line();
		for(int i=0; i<mycolor.size();i++) {
			System.out.println(mycolor.get(i));
			line();
		}
	}
	public static void line() {
		System.out.println("======================");
	}
}

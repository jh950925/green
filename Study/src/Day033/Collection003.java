package Day033;

import java.util.Vector;

class ColorInfo{
	private int no;
	public static int no_cnt =0;
	private String name; 
	private int price;
	public ColorInfo() { this.no = ++ no_cnt; }
	public ColorInfo(String name, int price) { this.no = ++ no_cnt; this.name=name; this.price= price; }
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; } 
	public static int getNo_cnt() { return no_cnt; }
	public static void setNo_cnt(int no_cnt) { ColorInfo.no_cnt = no_cnt; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	@Override
	public String toString() {
		return "ColorInfo [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Collection003 {
	public static void main(String[] args) {
		System.out.println("[ver-1]DTO");
		ColorInfo test1 = new ColorInfo("Pink", 1200);
		System.out.println(test1);
		
		System.out.println("\n[ver-2]Vector");
		Vector mycolor = new Vector();
		System.out.println(mycolor);

		System.out.println("\n[ver-3]Vector + add 이용해서 데이터 넣기");
		mycolor.add(new ColorInfo("Yellow" , 1200));
		mycolor.add(new ColorInfo("Red"    , 1200));
		mycolor.add(new ColorInfo("Green"  , 1200));
		System.out.println(mycolor);
		
		System.out.println("\n[ver-4] for + size를 이용해서 출력하기");
		for(int i=0; i<mycolor.size();i++) {
			System.out.println(mycolor.get(i));
		}
	}
}

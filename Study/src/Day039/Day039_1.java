package Day039;

import java.util.ArrayList;
import java.util.Iterator;

class aplle_coll{
	private String type;
	private int price;
	public aplle_coll() { super(); }
	public aplle_coll(String type, int price) { super(); this.type = type; this.price = price; }
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", price=" + price + "]";
	}
}
////////////////////////////////////////////////////
public class Day039_1 {
	public static void main(String[] args) {

		ArrayList<aplle_coll> apple_list = new ArrayList<>();
		
		apple_list.add(new aplle_coll("red",1000));
		apple_list.add(new aplle_coll("green",1200));
		apple_list.add(new aplle_coll("red",1000));
		apple_list.add(new aplle_coll("red",1000));
		
		Iterator<aplle_coll> iter = apple_list.iterator();
		while(iter.hasNext()) {
			aplle_coll temp = iter.next();
			System.out.println(temp.getType()+"\t"+temp.getPrice());
		}
	}
}

package Day039;

import java.util.HashSet;
import java.util.Iterator;

class KimBab{
	private String type;
	private int price;
	public KimBab() { super(); }
	public KimBab(String type, int price) { super(); this.type = type; this.price = price; }
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
///////////////////////////////////////////
public class Day039_2 {
	public static void main(String[] args) {
		
		
		HashSet<KimBab> kimbab_list = new HashSet<>();
		
		kimbab_list.add(new KimBab("rice",1));
		kimbab_list.add(new KimBab("danmugi",1));
		kimbab_list.add(new KimBab("danmugi",1));
		kimbab_list.add(new KimBab("kim",1));
		
		Iterator<KimBab> iter = kimbab_list.iterator();
		while(iter.hasNext()) {
			KimBab temp = iter.next();
			System.out.println(temp.getType()+"\t"+temp.getPrice());
		}
		
	}
}

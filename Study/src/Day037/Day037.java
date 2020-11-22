package Day037;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class dto{
	private int price;
	private String name;
	public dto() { super(); }
	public dto(String name,int price) { super(); this.name = name; this.price = price; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}


public class Day037 {
	public static void main(String[] args) {
		/*
			List 순서O 중복허용X  add, get, size, remove
			set  순서X 중복허용X  add, Iterator, size, remove
			Map  (Key,value)   put, key, size, remove
			
		 */
		
		int cnt = 1;
		ArrayList<dto> arr = new ArrayList<>();
		HashSet<dto> set = new HashSet<>();
		HashMap<String,Integer> map = new HashMap<>();
		
		//list
		System.out.println("====================");
		System.out.println("NO\tName\tPrice");
		System.out.println("====================");
		arr.add(new dto("white",1000)); arr.add(new dto("choco", 1200)); arr.add(new dto("banana",1300));
		Iterator<dto> iter1 = arr.iterator();
		while(iter1.hasNext()) {
			dto temp1 = iter1.next();
			System.out.println(cnt+"\t"+temp1.getName()+"\t"+temp1.getPrice());
			cnt++;
		}
		
		//set
		cnt=1;
		System.out.println("\n====================");
		System.out.println("NO\tName\tPrice");
		System.out.println("====================");
		set.add(new dto("white",1000)); set.add(new dto("choco", 1200)); set.add(new dto("banana",1300));
		Iterator<dto> iter2 = arr.iterator();
		while(iter2.hasNext()) {
			dto temp2 = iter2.next();
			System.out.println(cnt+"\t"+temp2.getName()+"\t"+temp2.getPrice());
			cnt++;
		}
		
		
		//map
		cnt=1;
		System.out.println("\n====================");
		System.out.println("NO\tName\tPrice");
		System.out.println("====================");
		map.put("white", 1000); map.put("choco", 1200); map.put("banana", 1300);
		Iterator<Entry<String,Integer>> iter3 = map.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry<String,Integer> temp = iter3.next();
			System.out.println(cnt+"\t"+temp.getKey()+"\t"+temp.getValue());
			cnt++;
		}
	}
}

package Day035;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet001 {
	public static void main(String[] args) {

		HashSet<String> ironHash = new HashSet<>();
		
		ironHash.add("iron");
		ironHash.add("hulk");
		ironHash.add("captain");
		System.out.println(ironHash);
		
		Iterator<String> iter = ironHash.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//iter가 한번 다 처리를 하였기 때문에 다시 선언 해야함.
		iter = ironHash.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			if(str.equals("hulk")) {
				iter.remove();
				ironHash.add("hulkBest");
			}
		}
		System.out.println(ironHash);
		
		System.out.println("\n");
		HashSet<String> fruitHash = new HashSet<>();
		
		fruitHash.add("apple");
		fruitHash.add("banana");
		fruitHash.add("coconut");
		fruitHash.add("coconut");
		
		System.out.println("fruitHash의 개수 : "+fruitHash.size());
		//중복하용 불가 => coconut 하나가 빠지므로 size는 3
		
		Iterator<String> iter2 = fruitHash.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
	}
}

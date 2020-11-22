package Day037;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics001 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20); list.add(30);
		int total = 0;
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			total += iter.next();
		}
		System.out.println("평균 : " + total/list.size());
	}
}

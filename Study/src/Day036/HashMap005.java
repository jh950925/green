package Day036;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap005 {
	public static void main(String[] args) {
		int total =0;

		HashMap<String,Integer> map = new HashMap<>();
		map.put("first", new Integer(90));
		map.put("second", new Integer(88));
		map.put("third", new Integer(100));
		map.put("four", new Integer(72));
		map.put("five", new Integer(94));
		
		System.out.println("NAME\tSCORE");
		Iterator<Entry<String,Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,Integer> temp = iter.next();
			System.out.println("-------------");
			System.out.println(temp.getKey()+"\t"+temp.getValue());
			total += temp.getValue();
		}
		System.out.println("-------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + String.format("%.2f", (double)total/map.size()));
		System.out.println("최고점수 : " + Collections.max(map.values()));
		System.out.println("최저점수 : " + Collections.min(map.values()));
	}
}

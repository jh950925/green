package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap001 {
	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<>();
		
		map.put("스타", "혁재"); map.put("샤인", "지예"); map.put("큐티", "유진"); map.put("낄낄", "하늘"); map.put("GOD", "준홍");
		
		System.out.println("===========================\n"+"key\tVALUE"+"\n===========================");
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("\n\n===========================\n"+"key\tVALUE"+"\n===========================");
		Iterator<Entry<String, String>> iter2 = map.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<String, String> temp = iter2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
		
	}//end main
}//end class

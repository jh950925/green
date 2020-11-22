package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap006 {
	public static void main(String[] args) {
		int cnt=1;
		String[] data = {"A","D","A","D","B","D","A","D","E","C","B"};
		HashMap<String,Integer> map = new HashMap<>();
		/////////////////////////////////////////////////
		for(int i=0; i<data.length;i++) {
			if(!map.containsKey(data[i])) {
				map.put(data[i], cnt);
			}else {
				map.put(data[i],(int) map.get(data[i]) + 1);
			}
		}
		System.out.println();
		/////////////////////////////////////////////////
		Iterator<Entry<String,Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,Integer> temp = iter.next();
			System.out.print(temp.getKey()+" : ");
			for(int i=0; i<data.length;i++) {
				if(data[i].equals(temp.getKey())) {
					System.out.print("#");
				}
			}
			System.out.print(" ["+temp.getValue()+"]");
			System.out.println();
		}//end while
	}//end main
}//end class

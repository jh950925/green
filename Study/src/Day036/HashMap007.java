package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap007 {
	public static void main(String[] args) {
		//선언
		HashMap<Object, Integer> phoneBook = new HashMap<>();
		HashMap<Object, Object> group = new HashMap<>();
		int cnt=1;
		Object[][]data = new Object[][] {
			{"FRIENS","first","010-111-1111"}, //01 02 03
			{"FRIENS","second","010-222-2222"},//11 12 13
			{"FRIENS","third","010-333-3333"}, //21 22 23
			{"COMPANY","red","010-444-4444"},  //31 32 33
			{"COMPANY","green","010-555-5555"},//41 42 43
			{"COMPANY","blue","010-666-6666"}, 
			{"FAMILY","sally","010-7777-7777"},
			{"FAMILY","alpha","010-888-8888"},
		};
		////////////////////////////////////////////////////////////////
		for(int i=0; i<data.length;i++) {
			if(!phoneBook.containsKey(data[i][0])) {
				phoneBook.put(data[i][0], cnt);
			}else {
				phoneBook.put(data[i][0], (int)phoneBook.get(data[i][0])+cnt);
			}
		}
		System.out.println(phoneBook);
		
		System.out.println(group);

		///////////////////////////////////////////////////////////////////
		Iterator<Entry<Object, Integer>> iter = phoneBook.entrySet().iterator();
		Iterator<Entry<Object, Object>> iter2 = group.entrySet().iterator();
		for(int i=0; i<phoneBook.size();i++) {
			while(iter.hasNext()) {
			Entry<Object,Integer> temp = iter.next();
			System.out.println("======================= "+"* " +temp.getKey()+"["+temp.getValue()+"]" + " =======================");
			System.out.println();
//				while(iter2.hasNext()) {
//					Entry<Object, Object> temp2 = iter2.next();
//					System.out.println(temp2);
//				}
			}
		}
		//////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////
	}//end main
}//end class

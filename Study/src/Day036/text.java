package Day036;

import java.util.HashMap;
import java.util.Iterator;

public class text {

	public static void main(String[] args) {
		HashMap phoneBook = new HashMap();
		Object[][] data = new Object[][] {
			{"FRIENS", "first", "010-111-1111"},
			{"FRIENS", "second", "010-222-2222"},
			{"FRIENS", "third", "010-333-3333"},
			{"COMPANY", "red", "010-444-4444"},
			{"COMPANY", "green", "010-555-5555"},
			{"COMPANY", "blue", "010-666-6666"},
			{"FAMILY", "sally", "010-777-7777"},
			{"FAMILY", "alpha", "010-888-8888"}
		};
		
		for (int i=0; i<data.length; i++) { phoneBook.put(data[i][1], data[i]); }
		String[] str = new String[] {"FRIENS","COMPANY","FAMILY"};	
		HashMap cate = new HashMap();
		for(int i=0; i<str.length; i++) {
			int a = 1;
			for(int j=0; j<data.length; j++) {
				if (data[j][0].equals(str[i])) {
					if(a==1) {cate.put(str[i], 1); a=-1;}
					else {cate.put(str[i], (int)(cate.get(str[i]))+1);}}
			}}
				
		for(int i=0; i<str.length; i++) {
		System.out.println("=======================\n * " + str[i] + "[" + cate.get(str[i]) + "]\n=======================");
		Iterator<String> iter = phoneBook.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Object[] tmp = (Object[])phoneBook.get(key);
			if (tmp[0].equals(str[i])) {System.out.println(tmp[2] + "\t" + key);}}}
	}
}

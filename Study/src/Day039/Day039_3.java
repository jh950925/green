package Day039;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class JavaStd{
	private String id;
	private String name;
	public JavaStd() {
		super();
	}
	public JavaStd(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Day039_3 {
	public static void main(String[] args) {

		HashMap<String,String> std_list = new HashMap<>();
		
		std_list.put("std1111", "iron");
		std_list.put("std2222", "hulk");
		std_list.put("std3333", "captain");
		
		Iterator<Entry<String,String>> iter = std_list.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,String> temp  = iter.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
	}
}

package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";

		HashMap<String,String> map = new HashMap<>();
		map.put("danawa", "www.danawa.net");
		map.put("naver", "www.name_kid.com");
		map.put("daum", "www.daum_kidco.kr");
		
//		System.out.println(map);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("["+key+"]");
		}
		
		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
		System.out.print("\n사이트 키값을 입력하세요 : ");
		name = scanner.next();
		System.out.println();
		while(iter.hasNext()) {
			Entry<String,String> temp = iter.next();
			if(name.equals(temp.getKey())) {
				System.out.println("VALUE : " + temp.getValue());
			}
		}
	}
}

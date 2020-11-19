package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap002 {
	public static void main(String[] args) {
		String name="";
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		map.put("피구왕", "통키"); map.put("제빵왕", "김탁구"); map.put("요리왕", "비룡");

		System.out.println("===========\n"+"KING\tNAME"+"\n===========");
		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,String> temp = iter.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
		System.out.println("===========");
		System.out.println("KING의 정보를 제공중입니다.");
		System.out.print("이름을 입력하세요 > ");
		name = scanner.next();
		System.out.println();
		
		iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,String> temp = iter.next();
			if(name.equals(temp.getKey())) {
				System.out.println("ㅁ "+temp.getKey()+" : "+temp.getValue());
			}
		}
		System.out.println("KING은 : " +map.size()+"명");
	}
}

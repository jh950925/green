package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap000 {
	public static void main(String[] args) {
		//put, get, 
		HashMap<String,String> map = new HashMap<>();
		map.put("일","ONE"); map.put("이","TWO"); map.put("삼","THREE");
		System.out.println(map.get("일"));
		System.out.println(map.size());
		System.out.println(map.remove("삼")); 
		System.out.println(map); //{이=TWO, 일=ONE}
		
		System.out.println("===========================\n"+"key\tVALUE"+"\n===========================");
		Iterator<String> iter = map.keySet().iterator(); // 1.map에 key들 먼저 모으기 => 리스트로 만들기
		while(iter.hasNext()) { //2. 처리할 대상의 처리유무 : 키있어? 없어?
			String key = iter.next();//3.키 뽑아오기
			System.out.println(key+"\t"+map.get(key));
		}
		
		System.out.println("\n===========================\n"+"key\tVALUE"+"\n===========================");
		Iterator<Entry<String,String>> iter2 = map.entrySet().iterator(); // <Entry<키,값>>
		//1.mapdp <Entry<키,값>>을 모은다음 리스트로 만들기
		while(iter2.hasNext()) {
			Entry<String, String> temp = iter2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
	}//end main
}//end class

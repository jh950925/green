package Day035;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet000 {
	public static void main(String[] args) {

		//1. 다음 빈칸을 채우시오
		//1-1. 콜렉션프레임워크 핵심 인터페이스 : List, Set, Map 
		//1-2. List -특징 : 순서[O], 데이터 중복허용 [O] -사용가능 메서드 : add, get, size, remove 
		//1-3. Set  -특징 : 순서[X], 데이터 중복허용 [X] -사용하늑 메서드 : add, get(x), size, remove
		System.out.println("\n\n001.List");
		ArrayList<String> milks = new ArrayList<>();
		milks.add("WHITE"); milks.add("WHITE"); milks.add("CHOCO"); milks.add("BANAN");
		System.out.println("1-1 : " + milks);
		System.out.println("1-2 순서가 있기 때문에 : " + milks.get(0));
		System.out.println("1-3.개수 : " + milks.size());
		
		System.out.println("\n\n002.Set : 순서[X], 데이터 중복허용 [X]");
		HashSet<String> milks2 = new HashSet<>();
		milks2.add("WHITE"); milks2.add("WHITE"); milks2.add("CHOCO"); milks2.add("BANAN");
		System.out.println("2-1 : " + milks2); //중복허용이 안되기 때문에 WHITE 하나가 사라진다.
		System.out.println("2-2 꺼내오기에서 get 있나? => get을 이용해서 꺼내오는 방법이 X" );
		System.out.println("2-3.개수 : " + milks2.size());//중복 허용이 안되기 때문에 개수가 하나 줄어든다.
		System.out.println("2-4.삭제 : " + milks2.remove("BANAN")+"\t"+milks2);
		System.out.println("get 대신에 쓸 수 있는 것. 포함하고 있다 - contains : "+milks2.contains("WHITE"));
		
		
		Iterator<String> iter = milks2.iterator(); // 1. set에 들어가 있는 것 (요소, WHITE, CHOCO....)들 iter가 가리킨다.
												   // [1] iterator() : set모으기
		//				 iter = [WHITE,CHOCO,BANAN] => iter는 주소를 가지고 있다.
		while(iter.hasNext()) { //[2] hasNext 처리할 대상이 있는지 확인 true
			System.out.println(iter.next());// [3] 꺼내오기
		}
	}
}

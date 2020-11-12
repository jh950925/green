package Day033;

import java.util.Vector;

public class Collection001 {
	public static void main(String[] args) { 
		System.out.println("[001] Vector");
		System.out.println("[1-1]CRUD : add, get, size, remove ");
		
		//도라에몽 요술주머니
		Vector vec = new Vector();
		
//		vec.add(100);				vec.add(3.14);				vec.add("abc");  //오토박싱
		vec.add(new Integer(100));	vec.add(new Double(3.14));	vec.add(new String("abc"));
		System.out.println("1. 요술주머니 : " + vec);
		System.out.println("2. 요술주머니에 create - add 사용하기");
		System.out.println("3. get을 이용해서 데이터 꺼내오기 : " + vec.get(0));
		System.out.println("4. size는 갯수 : " + vec.size());
		System.out.println("5.remove는 삭제 : " + vec.remove(1)+ " / " + vec.remove("abc"));
		System.out.println(vec);
	}
}
 
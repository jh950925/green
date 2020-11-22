package Day024;

public class Class027 {
	public static void main(String[] args) {
		String str1 = "monday"; 
		String str2 = "monday";
		String str3 = new String("monday");
		
		for(int i =1; i<6; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("test1 : "+((str1 == str2)? "같다":"다르다"));
		System.out.println("test2 : "+((str1.equals(str2))? "같다":"다르다"));
		System.out.println("test3 : "+((str1 == str3)? "같다":"다르다"));
		System.out.println("test4 : "+((str1.equals(str3))? "같다":"다르다"));
		System.out.println(System.identityHashCode(str1)); //2111991224
		System.out.println(System.identityHashCode(str2)); //2111991224
		System.out.println(System.identityHashCode(str3)); //292938459
		//지역변수 : for문(i), str1, str2, str3, args
		//인스턴스 변수 : X
		//runtime data area에 저장되는 위치 지역변수 stack : str1,str2 | str3 : heap  
		//출력되는 결과는 str3같은 경우 주소값이 지정되지만 str1,2같은 경우는 값이 저장되기 때문이다.
	}	
}

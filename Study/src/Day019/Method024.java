package Day019;

import java.util.Arrays;

public class Method024 {

	public static void main(String[] args) {
		char [] abc = {'a','b','c'};
		System.out.println("배열명은 주소를 가짐 : "+ abc); 
		System.out.println("배열에 들어가 있는 값 확인 : "+abc[0]);
		System.out.println("abc의 주소 : "+System.identityHashCode(abc));
		System.out.println();
		UpperTo(abc);
		System.out.println(Arrays.toString(abc));
		
	}
	public static void UpperTo(char [] re_abc) {
		System.out.println("re_abc의 주소 : "+ System.identityHashCode(re_abc));
		for(char i = 0; i<re_abc.length;i++) {
			re_abc[i] -= 32;
		}
	}
}

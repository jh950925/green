package Day019;

import java.util.Arrays;

public class Method025 {

	public static void main(String[] args) {

		System.out.println("[TEST001] 배열값이 전달되는 경우");
		String [] name = {"아이언맨","헐크","캡틴"};
		disp(name[0],name[1],name[2]); 
		disp(name);
		disp_swipe(name);
		System.out.println();
		System.out.println("4. main에서 원본이 바뀌었는지 확인 : " + Arrays.toString(name));
		
	}
	public static void disp(String a, String b, String c) {
		System.out.println(a+", "+b+", "+c);
	}
	public static void disp(String [] name) {
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+", ");
		}
	}
	public static void disp_swipe(String [] name) { 
		String back = "";
		back = name[0];
		name[0]=name[1];
		name[1] = back;
	}
}

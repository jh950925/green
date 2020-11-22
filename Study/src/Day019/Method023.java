package Day019;

import java.util.Arrays;


public class Method023 {

	public static void main(String[] args) {

		System.out.println("[BASIC002] 배열값이 전달되는 경우");
		int [] su = {1,3,5};
		System.out.println();
		print(su[0],su[1]); 	// 1, 3
		System.out.println("1. call by value : 단순히 파라미터에서 값만 받고 메서드 안에서만 처리"
							+ "원본은 안바뀜" + Arrays.toString(su));
		print(su);
		System.out.println();
		System.out.println("1. call by reference : 주소를 따라가서 원본을 수정함"
				+ "원본은 바뀜" + Arrays.toString(su));
	}
	public static void print(int su, int su2) { //파라미터가 기본값이면 됨
		su+=100; //call by value는 값만 받고 메서드 안에서만 처리하고 원본은 안바뀜
		System.out.println("2.call by reference 메서드 만 : "+su+", "+su2);
		
	}
	
	public static void print(int [] su) {
		for(int i=0; i<su.length;i++) {
			su[i] +=10;
			System.out.print(su[i]+"\t");
		}
	}
}

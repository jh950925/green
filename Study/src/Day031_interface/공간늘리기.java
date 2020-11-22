package Day031_interface;

import java.util.Arrays;

public class 공간늘리기 {
	public static void main(String[] args) {
		//배열복사
		System.out.println("ver-1");
		int [] arr = {1,2,3};
		//임시공간 4개
		//1.공간한개 늘리기 _ 2.데이터를 그대로 가져오고
		int [] temp = new int[arr.length]; // (arr.length)3+1
		
//		System.out.println(원본,배열몇번째방쿠터,새로이,새로운배열몇번째,몇개);
		
		System.arraycopy(arr,0,temp,0,2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
//		System.out.println(원본,배열몇번째방쿠터,새로이,새로운배열몇번째,몇개);
		
		System.arraycopy(arr,0,temp,0,3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println();
		System.out.println("================================");
		System.out.println("\nver-2");
		char [] arr2 = {'a','b','c','d'};
		char [] temp2 = new char [arr2.length];
		
		System.arraycopy(arr2, 0, temp2, 0, 3); //arr2 1번째 방은 b부터 3개 b c d
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(temp2));
	}
}

package Day033;

import java.util.Arrays;

public class Collection000 {

	public static void main(String[] args) {
		//1. 문자열 배열 3개
		System.out.println("[ver-1]배열");
		String[] arr = new String[] {"Red","Green", "Blue"};
		
		//2.데이터를 더 늘리려고 함 - 문자열 배열을 5개로 늘리기
		System.out.println("[ver-2]배열을 5개로 늘리기");
		String [] temp = new String[5];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
		
		//3. 매번할때마다 배열의 갯수를 고려해야함. 
		System.out.println("[ver-3]Collention 프레임워크");
		System.out.println("- 배열은 매번 배열의 사이즈를 고려해야함.");
		System.out.println("- 사이즈를 고려 안해도 되는것이 콜렉션 프레임워크");
		

	} 

}

package Day019;

import java.util.Arrays;

public class Method022 {

	public static void main(String[] args) {

		System.out.println("1 : (" + print('A') +")"); 
		// 'A' 출력
		// 리턴값 : char / 파라미터 : char 

		System.out.println("2 : (" + print(10) +")"); 
		// '10' 출력
		// 리턴값 : int / 파라미터 : int
		
		int []arr = {1,2,3};
		// 11,12,13 출력
		// 리턴값 : / 파라미터 : 
//		System.out.println("3 : (" + print(10) +")");
		System.out.println("3-1 . 배열명은 주소를 가짐 : "+arr);
		System.out.println("3-2 . 배열에 들어가 있는 값 꺼내쓰기 : "+arr[0]);
		System.out.println("3-3 . arr의 주소" + System.identityHashCode(arr)); // 21111991224
		System.err.println();
		print(arr); // 리턴값 : void / 파라미터 : 배열
		System.out.println("3-8. 메인에서의 배열은 : " + Arrays.toString(arr));
//		System.out.println("3-9 : " + print(arr)); // 타입과 개수가 위와 동일하여 오류가 난다.
		
	}
	public static char print(char a) {
		return a;
	}
	public static int print(int a) {
		return a;
	}
	public static void print(int a[]){
		//주소 복사해서 가져옴
		System.out.println("3-4. 배열명은 뭘 갖고 있는지 확인 : "+a);
		System.out.println("3-5. 메서드 안 : "+System.identityHashCode(a));
		System.out.println("3-6. 값 : "+a[0]); //1
		a[0] =100; //주소를 참조해서 따라간 후 원본을 수정
		System.out.println("3-7. 메서드 안에서 값 바꿔보기 : "+Arrays.toString(a));
		
	}
}

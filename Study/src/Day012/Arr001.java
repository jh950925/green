package Day012;

public class Arr001 {

	public static void main(String[] args) {

		int []arr =  {1,2,3};
		// arr = [ 1 | 2 | 3 ];
		//   	arr[0]arr[1]arr[2]	★배열인덱스(순서,색인,첨자)는 0부터 시작
		System.out.println(arr[0] + "\t" + arr[1] + "\t" + arr[2]);
		
		int [] arr2 = {10,20,30};
		int [] arr3 = {1,2,3,4,5};
		int [] arr4 = {100,200,300};
		char [] arr5 = {'a','b','c'};
		
		for(int a=0; a<3; a++) {
			System.out.print(arr[a]+ "\t");
		}
		System.out.println();
		
		System.out.println("배열의 객수 : "+ arr.length);
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]+ "\t");
		}
		
	}

}

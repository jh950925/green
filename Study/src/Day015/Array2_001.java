package Day015;

public class Array2_001 {

	public static void main(String[] args) {
//		예) 빌딩 / 도시락
//		[0층][0-0호실][0-1호실][0-2호실]
//		[1층][1-0호실][1-1호실][1-2호실]
		
		
//		0층 [밥][멸ㅊ;][김치]
//		1층 [게란][소세지][돈까스]
		 
		int a = 10;				//공간 1개
		int [] arr = {1,2,3};	//공간 3개 빌려오기 
//		arr[0] 1이라는 데이터가 들어감
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
//		arr2[층][호실]
//		arr2[0][0]				-층은 0번째부터 / 호실도 0번째부터
		
//		1(0층 0호실), 2(0층 1호실), 3(0층 2호실)
//		4(1층 0호실), 5(1층 1호실), 6(1층 2호실)
		System.out.println("층 확인 : "+arr2.length);	//2
		System.err.println("2. 0층칸수 확인 : "+ arr2[0].length);	//3
		System.err.println("2. 0층칸수 확인 : "+ arr2[1].length);	//3
		System.out.println("======================");
		System.out.print(arr2[0][0]);
		System.out.print(arr2[0][1]);
		System.out.print(arr2[0][2]);
		System.out.println();
		
		System.out.print(arr2[1][0]);
		System.out.print(arr2[1][1]);
		System.out.print(arr2[1][2]);
		System.out.println();
		
		System.out.println("======================");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

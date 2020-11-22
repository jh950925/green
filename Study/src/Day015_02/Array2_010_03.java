package Day015_02;

public class Array2_010_03 {

	public static void main(String[] args) {

		int [][]arr = new int[5][5];
		int data = 1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = data++;
			}
		} 
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}

/*
 00 01 02 03 04		가로는 j   세로는 i
 30 31 32 33 05		5칸이 되면 밑으로 내리기
 23 43 44 34 10     5칸이 되면 왼쪽으로        
 22 42 41 40 11		5칸가는데 이미 있는 칸보다 작을때는 오른쪽
 21 20 14 13 12 	5칸가는데 이미 있는 칸보다 작을때는 내리기
					결론적으로 오른쪽 아래 왼쪽 위 오른쪽 아래 왼쪽 위 이런 순서대로 해야함 right down left up 이 순서를 계속 반복
					어디까지? 마지막은 숫자가 25이니까 arr[4][4]보다 작을때 arr[5][5].length
					그럼 이 조건문은 최대 arr[4][4]보다 작거나 같아야한다? 결론은 i<=5*5이건가.... 
*/


package Day015_02;

public class Test_ex_2 {

	public static void main(String[] args) {

		int [][] arr = new int [5][5];
		int k=1; // arr에 넣는 데이터 초기값
		int i =0;

		while(k<=5*5) {
			//++
			for(i=0; i<4; i++) {
				arr[0][i] = k;
				k++;
				System.out.println("1("+arr[0][i]+")");
			}	
			//++
			for(i=0;i<4;i++) {
				arr[i][4] = k;
				k++;
				System.out.println("2("+arr[i][4]+")");
			}
			//--  +1
			for(i=4;i>0;i--) {
				arr[4][i] = k;
				k++;
				System.out.println("3("+arr[4][i]+")");
			}
			//--
			for(i=4;i>0;i--) {
				arr[i][0] = k;
				k++;
				System.out.println("4("+arr[i][0]+")");
			}
			//++
			for(i=1;i<=3;i++) {
				arr[1][i] = k;
				k++;
				System.out.println("5("+arr[1][i]+")");
			}
			//++
			for(i=2;i<=3;i++) {
				arr[i][3] = k;
				k++;
				System.out.println("6("+arr[i][3]+")");
			}  
			//--
			for(i=2;i>=15;i--) {
				arr[3][i] = k;
				k++;
				System.out.println("7("+arr[3][i]+")");
			}
			//-- +1
			for(i=2;i>1;i--) {
				arr[i][1] = k;
				k++;
				System.out.println("8("+arr[i][1]+")");
			}
			//++
			for(i=1;i<3;i++) {
				arr[2][i] = k;
				k++;
				System.out.println("9{"+arr[2][i]+"}");
			}
		}
		
		//출력
		for(i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}//end main
}// class

/*
 00 01 02
 21 22 10
 20 12 11 
 */
/*
00 01 02 03 04		가로는 j   세로는 i
30 31 32 33 10		5칸이 되면 밑으로 내리기
24 43 44 34 11      5칸이 되면 왼쪽으로        
23 42 41 40 12		5칸가는데 이미 있는 칸보다 작을때는 오른쪽
22 21 20 11 13 		5칸가는데 이미 있는 칸보다 작을때는 내리기
					결론적으로 오른쪽 아래 왼쪽 위 오른쪽 아래 왼쪽 위 이런 순서대로 해야함 right down left up 이 순서를 계속 반복
					어디까지? 마지막은 숫자가 25이니까 arr[4][4]보다 작을때 arr[5][5].length
					그럼 이 조건문은 최대 arr[4][4]보다 작거나 같아야한다? 결론은 i<=5*5이건가.... 
*/

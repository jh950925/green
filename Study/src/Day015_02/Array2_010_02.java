package Day015_02;

public class Array2_010_02 {

	public static void main(String[] args) {

		int [][] da3= {{10,20,30,0},{40,50,60,0},{70,80,90,0},{0,0,0,0}};
		
		
		
		for(int i=0;i<da3.length-1;i++) {	
			for(int j=0;j<da3[i].length-1;j++) {
				da3[i][3] += da3[i][j];	//조건식 밑에
				da3[3][j] += da3[i][j]; //더하는 조건식 2개라서 2번 중첩되나봄 그런데 i가 1번 돌 동안 j도 다 돌고 i가 도는 거라서 2번 
//				System.out.println("da3 : ("+da3[i][j]+")"); //계산식이 2개라서 한번 빼줌?
				// j에다가 1빼면 da3[i][j] 한번 덜돌아서 우측 계산식 맞음 i에도 빼면 밑에 계산식도 일정한거같음
			}
		}
		for(int i=0; i<da3.length;i++) {
			for(int j=0;j<da3[i].length;j++) {
				System.out.print(da3[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}


//00  	 01 	02		03 //[i][3] 3이 밑으로 내려갈 수록 변하지 않는데 i만 변함
//10	 11		12		13
//20	 21		22		23
//30	 31		32		33 // i는 3으로 정이고 [j]만 변함

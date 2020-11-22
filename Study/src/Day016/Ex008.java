package Day016;

public class Ex008 {

	public static void main(String[] args) {

		int [] answer = {1,4,4,3,1,4,4,2,1,3,2}; //answer.length는 11개
		int [] counter = new int[4];			 //counter.length는 4개 
		
		for(int i=0; i<answer.length;i++) { //결국 counter[i]값은 answer[i]이 1일때는 answer 배열 다 읽어서 3번 올라가야함 2는 2번 3은 2분 4는 4번 그런데 ++이 증가되려면 초기값이 
			counter[answer[i]-1]++;// 1이 되야한다..? 그러면 answer[0]++이게 counter로 들어가면 되는건가.
//			System.out.print("("+counter[answer[i]-1]+")"+"\t");
		}// i-1은 counter방이 0~3이므로 직접적으로 값이 1~4인 answer에서 1씩 뺴서 증가시키는거임 방에서 
//		System.out.println();
		for(int i=0; i<counter.length;i++){
			System.out.print(i+1);
			for(int j=0;j<counter[i];j++){//.lnegth가 안먹는데 위에서 counter++ 자체를해서 개수가 되는건가봄
				System.out.print("*");//위에서 선언한거까지 가야함 j가 까지면 *을 꽉 채우게 되는듯.
			}
			System.out.println();
		}
		
	}

}
//	counter  1 	   -1 = counter[0];; 
//counter[answer[0]-1 = 1]++

/*
0이 출력되야 하니까 counter로 들어가고 그 별이 몇개인지 구하는게 answer로 푸는거
1
2	=>이거는
3	=>그냥 밑에 for에서 syso로 출력하면 되는데 그에 맞는 별표시가 같이 나오려면 i값은 1 2 3 4 이중 for문 써서 *을 표시한다??? 가로는 j(별) 세로는 i(숫자)
4
			System.out.print(counter[i]);
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		이렇게 쓰면
		0****
		0****
		0****
		0**** 나옴 counter배열에 값이 들어가야 함 1 2 3 4
*/
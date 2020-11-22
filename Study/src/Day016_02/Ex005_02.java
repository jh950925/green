package Day016_02;

public class Ex005_02 {

	public static void main(String[] args) {

		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i< ballArr.length;i++) {
			j = (int)(Math.random()*ballArr.length); //9개중에 랜덤으로 하나가 j에 저장
//			System.out.println("arr[i]:("+ballArr[i]+")");
			
			tmp = ballArr[i]; //tmp에 i가 증가될때다 순차저장
//			System.out.println("tmp:("+tmp+")");
			
			ballArr[i] = ballArr[j]; // ballArr[i]에 j값이 랜덤으로 뽑혀서 그 배열에 있는 숫자가 다시 저장
			//만약 i가 0이면 j는 0~9사이의 숫자가 들어오는데 그걸 저장(중복가능성 있음) 
//			System.out.println("arr[j]:("+ballArr[j]+")");
//			System.out.println();
			ballArr[j] = tmp; // 지금 tmp가 1~9인 배열저장되 있는데 그걸 다시 랜덤 저장
			//이 과정을 해줘야 tmp가 순차적으로 올라갈때마다 j에 다시 저장 
			//j가 아직 0인 상태이라고 치면 tmp가 0이되고 위에서 
			//tmp = ballArr[i]이 i값이 반복되어 이미 1이 되어야 하는데 그러기 위해서 다시 랜덤을 저장 시킨다. 그렇게 반복 금지
		}
		
		for(int i=0;i<ball3.length;i++) {
			ball3[i] = ballArr[i];  // ballArr[]에 쌓아놧던 값들을 ball3 공간3개짜리에 저장시킨다.
			System.out.println(ball3[i]);
		}
	}

}

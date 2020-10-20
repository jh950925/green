package Day016;

public class Ex005 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		int tmp = 0; //자리 복원
		int j=0;
		
		for(int i=0; i< ballArr.length;i++) {
			j = (int)(Math.random()*ballArr.length); 
			tmp = ballArr[i];	//tmp에 원래 있던 1~9를 순차적으로 넣는 코드
			ballArr[j] = ballArr[i];	// ballArr[j]가 랜덤으로 숫자를 뽑는데, i는 순서대로 들어가니까 i가 0일때는 j가 0~8일 수 있으니 맞는거에 집어넣음
			ballArr[j] = tmp;
		}
		
		for(int i=0;i<ball3.length;i++) {
			ball3[i] = ballArr[i];			//마지막에 ballArr[i]에 집어 넣은 값을 ball3으로 넣어주
			System.out.println(ball3[i]);
		}
	}

}

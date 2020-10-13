package Day010_02;

public class Ex004_T {

	public static void main(String[] args) {
	
		int box = 0;
		int i=0;
		for(i=1;box<100;i++) {	//box의 합이 100보다 작다면 계속반복해서 더하기
			//1.짝수라면 음수로 만들기	(i%2==1)? i : ((i*-1) or -i)
			//2.더하기
			box += (i%2==1) ? i : -i;
			System.out.println(i+"\t"+box);
			if(box>=100) {
				System.out.println("1+(-2)+3+(-4)+...=100이 되는 숫자는 : "+i);
			}
		}
		
	}

}

//		ver-1
//		box의 합이 100이 아니라면 계속 box에 숫자를 더해주세요


//		ver-2
//		box의 합이 100보다 작다면..
//			홀수는 그냥 더하기 만약홀수라면 num = (1%2==1) 1:1*-1; box+=num;
//			짝수는 -1곱하기			   num = (2%2==1) 1:1*-1; box+=num;


//		ver-3
//		for(int i=1; box<100; i++) {
//			홀수는 그냥 더하기 만약홀수라면 num = (1%2==1) 1:1*-1; box+=num;
//			짝수는 -1곱하기			   num = (2%2==1) 1:1*-1; box+=num;
//		}


//		ver-4
//		i의 값 확인!
package Day013;

public class Ex008 {

	public static void main(String[] args) {

		int max = -9;	//max
		int min = 0;	//min
		int su [] = {-3,-5,-1,-9,-7};
		int size = su.length;
		
//		1. 만약 a가 -3이 a보다 크다면 a 담기
/*		if(a<su[0]){
			a = su[0];
		}
*/
		
		for(int i=0;i<size;i++) {
			if(su[i]>max) {
				max=su[i];
			}else if(su[i]<min) {
				min=su[i];
			}
		}
		System.out.println("최대값 : "+max);	//왜 안나올까 -> 초기값이 0인데 다 음수라서?????????
		System.out.println("최소값 : "+min);	//0이 제일 큰 수라서 최소는 나옴
	}

}

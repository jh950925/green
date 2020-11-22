package Day013;

public class Ex005 {

	public static void main(String[] args) {

		int [] su = {-3,5,-1,9,-7};
		int a= 0;
		
		for(int i=0; i<su.length; i++) {
			if(su[i]<0) {
				a++;
			}
		}
		System.out.println("음수의 갯수는  "+ a + "개 입니다.");
	}

}

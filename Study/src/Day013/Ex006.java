package Day013;

public class Ex006 {

	public static void main(String[] args) {

		int [] su = {-3,5,-1,9,-7};
		int size = su.length;
		int a = 0;
		
		for(int i=0; i<size;i++) {
			if(su[i]>0) {
				if(su[i]%2!=0) {
					System.out.print("홀수는 : "+su[i]+"\t");
					a += su[i];
				}
			}
		}
		System.out.println("\n\n"+a+"개 입니다.");
		
	}

}

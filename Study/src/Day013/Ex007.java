package Day013;

public class Ex007 {

	public static void main(String[] args) {

		int su [] = {-3,-5,-1,-9,-7};
		int size = su.length;
		int a = 1;	//일단 다 1등으로 선언
		
		for(int i=0; i<size; i++) {
			if(su[4]<su[i]) {
				a++;
			}
		}
		System.out.println(a+"등 입니다.");
		
	}

}

package Day016;

public class Day016_3 {

	public static void main(String[] args) {
		int a = 1000;
		
		for(int i=1; i<3;i++) {
			for(int j=1;j<4;j++) {
				System.out.print(a+"\t");
				a += 1000;
			}
			System.out.println();
		}
			
	}

}

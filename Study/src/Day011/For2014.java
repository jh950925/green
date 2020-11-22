package Day011;

public class For2014 {

	public static void main(String[] args) {


		for (int i = 4; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		int i=4,j=i;
		while(i>=1) {
			while(j>0) {
				System.out.print("*");
				j--;
			}
			i--;
			j=i;
			System.out.println();
		}
		
		System.out.println("======================================");
		i=4;j=i;
		do {
			do {
				System.out.print("*");
				j--;
			}while(j>0);
			i--;
			j=i;
			System.out.println();
		}while(i>=1);
	
	}

}

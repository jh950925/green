package Day011;

public class For2012 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		int i=1,j=0;
		while(i<=4) {
			while(j<4) {
				System.out.print("*");
				j++;
			}
			i++;
			j=0;
			System.out.println();
		}
		
		System.out.println("======================================");
		i=1;j=0;
		do {
			do {
				System.out.print("*");
				j++;
			}while(j<4);
			i++;
			j=0;
			System.out.println();
		}while(i<=4);
	}

}

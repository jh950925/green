package Day011;

public class For2013 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		int i=1,j=0;
		while(i<=4) {
			while(j<i) {
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
			}while(j<i);
			i++;
			j=0;
			System.out.println();
		}while(i<=4);
	
		
	}

}

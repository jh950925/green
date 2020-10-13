package Day010;

public class Ex005 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		
		int i=0,j=0;
		while(i<11) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=0;
		}
		System.out.println("======================================");
		i=0;j=0;
		do {
			do {
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
			j=0;
		}while(i<11);
		
	}

}

package Day010;

public class For2003 {

	public static void main(String[] args) {
		System.out.println("=======for=======");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n=======while=======");
		int i=1,j=1;
		while(i<=5) {
			System.out.println();
			while(j<=5) {
				System.out.print(j);
				j++;
			}
			j=1;
			i++;
		}
		
		System.out.println("\n=======do while=======");
		i=1; j=1;
		do {
			System.out.println();
			do {
				System.out.print(j);
				j++;
			}while(j<=5);
			j=1;
			i++;
		}while(i<=5);
		
	}

}

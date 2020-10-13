package Day010;

public class For2004 {

	public static void main(String[] args) {
		System.out.println("========for========");
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("========while========");
		int i=1,j=0;
		while(i<=4) {
			while(j<i) {
				System.out.print(i);
				j++;
			}
			i++;
			j=0;
			System.out.println();
		}
		
		System.out.println("========do while========");
		i=1; j=0;
		do {
			do {
				System.out.print(i);
				j++;
			}while(j<i);
			i++;
			j=0;
			System.out.println();
		}while(i<=4);
	}

}

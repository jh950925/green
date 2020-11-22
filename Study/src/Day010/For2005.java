package Day010;

public class For2005 {

	public static void main(String[] args) {
		System.out.println("========for========");
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("========while========");
		int i = 4, j = i;
		while (i > 0) {
			while (j > 0) {
				System.out.print(i);
				j--;
			}
			i--;
			j = i;
			System.out.println();
		}
		System.out.println("========do while========");
		i = 4; j = i;
		do {
			do {
				System.out.print(i);
				j--;
			}while (j > 0);
			i--;
			j = i;
			System.out.println();
		}while (i > 0);
	}

}

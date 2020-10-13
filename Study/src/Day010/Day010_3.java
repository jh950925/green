package Day010;

public class Day010_3 {

	public static void main(String[] args) {
		int i = 0;

		System.out.println("[for]");
		for (i = 1; i < 6; i++) {
			System.out.print(" " + i);
		}

		System.out.println("\n");
		System.out.println("[while]");
		i = 1;
		while (i < 6) {
			System.out.print(" " + i);
			i++;
		}

		System.out.println("\n");
		System.out.println("[do while]");
		i = 1;
		do {
			System.out.print(" " + i);
			i++;
		} while (i < 6);

		System.out.println("");
		System.out.println("\n======역순======");
		System.out.println("");

		System.out.println("[for]");
		for (i = 5; i > 0; i--) {
			System.out.print(" " + i);
		}

		System.out.println("\n");
		System.out.println("[while]");
		i = 5;
		while (i > 0) {
			System.out.print(" " + i);
			i--;
		}

		System.out.println("\n");
		System.out.println("[do while]");
		i = 5;
		do {
			System.out.print(" " + i);
			i--;
		} while (i > 0);
	}

}

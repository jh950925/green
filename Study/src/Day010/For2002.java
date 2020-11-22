package Day010;

public class For2002 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 2; i <= 4; i++) {
			System.out.println("[" + i + "단]");
			for (int j = 1; j <= 9; j++) {
				num = i * j;
				System.out.println("" + i + "*" + j + "=" + (num));
			}
		}
		System.out.println("==================\n");

		num = 0;
		int i = 2;
		int j = 1;
		while (i <= 4) {
			System.out.println("[" + i + "단]");
			while (j <= 9) {
				num = i * j;
				System.out.println("" + i + "*" + j + "=" + (num));
				j++;
			}
			j = 1;
			i++;
		}
		System.out.println("==================\n");

		num = 0;
		i = 2;
		j = 1;
		do {
			System.out.println("[" + i + "단]");
			do {
				num = i * j;
				System.out.println("" + i + "*" + j + "=" + (num));
				j++;
			} while (j <= 9);
			j = 1;
			i++;
		} while (i <= 4);
	}

}

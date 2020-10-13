package Day011_02;

public class For2009_02 {

	public static void main(String[] args) {
		int i = 0, j = 1, sum = 0;
		for (i = 1; i < 11; i++) {
			for (j = j; j < 101; j++) {
				if (j / 10 == i) {
					sum += j;
					System.out.print(j + "=" + sum + "\n");
					j += 1;
					break;
				} else {
					System.out.print(j + "+");
				}
				sum += j;
			}
			sum = 0;
		}
	}

}

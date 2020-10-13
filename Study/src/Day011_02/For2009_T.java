package Day011_02;

public class For2009_T {
	public static void main(String[] args) {

		for (int change = 1; change < 101; change += 10) {
			int sum = 0;
			int start = change;
			int end = start + 9;
			for (int i = start; i < end; i++) {
				if (i == start) {
					System.out.print(i + "+...+");
				} else if (i == end) {
					System.out.print(i);
				}
				sum += i;
			}
			System.out.println("=" + sum);
		}
	}
}

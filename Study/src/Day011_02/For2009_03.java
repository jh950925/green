package Day011_02;

public class For2009_03 {

	public static void main(String[] args) {
		int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (i % 10 == 0) {
                System.out.println(i - 9 + "+....+" + i + " = " + sum);
                sum = 0;
            }
        }
	}

}

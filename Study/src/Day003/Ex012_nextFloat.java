package Day003;

import java.util.Scanner;

public class Ex012_nextFloat {

	public static void main(String[] args) {
		
		float f1 = 3.14f;
		double dou = 3.14;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. float자료형 입력받기 : ");
		f1 = scanner.nextFloat();

		
		System.out.print("2. double자료형 입력받기 : ");
		dou = scanner.nextDouble();
		
		System.out.print(f1 + "\t" + dou);

	}

}

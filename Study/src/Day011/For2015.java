package Day011;

public class For2015 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 2; j < 5; j++) {
				num = i * j;
				System.out.print(" " + j + "*" + i + "=" + (num));
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 5; j < 8; j++) {
				num = i * j;
				System.out.print(" " + j + "*" + i + "=" + (num));
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i < 4; i++) {
			for (int j = 8; j < 10; j++) {
				num = i * j;
				System.out.print(" " + j + "*" + i + "=" + (num));
			}
			System.out.println();
		}
		
		
		
//		System.out.println("\n ===========================");
//		num = 0; int i=1,j=2;
//		while(i < 4) {
//			while(j<5) {
//				num = i * j;
//				System.out.print(" " + j + "*" + i + "=" + (num));
//				j++;
//			}
//			i++;
//			j=2;
//			System.out.println();
//		}
//		System.out.println("\n");
//		num = 0; i=1; j=5;
//		while(i < 4) {
//			while(j<8) {
//				num = i * j;
//				System.out.print(" " + j + "*" + i + "=" + (num));
//				j++;
//			}
//			i++;
//			j=5;
//			System.out.println();
//		}
//		
//		System.out.println("\n ===========================");
//		
//		num = 0; i=1; j=2;
//		do{
//			do {
//				num = i * j;
//				System.out.print(" " + j + "*" + i + "=" + (num));
//				j++;
//			}while(j<5);
//			i++;
//			j=2;
//			System.out.println();
//		}while(i < 4);
//		
//		num = 0; i=1; j=5;
//		System.out.println();
//		do {
//			do {
//				num = i * j;
//				System.out.print(" " + j + "*" + i + "=" + (num));
//				j++;
//			}while(j<8);
//			i++;
//			j=5;
//			System.out.println();
//		}while(i < 4);
	}

}

package Day011;

public class Day011_3 {

	public static void main(String[] args) {
		System.out.println("===for문===");
		for(int i =1; i<=3; i++) {
			System.out.print("HI"+i+" ");
		}
		System.out.println();
		System.out.println("===while문===");
		int i=1;
		while(i<=3) {
			System.out.print("HI"+i+" ");
			i++;
		}
		System.out.println();
		System.out.println("===do while문===");
		i=1;
		do {
			System.out.print("HI"+i+" ");
			i++;
		}while(i<=3);
	}

}

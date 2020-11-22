package Day020;

public class Day020_1 {

	public static void main(String[] args) {

		for(int i=1; i<4; i++) {
			System.out.print("class"+i+"\t");
		}
		System.out.println();
		int i=1;
		while(i<4) {
			System.out.print("class"+i+"\t");
			i++;
		}
		System.out.println();
		i=1; 
		do {
			System.out.print("class"+i+"\t");
			i++;
		}while(i<4);
	}

}

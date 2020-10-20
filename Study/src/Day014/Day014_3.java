package Day014;

public class Day014_3 {

	public static void main(String[] args) {

		for(int i=110;i<140;i+=10) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int i =110;
		while(i<140) {
			System.out.print(i+"\t");
			i+=10;
		}
		System.out.println();
		i =110;
		do {
			System.out.print(i+"\t");
			i+=10;
		}while(i<140);
	}

}

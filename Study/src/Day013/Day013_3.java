package Day013;

public class Day013_3 {

	public static void main(String[] args) {

		int a=0, b=100, c=100;
		
		for(a=100;a<400;a+=100) {
			System.out.print(a+"\t");
		}
		System.out.println();
		while(b<400) {
			System.out.print(b+"\t");
			b+=100;
		}
		System.out.println();
		do {
			System.out.print(c+"\t");
			c+=100;
		}while(c<400);
		
	}

}

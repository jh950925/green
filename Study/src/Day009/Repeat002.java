package Day009;

public class Repeat002 {

	public static void main(String[] args) {
		System.out.println("1.번 (for)");
		//for
		for(int a=1;a<6;a++) {
			System.out.print(a);
		}
		System.out.println();
		//while
		int a=1;	
		while(a<6) {
			System.out.print(a);
			a++;
		}
		System.out.println();
		//do while
		a =1;
		do {
			System.out.print(a);
			a++;
		}while(a<6);
		System.out.println("\n==================");
		System.out.println("2.번 (while)");
		//for
		for(int b=5;b>0;b--) {
			System.out.print(b);
		}
		System.out.println();
		//while
		int b=5;	
		while(b>0) {
			System.out.print(b);
			b--;
		}
		System.out.println();
		//do while 
		b =5;
		do {
			System.out.print(b);
			b--;
		}while(b>0);
		System.out.println("\n==================");
		System.out.println("3.번 (do while)");
		//for
		for(int c=1;c<4;c++) {
			System.out.print("JAVA"+c+" ");
		}
		System.out.println();
		//while
		int c=1;	
		while(c<4) {
			System.out.print("JAVA"+c+" ");
			c++;
		}
		System.out.println();
		//do while
		c =1;
		do {
			System.out.print("JAVA"+c+" ");
			c++;
		}while(c<4);
	}

}

package Day010;

public class For2001 {

	public static void main(String[] args) {

		for(int i=1;i<3;i++) {
			System.out.println("["+i+"층]");
			
			for(int j=1;j<4;j++) {
				System.out.println(""+j+"호실");
			}
			System.out.println();
		}
		
		System.out.println("=======================\n");
		int i=1,j=1;
		while(i<3) {
			System.out.println("["+i+"층]");
			while(j<4) {
				System.out.println(""+j+"호실");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		
		System.out.println("=======================\n");
		i=1; j=1;
		do {
			System.out.println("["+i+"층]");
			do {
				System.out.println(""+j+"호실");
				j++;
			}while(j<4);
			System.out.println();
			i++;
			j=1;
		}while(i<3);
	}

}

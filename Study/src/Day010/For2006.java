package Day010;

public class For2006 {

	public static void main(String[] args) {
		System.out.println("========for========");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==i) {
					System.out.print("@"+"("+i+","+j+")");
				}else {
					System.out.print("#"+"("+i+","+j+")");
				}
			}
			System.out.println();
		}
		
		System.out.println("========while========");
		int i=1, j=1;
		while(i<=4){
			while(j<=4) {
				if(j==i) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
				j++;
			}
			i++;
			j=1;
			System.out.println();
		}	
		
		System.out.println("========do while========");
		i=1; j=1;	
		do {
			do {
				if(j==i) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
				j++;
			}while(j<=4);
			i++;
			j=1;
			System.out.println();
		}while(i<=4);
		
	}
}



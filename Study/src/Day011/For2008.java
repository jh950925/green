package Day011;

public class For2008 {

	public static void main(String[] args) {

		int sum= 1;
		for(int i=4;i>=1;i--) {
			System.out.print(i);
			if(i>1) {
				System.out.print("*");				
			}else {
				System.out.print(" = ");
			}
			sum=sum*i;
		}
		System.out.print(sum);
		
		System.out.println();
		sum=1; int i=4;
		while(i>=1){
			System.out.print(i);
			if(i>1) {
				System.out.print("*");				
			}else {
				System.out.print(" = ");
			}
			sum=sum*i;
			i--;
		}
		System.out.print(sum);
		
		System.out.println();
		sum=1; i=4;
		do {
			System.out.print(i);
			if(i>1) {
				System.out.print("*");				
			}else {
				System.out.print(" = ");
			}
			sum=sum*i;
			i--;
		}while(i>=1);
		System.out.print(sum);
	}

}

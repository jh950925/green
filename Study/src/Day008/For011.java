package Day008;

public class For011 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum += i;
				System.out.print(i);
				if(i<10){				
					System.out.print("+");	
				}else {
					System.out.print("=");
				}
			}
		}
		System.out.println(sum);
		
	}

}

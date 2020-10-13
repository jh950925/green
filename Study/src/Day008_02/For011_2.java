package Day008_02;

public class For011_2 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum += i;
				System.out.print(i);
				switch(i) {
				case 10 : 
					System.out.print("=");break;
				default : 
					System.out.print("+");
				}
			}
		}
		System.out.println(sum);
	}

}
